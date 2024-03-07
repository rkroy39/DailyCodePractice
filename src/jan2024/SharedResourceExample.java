package jan2024;

import java.util.Scanner;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class SharedResourceExample {
 // Shared variable among threads
 private static int sharedCounter = 0;

 public static void main(String[] args) throws InterruptedException {
     // Main thread
     System.out.println("Main thread starts.");
Scanner sc=new Scanner(System.in);
String a=sc.next();
     // Create two threads
     Thread thread1 = new Thread(new MyRunnable());
     Thread thread2 = new Thread(new MyRunnable());

     // Start the threads
     thread1.start();
     //thread1.join();
     thread2.start();

     // Wait for threads to finish
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // Display final shared counter value
     System.out.println("Main thread ends. Shared counter: " + sharedCounter);
 }

 // Runnable implementation representing a thread
 static class MyRunnable implements Runnable {
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             // Increment the shared counter
             System.out.println(Thread.currentThread().getName() + ": Counter = " + sharedCounter);
             sharedCounter++;
             System.out.println(Thread.currentThread().getName() + ": Counter = " + sharedCounter);
         }
     }
 }
}
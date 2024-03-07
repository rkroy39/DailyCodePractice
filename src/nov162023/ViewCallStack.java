package nov162023;

public class ViewCallStack {
	
	
//public static void main(String[] args) {
//	 int result = factorial(5);
//     System.out.println("Factorial: " + result);
//}
//
//public static int factorial(int n) {
//    // Base case
//    if (n == 0 || n == 1) {
//        return 1;
//    } else {
//        // Recursive call
//        return n * factorial(n - 1);
//    }
//}


public static void main(String[] args) {
    int n = 10; // You can change this to get a different Fibonacci sequence length
    System.out.println("Fibonacci Sequence:");
    //for (int i = 0; i < n; i++) {
        System.out.print(fibonacci(2) + " ");
   // }
}

public static int fibonacci(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
}

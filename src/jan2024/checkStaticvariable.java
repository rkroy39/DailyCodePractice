package jan2024;

public class checkStaticvariable {
	public static int testValue=1;

public static void main(String[] args) {
//	checkStaticvariable c= new checkStaticvariable();
//	c.print();
	print();
	
}
static void print() {
	System.out.println("testValue by print method"+testValue);
	testValue++;
	display();
}
static void display() {
	testValue++;
	System.out.println("testValue by display method"+testValue);
	
}
}

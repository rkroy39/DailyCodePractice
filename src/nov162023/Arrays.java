package nov162023;



public class Arrays {

	
	//1 Java Program to copy all elements of one array into another array
	public static void copyAllElements(){
		
		int array1[]= {1,2,3,5,4,6,7,89,5,4};
		int len=array1.length;
		int array2[]=new int[len];
		
	for(int i=0;i<len;i++) {
		array2[i]=array1[i];
	}
	for(int i=0;i<len;i++) {
		System.out.print(array2[i]+",");
	}
	}
	
	
	
	//2. Java Program to find the frequency of each element in the array
	public static void getFrequency() {
		int arrayOfNum[]= {1,1,2,2,3,4,4,4,4,4,4,5,0};
		int newarray[]=new int[arrayOfNum.length];
	
		for(int i=0;i<arrayOfNum.length;i++) {
			int count=1;
		for(int j=i+1;j<arrayOfNum.length;j++) {
		
		if(arrayOfNum[i]==arrayOfNum[j]) {
			count++;
			
		}
		
		
		}
		
		
			System.out.println("Count of "+arrayOfNum[i]+" is"+count);
	}
	}
	//	int arrayOfNum[]= {1,1,2,2,3,4,4,4,4,4,4,5,0};
	public static int[] getUniqueElem(int arrayOfNum[]) {
		int distint[]=new int[arrayOfNum.length];
		for(int i=0;i<arrayOfNum.length;i++) {
			for(int j=i+1;j<arrayOfNum.length;j++)
			if(arrayOfNum[i]!=arrayOfNum[j]) {
				distint[i]=arrayOfNum[i];
			}
		}
		for(int i=0;i<distint.length;i++)
		System.out.print(distint[i]+",");
		return distint;
		
	}
	public static void main(String[] args) {

		//copyAllElements();
		getFrequency();
		//int arrayOfNum[]= {1,1,2,2,3,4,4,4,4,4,4,5,0};
		//getUniqueElem(arrayOfNum);
	}




	
}

package nov162023;

public class RotateArray {

	static void reverseArrayByDigit(int arr[],int shift) throws Exception {
		
		int array1[]= arr;
		int lenOfarray1=array1.length;
		int array2[]=new int[lenOfarray1];
		int lenOfarray2=array2.length;
		 int shiftBydigit=shift;
		 if(shiftBydigit>lenOfarray1) {
			  throw new Exception ("shift is greater than length of array");
		 }
		int storeArrayData[]=new int[shiftBydigit];
		System.out.println("Original Array");

		for(int j=0;j<array1.length;j++) {
			System.out.print(array1[j]);
		}
		for(int i=0;i<shiftBydigit;i++) {
			storeArrayData[i]=array1[i];
		}	

		int i=shiftBydigit;
			for(int j=0;j<lenOfarray1-shiftBydigit;j++) {
				array2[j]=array1[i];
			if(i!=lenOfarray1-1)	i++;
			}
			
		
		
	
		int partial=array2.length-shiftBydigit;
		i=0;
		for(int k=partial;k<array2.length;k++) {
			array2[k]=storeArrayData[i];
			i++;
		}
		System.out.println();
		System.out.println("Reversed Array by Shifting "+shiftBydigit+" digits");
		for(int j=0;j<array2.length;j++) {
			System.out.print(array2[j]);
		}
		
	}

	
	public static void main(String[] args) throws Exception {

		int a[]= {5,6,1,2,3,6};
		int shift =4;
		reverseArrayByDigit(a, shift);
		
		
}
}
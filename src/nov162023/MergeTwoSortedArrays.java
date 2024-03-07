package nov162023;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] array1= {2,4,8,9,10};
		int[] array2= {-5,-1,6,7,15,20,30,50,60,90,100,110};
      int mergedArray[]=mergeTwoArrays(array1,array2);
      for(int a:mergedArray) {
    	  
      System.out.print(a);
      System.out.print(",");
      }
	}

	private static int []  mergeTwoArrays(int[] array1, int[] array2) {
		
		int lengthOfNewArray=(array1.length+array2.length);
		int []array3=new int [lengthOfNewArray];
		int i=0;
		int j=0;
		int k=0;
			while(i<array1.length && j<array2.length) {
				if(array1[i]<array2[j]) {
				array3[k]=array1[i];
				i++;}
			else {
				array3[k]=array2[j];
				j++;}
				k++;
			}

if(i<j) {
	while(i<array1.length) {
	array3[k]=array1[i];
	i++;k++;
	}
}
if(j<i) {
	
	while(j<array2.length) {
	array3[k]=array2[j];
	j++;k++;
	}
}
return array3;
		
	}
	
}

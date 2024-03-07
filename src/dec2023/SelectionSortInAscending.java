package dec2023;

public class SelectionSortInAscending {

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[]arr= {10,12,20,5,1,0,50,30};
		sort(arr);
		for(int a:arr) {
		System.out.print(a+",");
		}
	}

	
}

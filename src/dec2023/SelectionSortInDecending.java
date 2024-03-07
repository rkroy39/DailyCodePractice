package dec2023;

public class SelectionSortInDecending {

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			i=7;
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,10,20,50,100,112};
	sort(arr);
	for(int a:arr) {
		System.out.print(a+",");
	}
}

	
}

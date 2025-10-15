package array;

public class Sort {

	public static void main(String[] args) {
		
		int arr[]= {5,9,3,95,32,11,2,44,7};
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

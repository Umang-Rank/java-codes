package array;

public class CheckNum {
	public static void main(String[] args) {
		int arr[]= {-1,20,64,-23,9,73,2,-13,44,-99};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]+" : Positive");
			}else {
				System.out.println(arr[i]+" : Negative");
			}
		}
	}

}

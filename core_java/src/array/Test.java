package array;

public class Test {
	public static void main(String[] args) {
		int arr[] = {5,21,13,44,1};
		
//		for printing array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
//		for reverse order
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
		int max=0;
//		for finding maximum from array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("maximum number : "+max);
		
		int min=arr[0];
//		for minimum number
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minimum no : "+min);
		
//		for sum of all elements
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all no : "+sum);
		System.out.println();
		
		
	}

}

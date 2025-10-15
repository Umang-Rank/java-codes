package array;

public class CheckPrime {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				System.out.println(arr[i]+" : not prime");
				continue;
			}
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
				}
			if(count==2) {
				System.out.println(arr[i]+" : prime");
			}else {
				System.out.println(arr[i]+" : not prime");
			}
		}
	}

}

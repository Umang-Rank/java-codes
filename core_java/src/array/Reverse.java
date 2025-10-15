package array;

public class Reverse {
	
	public static void main(String[] args) {
		int arr[]= {98,374,1034,29,9258,2,39,9,20374};
		
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i];
			int rev = 0;
			int rem;
			while(temp>0) {
				rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}
			System.out.println(arr[i]+" : "+rev);
		}
	}

}

package array;

public class Digits {
	
	public static void main(String[] args) {
		
	int arr[]= {3,245,936,28270,23,13,23,34091};
	
		for(int i=0;i < arr.length;i++) {
			int digit=0;
			int temp=arr[i];
			while(temp>0) {
				digit++;
				temp=temp/10;
			}
			System.out.println(arr[i]+" : "+digit+" digits");
		}
	}
}

package Loops;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		int sumOdd=0,sumEven=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("sum of even digits : "+sumEven);
		System.out.println("sum of odd digits : "+sumOdd);
	}

}

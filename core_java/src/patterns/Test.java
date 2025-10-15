package patterns;

public class Test {
	public static void main(String[] args) {
//		****
//		****
//		****
//		****
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		*
//		**
//		***
//		****
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		****
//		***
//		**
//		*
		
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		   *
//		  **
//		 ***
//		****
		
		for(int i=1;i<=4;i++) {
			for (int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		****
//		 ***
//		  **
//		   *
		
		for(int i = 1;i<=4;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		1
//		12
//		123
//		1234
//		12345
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
//		1
//		22
//		333
//		4444
//		55555
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
//		1
//		23
//		456
//		78910
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println();
		
//		A
//		AB
//		ABC
//		ABCD
		char ch='A';
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		System.out.println();
		
//		A
//		BB
//		CCC
//		DDDD
		
		ch='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
		System.out.println();
	}
}

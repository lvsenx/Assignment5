package assignment5;

public class question13 {

	public static void main(String[] args) {
		int rows=8;
		int columns=8;
		
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=8;j++) {
				System.out.print("W");
				System.out.print("B");
			}
			System.out.println();
			for(int j=1;j<=8;j++) {
				System.out.print("B");
				System.out.print("W");
			}
			System.out.println();
		}

	}

}

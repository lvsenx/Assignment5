package assignment5;

public class question8 {

	public static void main(String[] args) {
		int upperBound=10;
		int i=1,sum=0;
		while( i<= upperBound) {
			if(i<upperBound) {
			System.out.print(i+"+");
			sum=i*(i+1)/2;
			i++;
			}else {
				System.out.print(i);
				i++;
			}
			
		}
		System.out.println("="+sum);
	}

}

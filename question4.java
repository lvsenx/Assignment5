package assignment5;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int num= scan.nextInt();
		
		while(num*10<=100) {
			System.out.println(num*10+", ");
			num++;
		}
	}

}

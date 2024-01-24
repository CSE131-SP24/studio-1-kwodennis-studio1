package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner in = new Scanner(System.in);
		
		System.out.print("What year? ");
		int n1 = in.nextInt();
		
		boolean leapYear = 	((n1 % 4 == 0) && (n1 % 100 != 0)) || (n1 % 400 == 0);      
		System.out.println(n1 + " Is a leap year: " + leapYear);

	}

}

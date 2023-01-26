package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year;
		System.out.println("What is the year?: ");
		year = in.nextInt();
		boolean leapYearc1 = (year % 4 == 0);
		boolean leapYearc2 = (year % 100 != 0);
		boolean leapYearc3 = (year % 400 == 0);
		boolean leapYear = ((leapYearc1 && leapYearc2) || leapYearc3);
		System.out.println("Year " + year + " is a leap year: " + leapYear);
		
		
		
		
		// TODO Auto-generated method stub

	}

}

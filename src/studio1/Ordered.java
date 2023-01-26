package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean increase = x < y && y < z; 
		boolean decrease = x > y && y > z;
		boolean isOrdered = increase || decrease; 
		System.out.println(isOrdered);
		
		// x || y if one of other is true 
		// x && y if both are true
		// x < y && y < z
	}

}

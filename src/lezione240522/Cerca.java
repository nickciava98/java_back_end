package lezione240522;

import java.util.Scanner;

public class Cerca {
	static int input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("(in) [num]> ");
		int num = scanner.nextInt();
		
		scanner.close();
		
		return num;
	}
	
	static boolean search(int num, int[] nums) {
		for (int i = 0; i < nums.length; i++) 
			if (num == nums[i]) 
				return true;
		
		return false;
	}
	
	public static void main() {
		int[] nums = 
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		if (search(input(), nums)) 
			System.out.println("(out) [pres]> presente");
		
		else
			System.out.println("(out) [pres]> assente");
	}
}

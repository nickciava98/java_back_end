package lezione250522;

import java.util.Scanner;

public class UgualiConsecutivi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("(in) [nums_" + i + "]> ");
			nums[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < nums.length; i++) 
			if (i - 1 >= 0)
				if (nums[i] == nums[i - 1]) 
					System.out.println(
							"(out) [nums_" + i + " = nums_" + (i - 1) + "]> " + nums[i]);
	}
}

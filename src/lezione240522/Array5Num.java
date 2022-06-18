package lezione240522;

import java.util.Scanner;

public class Array5Num {
	static void input(int[] nums, int dim) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("(in) [nums_" + i + "]> ");
			nums[i] = scanner.nextInt();
		}
		
		scanner.close();
	}
	
	static void output(int[] nums) {
		System.out.print("(out) [nums]> ");
		
		for (int i = nums.length - 1; i >= 0; i--) {	
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("(in) [dim]> ");
		int dim = scanner.nextInt();
		
		scanner.close();
		
		int[] nums = new int[dim];
		
		input(nums, dim);		
	}
}

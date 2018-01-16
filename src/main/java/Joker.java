

import java.util.HashMap;
import java.util.Map;

public class Joker {

	public static void main(String[] args) {
		// System.out.println(factorialRecursive(5));

		// System.out.println(isPalindrome("bab ddd"));

		int[] a = { 0, 1, 2, 4, 5 };
		System.out.println(missingNumber(a));
	}

	public static int factorialRecursive(int num) {
		if (num == 0 || num == 1)
			return 1;
		if (num < 0)
			throw new IllegalArgumentException();

		return num * factorialRecursive(num - 1);
	}

	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}

		return true;
	}

	public static int missingNumber1(int[] nums) {

		int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}

		return xor ^ i;
	}

	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;

		return (nums.length * (nums.length + 1)) / 2 - sum;
	}

}

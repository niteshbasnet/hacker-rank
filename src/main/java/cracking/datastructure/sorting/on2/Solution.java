package cracking.datastructure.sorting.on2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public void toLowerCase() {
		String input = "What is your name? I am Nitesh Basnet.";

		int diff = 'a' - 'A';
		char[] charArray = input.toCharArray();
		StringBuilder solution = new StringBuilder();
		for (char c : charArray) {
			if (c >= 'A' && c <= 'Z') {
				solution.append((char) (c + diff));
			} else
				solution.append(c);
		}
		System.out.println("- " + solution);
	}

	public void reverseString() {
		String test = "Hello!! my name is Nitesh Basnet.";
		char[] charArray = test.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		System.out.println("- " + String.valueOf(charArray));
	}

	public void swapWithoutThirdVariable() {
		int a = 2, b = 3;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("- a::" + a);
		System.out.println(" b::" + b);
	}

	public void sumOfTwoIntegers() {
		int a = 2, b = 3;
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.println("- " + a);

	}

	public void sequenceOfNumbersToSum(int sum, int count) {
		int i = 1;
		ArrayList<String> result = new ArrayList<String>();
		while (result.size() != count) {
			int e = sum - i;
			result.add("(" + i + "," + e + ")");
			i++;
		}
		System.out.println("Result:: " + result.toString());
	}

	public List<List<Integer>> subsets(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, 0, target);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start, int target) {
		if (target > 0) {
			for (int i = start; i < nums.length && target >= nums[i]; i++) {
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, i, target - nums[i]);
				tempList.remove(tempList.size() - 1);
			}
		} else if (target == 0) {
			list.add(new ArrayList<Integer>(tempList));
		}
	}

	public void reverseLinkedList() {

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.toLowerCase();
		solution.reverseString();
		solution.swapWithoutThirdVariable();
		solution.sumOfTwoIntegers();
		// solution.sequenceOfNumbersToSum(13, 3);

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println((solution.subsets(nums, 3)));
	}

}

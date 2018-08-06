package cracking.datastructure.sorting.on2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cracking.datastructure.linkedlist.core.Node;
import cracking.datastructure.trees.BinarySearchTree;
import cracking.datastructure.trees.TreeNode;

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

	public Node reverseLinkedList(Node head) {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node temp = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public void angleBetweenHourMinHands(double hrs, double mins) {
		double hrsAngle = 0.5D * (hrs * 60);
		double minsAngle = 6 * mins;
		double angle = Math.abs(hrsAngle - minsAngle);
		angle = Math.min(angle, 360 - angle);
		System.out.println("Angle between hrs and mins::" + angle);

	}

	public void insertIntoSortedArray(int val, int[] a, int n, int capacity) {
		if (n > capacity) {
			return;
		}
		int i;
		for (i = 0; i < a.length - 1; i++) {
			if (a[i] > val)
				break;
		}

		for (int j = a.length - 2; j >= i; j--) {
			a[j + 1] = a[j];
		}

		a[i] = val;

		for (int j = 0; j < n + 1; j++) {
			System.out.println(a[j] + " ");
		}

	}

	public void deleteNodeLinkedList(Node node) {
		node.setData(node.getNext().getData());
		node.setNext(node.getNext().getNext());
	}

	public void findDuplicate() {
		boolean hasDuplicate = false;
		int nums[] = { 1, 2, 3, 4, 5, 1 };
		HashSet<Integer> table = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!table.contains(nums[i])) {
				table.add(nums[i]);
			} else {
				hasDuplicate = true;
				break;
			}
		}
		System.out.println(hasDuplicate);
	}

	public int firstUniqChar(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[(s.charAt(i) - 'a')] == 1)
				return i;
		}
		return -1;
	}

	public void fizBuzz(int n) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				result.add("FizzBuzz");
			else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(String.valueOf(i));
			}
		}
		for (String string : result) {
			System.out.println(string);
		}
	}

	public void nonRepeatNumberInRepeatArray() {
		int[] nums = { 120, 257, 275, 231, 3, -98, 181, -127, 80, -37, 154, -7, 68, 201, 126, 1, 271, 71, 121, -117, -5,
				387, 87, -33, 234, -95, 340, 275, 97, 37, -109, -86, 71, -185, 45, -34, 315, 311, 358, 163, 379, 377,
				273, 1, 288, 185, -60, -135, 76, -101, -165, 399, 149, 319, -150, -53, 170, 95, 263, 138, 369, 5, 225,
				126, 178, 160, 278, 300, 142, -63, -110, 62, 347, 59, 391, 188, -13, -192, 244, 234, 273, 369, 48, 340,
				-117, 261, -93, 214, 196, 278, 142, -8, 349, -127, 321, -102, 183, -170, 61, 151, -29, 286, 201, 377, 2,
				-78, -181, 268, 339, 154, 249, -49, 242, 347, 70, -77, -170, 193, -60, 226, -98, 315, 328, 102, 70, 214,
				160, 78, 65, 13, 211, 335, -50, 120, 309, -53, 302, 391, -179, 3, 65, -67, -99, -121, 95, -94, 123, 55,
				-49, 371, 27, 218, 360, 165, 30, -40, -160, 55, 159, 7, 26, -38, 74, 207, -119, 85, -179, 321, -160,
				-82, 363, 310, 350, 284, 168, 182, 133, -145, -94, 335, -185, -75, 227, 331, -80, -96, 58, 78, 362, 138,
				235, 53, 211, 395, -187, -29, -13, 322, -115, -115, 348, 19, 272, 149, -119, 17, 58, 203, 181, -91, 263,
				-31, 17, 207, 271, -105, -136, -129, -40, 319, 2, -34, 212, 390, 105, 135, 382, 289, -101, 268, -33,
				328, 185, -31, -22, 182, 87, 191, 168, 85, 332, -24, 349, -187, 244, 288, 203, -24, 227, 365, 371, -195,
				-38, 30, -102, 289, 344, -96, 121, 97, 231, -135, 390, -192, 298, 286, 144, 212, 318, 26, 102, 258, 225,
				-195, 311, 27, 144, 322, 117, -77, 105, -82, 48, 170, -5, 310, -43, -93, 264, 218, 235, -109, 392, -194,
				194, 59, 178, 45, -80, -7, 117, 287, 80, 226, 284, 5, -181, 206, 276, 61, 264, 249, 365, 302, -129, 392,
				-75, 362, 196, 155, -63, 387, 151, -37, -145, 74, 331, 62, 287, 37, 261, 159, 135, -50, 325, -165, -22,
				399, 123, -121, 216, 318, 238, 199, 53, 332, 10, 350, 191, 325, 183, 41, 272, 216, 165, -86, 300, 133,
				258, 10, 7, -43, 163, -67, 194, 188, 298, 199, 309, 76, -16, 379, 344, 19, 193, 360, 68, 242, -136,
				-110, 339, 382, 13, -95, -91, 276, -105, 238, 206, -99, -150, 41, -16, 358, -78, -8, 155, 257, 395, 363,
				-194 };
		/*
		 * int[] result = new int[nums.length]; for (int i = 0; i < nums.length; i++) {
		 * if (result[nums[i]] == 0) result[nums[i]] = nums[i]; else if (result[nums[i]]
		 * == nums[i]) result[nums[i]]++; } for (int i = 0; i < result.length; i++) { if
		 * (result[nums[i]] == nums[i]) System.out.println("Non repeated num:" +
		 * nums[i]); }
		 */
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!(result.containsKey(nums[i])))
				result.put(nums[i], nums[i]);
			else {
				result.put(nums[i], ++nums[i]);
				nums[i]--;
			}
		}

		for (Integer key : result.keySet()) {
			if ((result.get(key)).equals(key))
				System.out.println(key);
		}
	}

	public void moveZeroesToEnd() {
		int[] nums = { 0, 1, 0, 2, 3, 4 };
		int insertIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[insertIndex++] = nums[i];
			}
		}

		for (int i = insertIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
		for (int i : nums) {
			System.out.print(i + ",");
		}
	}

	public void validAnagram() {
		String s1 = "anagram";
		String s2 = "nagaram";

		if (s1.length() != s2.length()) {
			System.out.println(false);
		} else {
			char[] freq = new char[26];

			for (int i = 0; i < s1.length(); i++) {
				freq[s1.charAt(i) - 'a']++;
				freq[s2.charAt(i) - 'a']--;
			}

			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > 0) {
					System.out.println(false);
					break;
				}
			}
			System.out.println(true);
		}
	}

	public int getSum(int a, int b) {
		if (b == 0) {
			return a;
		}
		int sum, carry;
		sum = a ^ b;
		carry = (a & b) << 1;
		return getSum(sum, carry);
	}

	public void containsDuplicate() {
		int nums[] = { 1, 2, 3, 4 };

		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!freq.containsKey(nums[i]))
				freq.put(nums[i], 1);
			else
				freq.put(nums[i], freq.get(nums[i] + 1));
		}

		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(true);
				break;
			}
		}
		System.out.println(false);
	}

	public void missingNumber() {
		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int sum = 0;
		int missing = 0;

		for (int i = 0; i <= nums.length; i++) {
			sum += i;
			if (i < nums.length)
				missing += nums[i];
		}
		System.out.println(sum - missing);
	}

	public void intersect() {
		int[] nums1 = { 1, 2, 3, 2, 3 };
		int[] nums2 = { 3, 2, 3, 2 };

		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			if (!counter.containsKey(nums1[i]))
				counter.put(nums1[i], 1);
			else
				counter.put(nums1[i], counter.get(nums1[i]) + 1);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (counter.containsKey(nums2[i]) && counter.get(nums2[i]) > 0) {
				result.add(nums2[i]);
				counter.put(nums2[i], counter.get(nums2[i]) - 1);
			}
		}
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	public void createBinaryTree() {
		int nums[] = { -10, -3, 5, 9 };
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(-0);
		for (int i = 0; i < nums.length; i++) {
			bst.addNode(nums[i]);
		}
		System.out.println("---------BST--------");
		bst.traverseInOrder();
		System.out.println("---------BST--------");
	}

	public void sortedArrayToBST() {
		int[] num = { -10, -3, 0, 5, 9 };
		TreeNode head = helperToArrayToBST(num, 0, num.length - 1);

	}

	public TreeNode helperToArrayToBST(int[] num, int start, int end) {
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(mid);
		node.left = helperToArrayToBST(num, start, mid - 1);
		node.right = helperToArrayToBST(num, mid + 1, end);
		return node;

	}

	public void isHappy(int n) {
		int x, sum;
		Set<Integer> inLoop = new HashSet<Integer>();

		while (inLoop.add(n)) {
			sum = 0;
			while (n > 0) {
				x = n % 10;
				n = n / 10;
				sum += x * x;
			}
			if (sum == 1) {
				System.out.println(true);
				break;
			} else
				n = sum;

		}
		System.out.println(false);
	}

	/*
	 * public void productExceptSelf() { int[] nums = { 1, 2, 3, 4 }; int product;
	 * List<Integer> result = new ArrayList<Integer>(); for (int i = 0; i <
	 * nums.length; i++) { int j = 0; product = 1; while (j < nums.length) { if (j
	 * != i) product *= nums[j]; j++; } result.add(product); }
	 * System.out.println(result); }
	 */

	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] *= right;
			right *= nums[i];
		}
		return res;
	}

	public void topKFrequent(int k) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		Map<Integer, Integer> map = new HashMap<>();
		while (map.size() < k) {
			
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.toLowerCase();
		solution.reverseString();
		solution.swapWithoutThirdVariable();
		solution.sumOfTwoIntegers();
		// solution.sequenceOfNumbersToSum(13, 3);

		int nums[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		System.out.println((solution.subsets(nums, 3)));

		solution.angleBetweenHourMinHands(6, 00);

		int a[] = new int[20];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 5;
		a[4] = 6;
		a[5] = 7;
		int capacity = a.length;
		int n = 6;
		solution.insertIntoSortedArray(4, a, n, capacity);

		solution.findDuplicate();

		String findFirstUnique = "leetcode";
		System.out.println("First unique char at:" + solution.firstUniqChar(findFirstUnique));

		solution.fizBuzz(15);
		solution.nonRepeatNumberInRepeatArray();
		solution.moveZeroesToEnd();
		System.out.println();
		System.out.println(solution.getSum(1, 3));

		solution.validAnagram();
		solution.containsDuplicate();
		solution.missingNumber();
		solution.createBinaryTree();
		solution.intersect();
		solution.isHappy(19);
		int[] b = { 1, 2, 3, 4 };
		int[] r = solution.productExceptSelf(b);
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + ",");
		}
	}

}

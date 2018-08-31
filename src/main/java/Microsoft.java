import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import cracking.datastructure.trees.TreeNode;

public class Microsoft {
	public int myAtoi(String str) {
		int index = 0, sign = 1, total = 0;
		// 1. Empty string
		if (str.length() == 0)
			return 0;

		// 2. Remove Spaces
		while (str.charAt(index) == ' ' && index < str.length())
			index++;

		// 3. Handle signs
		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}

		// 4. Convert number and avoid overflow
		while (index < str.length()) {
			int digit = str.charAt(index) - '0';
			if (digit < 0 || digit > 9)
				break;

			// check if total will be overflow after 10 times and add digit
			if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = 10 * total + digit;
			index++;
		}
		return total * sign;
	}

	public static int romanToInt(String s) {
		if (s == null || s.length() == 0)
			return -1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = s.length(), result = map.get(s.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
				result += map.get(s.charAt(i));
			else
				result -= map.get(s.charAt(i));
		}
		return result;
	}

	public static boolean validParentheses(String s) {
		java.util.Stack<Character> bracketsStack = new java.util.Stack<Character>();
		for (char b : s.toCharArray()) {
			if (b == '(')
				bracketsStack.push(')');
			else if (b == '{')
				bracketsStack.push('}');
			else if (b == '[')
				bracketsStack.push(']');
			else if (bracketsStack.isEmpty() == true || bracketsStack.pop() != b)
				return false;
		}
		return bracketsStack.isEmpty();

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergeList;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			mergeList = l1;
			mergeList.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeList = l2;
			mergeList.next = mergeTwoLists(l1, l2.next);
		}
		return mergeList;

	}

	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public int strStr(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}

	public void merge(int A[], int m, int B[], int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i > -1 && j > -1)
			A[k--] = (A[i] > B[j]) ? A[i--] : B[j--];
		while (j > -1)
			A[k--] = B[j--];
	}

	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		return (t1.key == t2.key) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		if (root.left == null && root.right == null && sum - root.key == 0)
			return true;

		return hasPathSum(root.left, sum - root.key) || hasPathSum(root.right, sum - root.key);
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("[^0-9a-zA-Z]", "");
		char c[] = s.toCharArray();
		int counthead = 0, counttail = s.length() - 1;
		while (counthead <= counttail) {
			if (c[counthead] != c[counttail])
				return false;
			counthead++;
			counttail--;
		}
		return true;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode a = headA;
		ListNode b = headB;
		while (a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;

		}
		return a;

	}

	public int compareVersion(String version1, String version2) {

		String[] levels1 = version1.split("\\.");
		String[] levels2 = version2.split("\\.");
		int result = 0;
		int length = Math.max(levels1.length, levels2.length);
		for (int i = 0; i < length; i++) {
			int v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
			int v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;

			if (v1 > v2)
				return 1;
			else if (v1 < v2)
				return -1;
		}
		return 0;
	}

	public int excelSheetColumnTitleToNumber(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public String excelSheetColumnNumberToTitle(int n) {
		StringBuilder result = new StringBuilder();

		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}

		return result.toString();
	}

	// start
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	// end

	public int hammingWeightCountNumberOf1Bit(int n) {
		int sum = 0;
		while (n != 0) {
			sum++;
			n &= (n - 1);
		}
		return sum;
	}

	public int countPrimes(int n) {
		boolean[] m = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (m[i])
				continue;

			count++;
			for (int j = i; j < n; j = j + i)
				m[j] = true;
		}

		return count;
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}

	public TreeNode lowestCommonAncestorOfBST(TreeNode root, TreeNode p, TreeNode q) {
		while ((root.key - p.key) * (root.key - q.key) > 0)
			root = p.key < root.key ? root.left : root.right;
		return root;
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public int addDigits(int num) {
		if (num == 0) {
			return 0;
		}
		if (num % 9 == 0) {
			return 9;
		} else {
			return num % 9;
		}
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

	public void longestRepeatingChar() {
		String A = "hoopla";
		char[] str = A.toCharArray();
		int count = 0;
		int tempCount = 1;
		if (A.length() == 0)
			count = 0;
		else if (A.length() == 1)
			count = 1;
		else {
			for (int i = 0; i < str.length - 1; i++) {
				if (str[i] == str[i + 1]) {
					tempCount++;
					if (tempCount > count)
						count = tempCount;
				} else
					tempCount = 1;
			}
		}
		System.out.println();
		System.out.println("Longest char sequence in str::" + count);
	}

	public int compress(char[] chars) {
		int indexAns = 0, index = 0;
		while (index < chars.length) {
			char currentChar = chars[index];
			int count = 0;
			while (index < chars.length && chars[index] == currentChar) {
				index++;
				count++;
			}
			chars[indexAns++] = currentChar;
			if (count != 1)
				for (char c : Integer.toString(count).toCharArray())
					chars[indexAns++] = c;
		}
		return indexAns;
	}

	/************************* medium ************************/

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (numbersMap.containsKey(target - nums[i])) {
				result[0] = numbersMap.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			numbersMap.put(nums[i], i);
		}
		return result;
	}

	public int getSumWithoutPlusAndMinusSign(int a, int b) {
		return (b == 0) ? a : getSumWithoutPlusAndMinusSign(a ^ b, (a & b) << 1);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public List<List<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < num.length - 2; i++) {
			if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
				int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];
				while (lo < hi) {
					if (num[lo] + num[hi] == sum) {
						res.add(Arrays.asList(num[i], num[lo], num[hi]));
						while (lo < hi && num[lo] == num[lo + 1])
							lo++;
						while (lo < hi && num[hi] == num[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (num[lo] + num[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
	}

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

	public String reverseWords(String s) {
		String[] parts = s.trim().split("\\s+");
		StringBuilder reverse = new StringBuilder();
		for (int i = (parts.length - 1); i > 0; i--) {
			reverse.append(parts[i] + " ");
		}
		return reverse.toString() + parts[0];

	}
}

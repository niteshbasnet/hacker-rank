import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cracking.datastructure.linkedlist.core.Node;
import cracking.datastructure.trees.TreeNode;

public class GenericTests {

	public static int divide(int a, int b) {
		int c = -1;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("Exception");

		} finally {
			System.out.println("Finally");
		}
		return c;
	}

	public static void main(String[] args) {

		String z = "this is test string";
		System.out.println(reverseStringCharWay(z));
		// divide(4,0);
		//
		// String abc = "abaabc";
		//
		// String line;
		// Scanner stdin = new Scanner(System.in);
		// while (stdin.hasNextLine() && !(line = stdin.nextLine()).equals("")) {
		// String[] tokens = line.split(" ");
		// System.out.println(Integer.parseInt(tokens[0]));
		// System.out.println(Integer.parseInt(tokens[1]));
		// // System.out.println(Math.pow(Integer.parseInt(tokens[0]),
		// // Integer.parseInt(tokens[1])));
		// }
		// try {
		//
		// } catch (Exception e) {
		// System.out.println();
		// }
		// stdin.close();

		// Scanner reader = new Scanner(System.in); // Reading from System.in
		// System.out.println("Enter a number: ");
		// int n = reader.nextInt(); // Scans the next token of the input as an
		// int.
		// System.out.println(n);
		// String a = reader.nextLine();
		// System.out.println(a);
		// once finished
		// reader.close();

		// System.out.println(reverseRecursive("nitesh"));
		// System.out.println(reverseString("My name is Nitesh "));
		// int[] nums = { 1, 1, 1, 2, 3, 6, 6, 6, 7, 7, 7 };
		// int[] quickArray = {45, 38, 51, 28, 47, 41, 25, 36, 28, 20};
		// // System.out.println(topKFrequent(nums, 2));
		//
		// String beginWord = "hit";
		// String endWord = "cog";
		// Set<String> wordList = new HashSet<String>(Arrays.asList("hot",
		// "dot", "dog", "lot", "log", "cog"));
		// System.out.println(ladderLength(beginWord, endWord, wordList));
		//
		// String[] a = { "a", "b", "c", "d", "e" };
		// String[] b = { "b", "d", "e", "c", "a" };
		// System.out.println("Factorial of 5::" + factorialNonRecursive(5));
		// System.out.println("Factorial of 5::" + factorialRecursive(5));
		// System.out.println("5th Fibonacci::" + fibonacciNonRecursive(4));
		// System.out.println("5th Fibonacci::" + fibonacciRecursive(4));
		//
		// GenericTests gt = new GenericTests();
		// gt.partitionArray(quickArray, 35);
		// System.out.println(Arrays.toString(quickArray));

		// int[] sumNumber = {2, 7, 11, 15};
		// System.out.println(Arrays.toString(twoSum(sumNumber, 9)));

		// String s = "(){}[]}";
		// System.out.println("Parantheses match:"+parenthesesMatch(s));
		//
		// String input = "bcabbacb";
		// System.out.println("Anagram are
		// at:"+Arrays.toString(findAnagrams(input, "abc").toArray()));
		//
		// int[] shares = {7, 1, 5, 3, 6, 4};
		// System.out.println("Max profit on share =
		// "+bestTimeToBuyStock(shares));
		// System.out.println("Max profit on share =
		// "+bestTimeToBuyStockKadaneAlgo(shares));
		//
		// char grid[][]=
		// {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		// System.out.println("Number of Islands:"+numIslands(grid) );

		// int matrix[][]= {{7,4,1,5},{8,5,2,3},{9,6,3,6},{3,10,6,3}};
		// rotateMatrix(matrix);

		// String s = "aabbcc";
		// String t = "bbacac";
		// System.out.println(isAnagram(s, t));

		// LinkedList list = new LinkedList();
		// list.add(1);
		// list.add(2);
		// list.add(3);
		// list.add(2);
		// list.add(3);
		// list.add(2);
		// list.add(1);
		// System.out.println("The linked list is
		// palindrome::"+isLinkedListPalindrome(list.getHead().getNext()));
		//
		// LinkedList l1 = new LinkedList();
		// LinkedList l2 = new LinkedList();
		//
		// l1.add(2);
		// l1.add(4);
		// l1.add(3);
		//
		// l2.add(5);
		// l2.add(6);
		// l2.add(4);
		//
		// ListNode sumNode = addTwoNumbers(l1.getHead().getNext(),
		// l2.getHead().getNext());
		// while (sumNode != null) {
		// System.out.println(sumNode.getData());
		// sumNode = sumNode.getNext();
		// }

		// int a[] = new int[10];
		// a[0] = 1;
		// a[1] = 2;
		// a[2] = 3;
		// a[3] = 4;
		// a[4] = 5;
		//
		// int b[] = { 6, 7, 8, 9 };
		//
		// int m[] = mergeSortedArray(a, 5, b, 4);
		//
		// for (int i : m) {
		// System.out.println(i);
		// }

		String a = "this is two one two this";
		getUniqueStringFromRepeatedStrings(a);
	}

	public static void getUniqueStringFromRepeatedStrings(String s) {
		Map<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = s.split("\\s+");
		for (String word : words) {
			Integer oldCount = frequency.get(word);
			if (oldCount == null)
				oldCount = 0;
			frequency.put(word, oldCount + 1);
		}
		System.out.println(frequency.get("one"));
		for (String key : frequency.keySet()) {
			System.out.println(key);
		}
	}

	public static int factorialNonRecursive(int n) {
		if (n == 0)
			return 0;
		if (n < 0)
			return 0;
		int result = 1;
		for (int i = n; i > 0; i--) {
			result = result * i;
		}
		return result;
	}

	public static int factorialRecursive(int n) {
		if (n <= 0)
			return 1;
		return n * factorialRecursive(n - 1);
	}

	public static int fibonacciNonRecursive(int n) {
		if (n < 0)
			return 0;
		int a = 0;
		int b = 1;
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = a + b;
			a = b;
			b = s;
		}
		return s;
	}

	public static int fibonacciRecursive(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static String reverseRecursive(String str) {
		if (str.length() < 2)
			return str;
		return reverseRecursive(str.substring(1)) + str.charAt(0);
	}

	public static String reverseString(String s) {
		String[] parts = s.trim().split("\\s+");
		StringBuilder reverse = new StringBuilder().append("");
		for (int i = (parts.length - 1); i > 0; i--) {
			reverse.append(parts[i] + " ");
		}
		return reverse.toString() + parts[0];
	}

	public static String reverseStringCharWay(String s) {
		char[] charArray = s.toCharArray();
		char[] result = new char[charArray.length];

		for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = charArray[i];
		}

		return new String(result);
	}

	public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();

		int len = 1;
		int strLen = beginWord.length();
		HashSet<String> visited = new HashSet<String>();

		beginSet.add(beginWord);
		endSet.add(endWord);
		while (!beginSet.isEmpty() && !endSet.isEmpty()) {
			if (beginSet.size() > endSet.size()) {
				Set<String> set = beginSet;
				beginSet = endSet;
				endSet = set;
			}

			Set<String> temp = new HashSet<String>();
			for (String word : beginSet) {
				char[] chs = word.toCharArray();

				for (int i = 0; i < chs.length; i++) {
					for (char c = 'a'; c <= 'z'; c++) {
						char old = chs[i];
						chs[i] = c;
						String target = String.valueOf(chs);

						if (endSet.contains(target)) {
							return len + 1;
						}

						if (!visited.contains(target) && wordList.contains(target)) {
							temp.add(target);
							visited.add(target);
						}
						chs[i] = old;
					}
				}
			}

			beginSet = temp;
			len++;
		}

		return 0;
	}

	public static List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer>[] bucket = new List[nums.length + 1];
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int n : nums) {
			// frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
		}

		for (int key : frequencyMap.keySet()) {
			int frequency = frequencyMap.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<Integer>();
			}
			bucket[frequency].add(key);
		}

		List<Integer> res = new ArrayList<Integer>();

		for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
			if (bucket[pos] != null) {
				res.addAll(bucket[pos]);
			}
		}
		return res;
	}

	public static void leastPreferred(String[] a, String[] b) {

	}

	public void partitionArray(int[] quickArray, int pivot) {
		int leftPointer = -1;
		int rightPointer = quickArray.length;

		while (true) {
			while (leftPointer < (quickArray.length - 1) && quickArray[++leftPointer] < pivot)
				;
			// printHorzArray(leftPointer, rightPointer);
			System.out.println(
					quickArray[leftPointer] + " in index " + leftPointer + " is bigger than the pivot value " + pivot);
			while (rightPointer > 0 && quickArray[--rightPointer] > pivot)
				;
			// printHorzArray(leftPointer, rightPointer);
			System.out.println(quickArray[rightPointer] + " in index " + rightPointer
					+ " is smaller than the pivot value " + pivot);
			// printHorzArray(leftPointer, rightPointer);

			if (leftPointer >= rightPointer)
				break;
			else {
				int temp = quickArray[leftPointer];
				quickArray[leftPointer] = quickArray[rightPointer];
				quickArray[rightPointer] = temp;
				System.out.println(quickArray[leftPointer] + " was swapped for " + quickArray[rightPointer]);
			}
		}
	}

	public static int[] twoSum(int[] numbers, int targetSum) {
		HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (numbersMap.containsKey(targetSum - numbers[i])) {
				result[0] = numbersMap.get(targetSum - numbers[i]);
				result[1] = i;
				return result;
			}
			numbersMap.put(numbers[i], i);
		}
		return result;
	}

	public static boolean parenthesesMatch(String s) {
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

	public static List<Integer> findAnagrams(String s, String p) {
		int[] hash = new int[5];
		List<Integer> list = new ArrayList<Integer>();
		for (char c : p.toCharArray()) {
			hash[c - 'a']++;
		}

		int left = 0, right = 0, count = p.length();
		while (right < s.length()) {
			if (hash[s.charAt(right++) - 'a']-- >= 1)
				count--;
			if (count == 0)
				list.add(left);
			if (right - left == p.length() && hash[s.charAt(left++) - 'a']++ >= 0)
				count++;
		}
		return list;
	}

	public static int bestTimeToBuyStock(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}

		int min = prices[0], max = 0, profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				if (prices[i] - min > profit) {
					profit = prices[i] - min;
				}
			}
		}
		return profit;
	}

	public static int bestTimeToBuyStockKadaneAlgo(int[] prices) {
		int maxCur = 0, maxSoFar = 0;
		for (int i = 1; i < prices.length; i++) {
			maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
			maxSoFar = Math.max(maxCur, maxSoFar);
		}
		return maxSoFar;
	}

	private static int n;
	private static int m;

	public static int numIslands(char[][] grid) {
		int count = 0;
		n = grid.length;
		if (n == 0)
			return 0;
		m = grid[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				if (grid[i][j] == '1') {
					DFSMarking(grid, i, j);
					++count;
				}
		}
		return count;
	}

	private static void DFSMarking(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1')
			return;
		grid[i][j] = '0';
		DFSMarking(grid, i + 1, j);
		DFSMarking(grid, i - 1, j);
		DFSMarking(grid, i, j + 1);
		DFSMarking(grid, i, j - 1);
	}

	public static void rotateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				System.out.println(j);
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}

		System.out.println(Arrays.deepToString(matrix));

	}

	/*
	 * public static Node mergeTwoLists(Node n1, Node n2) { if (n1 == null) return
	 * n2; if (n2 == null) return n1;
	 * 
	 * Node<> mergeHead; if (n1.getData() < n2.getData()) { mergeHead = n1;
	 * mergeHead.setNext(mergeTwoLists(n1.getNext(), n2)); } else { mergeHead = n2;
	 * mergeHead.setNext(mergeTwoLists(n1, n2.getNext())); } return mergeHead; }
	 */

	public static int firstUniqueChar(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		}
		return -1;
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root.key > p.key && root.key > q.key) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (root.key < p.key && root.key < q.key) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}
	}

	public static boolean isAnagram(String s, String t) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			freq[s.charAt(i) - 'a']++;
		for (int i = 0; i < t.length(); i++)
			freq[t.charAt(i) - 'a']--;
		for (int i : freq)
			if (i != 0)
				return false;
		return true;
	}

	public static Node reverseLinkedList(Node head) {
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

	public static boolean isLinkedListPalindrome(Node head) {
		Node p = head;
		Node q = head;
		while (p != null && p.getNext() != null) {
			p = p.getNext().getNext();
			q = q.getNext();
		}

		if (p != null)
			q = q.getNext();

		q = reverseLinkedList(q.getNext());
		p = head;

		while (q != null) {
			if (p.getData() != q.getData()) {
				System.out.println("p.val" + p.getData());
				System.out.println("q.val" + q.getData());
				return false;
			}
			p = p.getNext();
			q = q.getNext();
		}

		return true;
	}

	public static boolean hasLinkedListCycle(Node head) {
		if (head == null)
			return false;
		Node a = head;
		Node b = head;
		while (a != null && a.getNext() != null) {
			a = a.getNext();
			b = b.getNext().getNext();
			if (a == b)
				return false;
		}
		return true;
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
			return false;
		int row = 0;
		int col = matrix[0].length - 1;
		while (col >= 0 && row <= matrix.length - 1) {
			if (target == matrix[row][col])
				return true;
			else if (target < matrix[row][col])
				col--;
			else if (target > matrix[row][col])
				row++;
		}
		return false;
	}

	/*
	 * public static Node addTwoNumbers(Node l1, Node l2) { Node prev = new Node(0);
	 * Node head = prev; int carry = 0; while (l1 != null || l2 != null || carry !=
	 * 0) { Node cur = new Node(0); int sum = ((l2 == null) ? 0 : l2.getData()) +
	 * ((l1 == null) ? 0 : l1.getData()) + carry; cur.setData(sum % 10); carry = sum
	 * / 10; prev.setNext(cur); prev = cur;
	 * 
	 * l1 = (l1 == null) ? l1 : l1.getNext(); l2 = (l2 == null) ? l2 : l2.getNext();
	 * } return head.getNext(); }
	 */

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static boolean canAttendMeetings(Interval[] intervals) {

		return false;
	}

	public static void moveZeroes(int[] nums) {

	}

	static String findNumber(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				System.out.println("YES");
				return "YES";
			} else {
				System.out.println("NO");
				return "NO";
			}
		}
		return null;
	}

	static int[] oddNumbers(int l, int r) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = l, j = 0; i <= r; i++) {
			if (i % 2 != 0)
				list.add(i);
		}
		Integer[] result = list.toArray(new Integer[list.size()]);
		int[] abc = new int[result.length];
		for (int i = 0; i < result.length; i++) {
			abc[i] = result[i];
		}
		return abc;
	}

	public static int titleToNumber(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static int[] mergeSortedArray(int A[], int m, int B[], int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i > -1 && j > -1)
			A[k--] = A[i] > B[j] ? A[i--] : B[j--];
		while (j > -1)
			A[k--] = B[j--];

		return A;
	}

	// static String[] braces(String[] values) {
	// Scanner reader = new Scanner(System.in);
	// System.out.println("Enter number of inputs");
	// int n = reader.nextInt();
	// for(int i = 0 ; i < n; i++){
	// String[i] braces = reader.nextLine();
	// }

	// String[] result = new String[values.length];
	// for (int j = 0; j < values.length; j++) {
	// result[j] = "YES";
	// Stack<Character> stack = new Stack<Character>();
	// for (char c : values[j].toCharArray()) {
	// if (c == '(')
	// stack.push(')');
	// else if (c == '{')
	// stack.push('}');
	// else if (c == '[')
	// stack.push(']');
	// else if (stack.isEmpty() || stack.pop() != c)
	// result[j] = "NO";
	// }
	// }

	// }
}

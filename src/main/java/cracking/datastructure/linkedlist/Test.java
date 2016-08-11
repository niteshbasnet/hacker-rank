package cracking.datastructure.linkedlist;

public class Test {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		swap(a, b);
		swap_opt(a, b);
	}

	public static void swap(int x, int y) {
		x = x - y;
		y = x + y;
		x = y - x;
		System.out.println(x + "::" + y);
	}

	public static void swap_opt(int x, int y) {
		x = x ^ y;
		y = x ^ y;
		x = y ^ x;
		System.out.println(x + "::" + y);
	}
}
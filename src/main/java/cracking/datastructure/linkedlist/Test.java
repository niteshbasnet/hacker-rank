package cracking.datastructure.linkedlist;

public class Test {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		// swap(a, b);
		// swap_opt(a, b);
		int x = (int) Math.ceil(1905 / 100.0);
		System.out.println(x);
		String y = "sfds";
		y.toCharArray();
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

	public static void stairCase(int n) {
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(j < n - j ? " " : "#");
			}
			System.out.println("");
		}
	}

}
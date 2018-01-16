package cracking.datastructure.stackandqueues.core;

/**
 * 3.1) Single array for 3 fixed size stacks
 */
public class ArrayStack {
	private static final int ARRAY_SIZE = 10;
	private static int[] index = { -1, -1, -1 };
	private static int[] buffer = new int[ARRAY_SIZE * 3];

	public static void main(String[] args) {
		ArrayStack arrayStack = new ArrayStack();
		arrayStack.push(0, 1);
		arrayStack.push(0, 100);
		arrayStack.push(0, 90);
		
		arrayStack.push(1, 8);
		arrayStack.push(1, 7);
		
		arrayStack.push(2, 11);
		System.out.println(arrayStack.peek(0));
		arrayStack.pop(0);
		System.out.println(arrayStack.peek(0));
		System.out.println(arrayStack.peek(1));
		System.out.println(arrayStack.peek(2));
	}

	public void push(int stackNum, int value) {
		if (index[stackNum] + 1 > ARRAY_SIZE) {
			System.out.println("Array out of bound");
		}
		index[stackNum]++;
		buffer[stackNum * ARRAY_SIZE + index[stackNum]] = value;
	}

	public int pop(int stackNum) {
		if (index[stackNum] == -1) {
			System.out.println("Empty Stack");
		}

		int value = buffer[stackNum * ARRAY_SIZE + index[stackNum]];
		index[stackNum]--;
		return value;
	}

	public int peek(int stackNum) {
		return buffer[stackNum * ARRAY_SIZE + index[stackNum]];
	}

	public boolean isEmpty(int stackNum) {
		return index[stackNum] == -1;
	}
}

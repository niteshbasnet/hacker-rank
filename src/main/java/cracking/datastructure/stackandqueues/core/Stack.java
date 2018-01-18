package cracking.datastructure.stackandqueues.core;

import java.util.NoSuchElementException;

public class Stack<T extends Object> {
	private int maxSize;
	private T[] stackArray;
	private int top;
	private int length;

	public Stack() {
	}

	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = (T[]) new Object[size];
		this.top = -1;
		this.length = 0;
	}

	public void push(T item) {
		if ((top + 1) >= maxSize)
			throw new IndexOutOfBoundsException("Overflow");
		if ((top + 1) < maxSize)
			stackArray[++top] = item;
		length++;
	}

	public T pop() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow");
		length--;
		return stackArray[top--];
	}

	public T peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow");
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T min() {
		return null;
	}
}

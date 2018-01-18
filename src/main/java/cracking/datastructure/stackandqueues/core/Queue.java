package cracking.datastructure.stackandqueues.core;

import java.util.NoSuchElementException;
import org.apache.log4j.Logger;

public class Queue<T extends Object> {

	final static Logger logger = Logger.getLogger(Queue.class);

	private T[] arrayQueue;
	int lenght;
	int maxSize;
	int front = -1;
	int end = -1;

	public Queue(int size) {
		this.maxSize = size;
		arrayQueue = (T[]) new Object[this.maxSize];
	}

	public void enqueue(T item) {
		if ((end + 1) % maxSize == front)
			throw new IndexOutOfBoundsException("Overflow");
		else if (isEmtpy()) {
			front = end = 0;
			arrayQueue[end] = item;
			lenght++;
			logger.debug("Queued::" + item);
		} else {
			end = end + 1 % maxSize;
			arrayQueue[end] = item;
			lenght++;
			logger.debug("Queued::" + item);
		}
	}

	public void dequeue() {
		if (isEmtpy())
			throw new NoSuchElementException("Underflow");
		else if (front == end) {
			logger.debug("Dequeued::" + arrayQueue[front]);
			front = end = -1;
			lenght--;
		} else {
			logger.debug("Dequeued::" + arrayQueue[front]);
			front = (front + 1) % maxSize;
			lenght--;
		}
	}

	public boolean isEmtpy() {
		if (front == -1 && end == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (lenght == maxSize)
			return true;
		return false;
	}

	public T peek() {
		return arrayQueue[front];
	}

}

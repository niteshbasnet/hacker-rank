package cracking.datastructure.stackandqueues;

import cracking.datastructure.stackandqueues.core.Queue;
import cracking.datastructure.stackandqueues.core.Stack;

public class Solution {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>(10);
		myStack.push(10);
		myStack.push(11);
		myStack.push(12);
		myStack.push(13);
		myStack.push(14);
		
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.pop());
		
		
		Queue<Integer> myQueue = new Queue<Integer>(5);
		myQueue.enqueue(20);
		myQueue.enqueue(21);
		myQueue.enqueue(22);
		myQueue.enqueue(23);
		myQueue.enqueue(24);
		
		System.out.println(myQueue.isFull());
		
		myQueue.dequeue();
		myQueue.dequeue();
		
		System.out.println(myQueue.isEmtpy());
		System.out.println(myQueue.isFull());
		
	}
}

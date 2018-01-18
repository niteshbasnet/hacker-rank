package cracking.datastructure.stackandqueues;

import org.apache.log4j.Logger;

import cracking.datastructure.stackandqueues.core.Stack;

public class MyQueue {
	final static Logger logger = Logger.getLogger(MyQueue.class);

	Stack firstStack;
	Stack secondStack;

	public MyQueue() {
		logger.debug("MyQueue::Constructor");
		firstStack = new Stack();
		secondStack = new Stack();
	}

	public void add(Object item) {
		logger.debug("MyQueue::add()::adding::" + item);
		firstStack.push(item);
	}

	public void shiftStacks() {
		logger.debug("MyQueue::shifting stacks");
		//if (secondStack.isEmpty()) {
		//	while (!firstStack.isEmpty()) {
				secondStack.push(firstStack.pop());
			}
		//}
//	}

	public Object remove() {
		logger.debug("MyQueue::remove()");
		shiftStacks();
		return secondStack.pop();
	}

	public Object peek() {
		logger.debug("MyQueue::peek()");
		shiftStacks();
		return secondStack.peek();
	}
}

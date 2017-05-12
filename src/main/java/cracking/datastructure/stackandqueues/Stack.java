package cracking.datastructure.stackandqueues;

import cracking.datastructure.linkedlist.core.ListNode;

public class Stack {
	ListNode top;

	public Object pop() {
		if (top != null) {
			Object item = top.getData();
			top = top.getNext();
			return item;
		}
		return null;
	}

	public void push(Object item) {/*
		ListNode n = new ListNode(item);
		n.setNext(top);
		top = n;
	*/}

	public Object peek() {
		return top.getData();
	}
	
	public Object min(){
		Object min = null;
		
		
		return null;
	}
}

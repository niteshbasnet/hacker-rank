package cracking.datastructure.stackandqueues;

import cracking.datastructure.linkedlist.core.ListNode;

public class ListQueue {
	ListNode first;
	ListNode last;

	public Object dequeue() {
		if (first != null) {
			Object item = first.getData();
			first = first.getNext();
			return item;
		}
		return null;
	}

	public void enqueue(Object item) {
		if (first == null) {
			last = new ListNode(item);
			first = last;
		} else {
			last.setNext(new ListNode(item));
			last = last.getNext();
		}

	}
}

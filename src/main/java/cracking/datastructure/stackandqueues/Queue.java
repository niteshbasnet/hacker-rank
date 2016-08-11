package cracking.datastructure.stackandqueues;

import cracking.datastructure.linkedlist.core.Node;

public class Queue {
	Node first;
	Node last;

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
			last = new Node(item);
			first = last;
		} else {
			last.setNext(new Node(item));
			last = last.getNext();
		}

	}

}

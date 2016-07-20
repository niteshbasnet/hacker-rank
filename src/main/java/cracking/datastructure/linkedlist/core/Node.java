package cracking.datastructure.linkedlist.core;

public class Node {

	Node next = null;
	Object data;

	public Node(Object d) {
		this.next = null;
		this.data = d;
	}

	public Node(Node n, Object d) {
		this.next = n;
		this.data = d;
	}

	public Object getData() {
		return this.data;
	}

	public Object setData(Object d) {
		return this.data = d;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

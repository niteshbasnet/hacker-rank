package cracking.datastructure.linkedlist.core;

public class Node<T extends Object> {

	Node<T> next = null;
	T data;

	public Node(T d) {
		this.next = null;
		this.data = d;
	}

	public Node(Node<T> n, T d) {
		this.next = n;
		this.data = d;
	}

	public T getData() {
		return this.data;
	}

	public T setData(T d) {
		return this.data = d;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}

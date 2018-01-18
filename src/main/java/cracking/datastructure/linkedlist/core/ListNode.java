package cracking.datastructure.linkedlist.core;

public class ListNode<T extends Object> {

	ListNode next = null;
	T data;

	public ListNode(T d) {
		this.next = null;
		this.data = d;
	}

	public ListNode(ListNode n, T d) {
		this.next = n;
		this.data = d;
	}

	public T getData() {
		return this.data;
	}

	public T setData(T d) {
		return this.data = d;
	}

	public ListNode getNext() {
		return this.next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}

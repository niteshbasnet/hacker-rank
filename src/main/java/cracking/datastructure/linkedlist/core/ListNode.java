package cracking.datastructure.linkedlist.core;

public class ListNode {

	ListNode next = null;
	int data;

	public ListNode(int d) {
		this.next = null;
		this.data = d;
	}

	public ListNode(ListNode n, int d) {
		this.next = n;
		this.data = d;
	}

	public int getData() {
		return this.data;
	}

	public int setData(int d) {
		return this.data = d;
	}

	public ListNode getNext() {
		return this.next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}

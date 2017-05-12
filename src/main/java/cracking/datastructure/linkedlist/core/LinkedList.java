package cracking.datastructure.linkedlist.core;

public class LinkedList {

	ListNode head;
	int count;

	public LinkedList() {

	}

	public LinkedList(ListNode n) {
		this.head = n;
		this.count = 0;
	}

	public void add(int data) {
		if (head == null) {
			this.head = new ListNode(data);
		}
		ListNode tmp = new ListNode(data);
		ListNode current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(tmp);
		count++;
	}

	public boolean remove(int index) {
		if (index < 0 || index > size()) {
			return false;
		}
		ListNode current = head;

		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;
				current = current.getNext();

			}
			current.setNext(current.getNext().getNext());
			count--;
			return true;
		}
		return false;
	}

	public int get(int index) {
		if (index < 0)
			return 0;
		ListNode current = null;

		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return 0;
				current = current.getNext();
			}
			return current.getData();
		}
		return 0;
	}

	public ListNode getHead() {
		return this.head;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			ListNode current = head.getNext();
			while (current != null) {
				output += "[" + current.getData() + "]";
				current = current.getNext();
			}

		}
		return output;
	}

}

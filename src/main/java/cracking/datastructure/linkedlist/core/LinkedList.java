package cracking.datastructure.linkedlist.core;

public class LinkedList {

	Node head;
	int count;

	public LinkedList() {

	}

	public LinkedList(Node n) {
		this.head = n;
		this.count = 0;
	}

	public void add(Object data) {
		if (head == null) {
			this.head = new Node(data);
		}
		Node tmp = new Node(data);
		Node current = this.head;
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
		Node current = head;

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

	public Object get(int index) {
		if (index < 0)
			return null;
		Node current = null;

		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
				current = current.getNext();
			}
			return current.getData();
		}
		return current;
	}

	public Node getHead() {
		return this.head;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}

		}
		return output;
	}

}

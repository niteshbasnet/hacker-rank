package cracking.datastructure.linkedlist.core;

public class LinkedList<T extends Object> {

	Node<T> head;
	int count;

	public LinkedList() {

	}

	public LinkedList(Node<T> n) {
		this.head = n;
		this.count = 0;
	}

	public void add(T data) {
		if (head == null) {
			this.head = new Node<T>(data);
		}
		Node<T> tmp = new Node<T>(data);
		Node<T> current = this.head;
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
		Node<T> current = head;

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

	public T get(int index) {
		if (index < 0)
			return null;
		Node<T> current = null;

		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
				current = current.getNext();
			}
			return current.getData();
		}
		return null;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node<T> current = head.getNext();
			while (current != null) {
				output += "[" + current.getData() + "]";
				current = current.getNext();
			}

		}
		return output;
	}

}

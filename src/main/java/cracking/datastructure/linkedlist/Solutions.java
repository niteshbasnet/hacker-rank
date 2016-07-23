package cracking.datastructure.linkedlist;

import java.util.HashSet;

import cracking.datastructure.linkedlist.core.LinkedList;
import cracking.datastructure.linkedlist.core.Node;

public class Solutions {

	public static LinkedList lList = new LinkedList();

	public static void main(String[] args) {
		lList.add("one");
		lList.add("two");
		lList.add("three");
		lList.add("three");
		lList.add("four");
		lList.add("four");
		lList.add("five");
		lList.add("six");
		lList.add("seven");
		lList.add("eight");
		System.out.println(lList);
		removeDuplicate();
		System.out.println(lList);
		getKthToLast(3);
	}

	/**
	 * 2.1) Remove duplicate from LinkedList Solution one below is using buffer
	 * {@link HashSet} other solution could be by using two iterator to check
	 */
	public static void removeDuplicate() {
		HashSet<String> set = new HashSet<String>();
		Node current = lList.getHead();
		while (current.getNext() != null) {
			if (set.contains(current.getNext().getData())) {
				current.setNext(current.getNext().getNext());
			} else {
				set.add((String) current.getNext().getData());
				current = current.getNext();
			}
		}
	}

	/**
	 * 2.1) without buffer
	 */
	public static void removeDuplicateNoBuffer() {

	}

	/**
	 * 2.2) Return kth element from last
	 */
	public static void getKthToLast(int k) {
		Node current = lList.getHead();
		Node kthNode = current;
		for (int i = 0; i < k; i++) {
			kthNode = kthNode.getNext();
		}

		while (kthNode != null) {
			current = current.getNext();
			kthNode = kthNode.getNext();
		}
		System.out.println(k + "th data::" + current.getData());
	}

	/**
	 * 2.3) Delete Middle Node
	 */
	public static void deleteNode(Node n) {
		if (n != null || n.getNext() != null) {
			n.setData(n.getNext().getData());
			n.setNext(n.getNext().getNext());
		}
	}

//*****************************NOT COMPLETE YET*********************************
	/**
	 * 2.4) Partition a linked list around a value x, such that all nodes less
	 * than x comes before all nodes greater than or equal to x.
	 */
	public static Node partition(Node n, int x) {
		Node before = null;
		Node after = null;
		while (n.getNext() != null) {
			Node next = n.getNext();
			if ((Integer) n.getData() < x) {
				n.setNext(before);
				before = n;
			} else {
				
			}
			n = next;
		}

		if (after == null)
			return after;

		Node head = before;
		while (before.getNext() != null) {
			before = before.getNext();
		}
		before.setNext(after);

		return head;
	}

	/**
	 * 2.5)
	 * 
	 */

}

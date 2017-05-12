package cracking.datastructure.linkedlist;

import java.util.HashSet;

import cracking.datastructure.linkedlist.core.LinkedList;
import cracking.datastructure.linkedlist.core.ListNode;

public class Solutions {

	public static LinkedList lList = new LinkedList();

	public static void main(String[] args) {
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.add(5);
		lList.add(5);
		lList.add(6);
		lList.add(7);
		lList.add(7);
		lList.add(7);
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
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode current = lList.getHead();
		while (current.getNext() != null) {
			if (set.contains(current.getNext().getData())) {
				current.setNext(current.getNext().getNext());
			} else {
				set.add((Integer) current.getNext().getData());
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
		ListNode current = lList.getHead();
		ListNode kthNode = current;
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
	public static void deleteNode(ListNode n) {
		if (n != null || n.getNext() != null) {
			n.setData(n.getNext().getData());
			n.setNext(n.getNext().getNext());
		}
	}

	/**
	 * 2.4) Partition a linked list around a value x, such that all nodes less
	 * than x come before all nodes greater than or equal to x.
	 */
	public static void partion(int x) {
		
	}

	/**
	 * 2.5) Sum Lists
	 */
	public static void SumLists() {
		
	}
}

package cracking.datastructure.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeOne<T extends Comparable<T>> {

	private T data;
	private BinarySearchTreeOne<T> left;
	private BinarySearchTreeOne<T> right;

	public BinarySearchTreeOne(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void addNode(T newData) {
		int cmp = newData.compareTo(data);
		if (cmp < 0) {
			if (this.left != null)
				this.left.addNode(newData);
			else
				this.left = new BinarySearchTreeOne<T>(newData);
		} else {
			if (this.right != null)
				this.right.addNode(newData);
			else
				this.right = new BinarySearchTreeOne<T>(newData);
		}
	}

	public void traversePreOrder() {
		System.out.println(this.data);
		if (this.left != null)
			this.left.traversePreOrder();
		if (this.right != null)
			this.right.traversePreOrder();
	}

	public void traverseInOrder() {
		if (this.left != null)
			this.left.traverseInOrder();
		System.out.println(this.data);
		if (this.right != null)
			this.right.traverseInOrder();
	}

	public void traversePostOrder() {
		if (this.left != null)
			this.left.traversePostOrder();
		if (this.right != null)
			this.right.traversePostOrder();
		System.out.println(this.data);
	}


}

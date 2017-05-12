package cracking.datastructure.trees;

public class TreeNode {

	private int key;
	private TreeNode left;
	private TreeNode right;

	TreeNode(int key) {
		this.key = key;
		right = null;
		left = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
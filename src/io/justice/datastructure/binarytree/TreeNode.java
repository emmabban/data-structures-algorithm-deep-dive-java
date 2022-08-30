package io.justice.datastructure.binarytree;

import java.util.List;

public class TreeNode {

	long data;
	TreeNode left;
	TreeNode right;
	public TreeNode(long data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
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
	
	
	public void printNode() {
		TreeNode cur = this;
		if(cur != null) {
		System.out.println("a parent: " +cur.data);
		System.out.print(cur.left==null? "": "a left child: " );
		if(cur.left != null) {
		cur.left.printNode();
		}
		System.out.print(cur.right==null? "": "a right child: " );
		if(cur.right != null) {
		cur.right.printNode();
		}
		}
	}
	
	public void levelOrder(List<TreeNode> queue) {
		queue.add(this);
		
		
	}
	
	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	


	
	
	
	
}

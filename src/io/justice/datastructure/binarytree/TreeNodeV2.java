package io.justice.datastructure.binarytree;

import java.util.List;

public class TreeNodeV2 {

	long data;
	TreeNodeV2 left;
	TreeNodeV2 right;
	
	public void insert(long data) {
		if(data == this.data) {
			return;
		}
		
		if(this.data > data) {
			if(this.left == null) {
				this.left = new TreeNodeV2(data);
			}else {
				this.left.insert(data);
			}
		}else if(this.data < data) {
			if(this.right == null) {
				this.right = new TreeNodeV2(data);
			}else {
				this.right.insert(data);
			}
		}
	}
	
	public TreeNodeV2(long data) {
		super();
		this.data = data;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public TreeNodeV2 getLeft() {
		return left;
	}
	public void setLeft(TreeNodeV2 left) {
		this.left = left;
	}
	public TreeNodeV2 getRight() {
		return right;
	}
	public void setRight(TreeNodeV2 right) {
		this.right = right;
	}
	
	
	public void printNode() {
		TreeNodeV2 cur = this;
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
	
	public long getMin() {
		if(this.left == null) {
			return this.data;
		}
		
		return this.left.getMin();
	}
	
	public long getMax() {
		if(this.right == null) {
			return this.data;
		}
		
		return this.right.getMax();
	}
	
	public TreeNodeV2 getNode(long val) {
		if(this.data == val) {
			return this;
		} else if(this.data > val && this.left != null) {
			return this.left.getNode(val);
		}else if(this.data < val && this.right != null) {
			return this.right.getNode(val);
		}
		
		return null;
	}
	
	public void printInOrder() {
		if(this.left != null) {
			this.left.printInOrder();
		}
		
		System.out.print(this.data+ " ");
		
		if(this.right != null) {
			this.right.printInOrder();
		}
		
	}
	
	public void printPreOrder() {
		System.out.print(this.data + " ");
		if(this.left != null) {
			this.left.printPreOrder();
		}
		if(this.right != null) {
			this.right.printPreOrder();
		}
		
	}
	
	public void printPostOrder() {
		if(this.left != null) {
			this.left.printPostOrder();
		}
		
		if(this.right != null) {
			this.right.printPostOrder();
		}
		System.out.print(this.data+ " ");
		
	}
	
	public void printLevelOrder(List<TreeNodeV2> queue) {
		if(this != null) {
			queue.add(this);
		}
	}
	
	
	/*
	public TreeNodeV2 del(long value) {
		if(this.data == value ) {
			return this;
		}
		
		if(this.data > value && this.left != null) {
			this.left.del(value);
			return this.left;
		}else if(this.data < value && this.right != null) {
			this.right.del(value);
			return this.right;
		}
		return null;
		
	}
*/
	@Override
	public String toString() {
		return "TreeNodeV2 [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

	
	
	
	
}

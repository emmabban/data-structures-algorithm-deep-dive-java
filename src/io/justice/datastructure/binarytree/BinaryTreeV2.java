package io.justice.datastructure.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeV2 {
	TreeNodeV2 root;

	public void insertNode(long data) {
		

		if (root == null) {
			root =  new TreeNodeV2(data);;
			return;
		}
		
		root.insert(data);
	}
	
	public void printTree() {
		TreeNodeV2 cur = root;
		
		if(cur != null) {
			System.out.println("a parent: "+ cur.data);
			System.out.print( cur.left==null? "":"a left child: " );
			if(cur.left != null) {
			cur.left.printNode();
			}
			System.out.print(cur.right==null? "":"a right child: ");
			if(cur.right != null) {
			 cur.right.printNode();
			}
		}
		
	}
	
	public void printTreePreOrder() {
		System.out.println("PreOrder printing: ");
		if(root != null) {
		root.printPreOrder();
		}
		System.out.println("");
	}
	
	
	public void printTreeInorder() {
		System.out.println("InOrder printing: ");
		if(root != null) {
			root.printInOrder();
		}
		System.out.println(" ");
	}
	
	
	public void printTreePostorder() {
		System.out.println("PostOrder printing: ");
		if(root != null) {
		root.printPostOrder();
		}
		System.out.println("");
	}
	
	public void printLevelOrder() {
		System.out.println("LevelOrder printing:  ");
		List<TreeNodeV2> queue = new ArrayList<>();
		if(this.root != null) {
			this.root.printLevelOrder(queue);
		}
		
		TreeNodeV2 temp;
		while(!queue.isEmpty()) {
			temp = queue.remove(0);
			System.out.print(temp.data + " ");
			if(temp.left != null) {
			temp.left.printLevelOrder(queue);
			}
			
			if(temp.right != null) {
				temp.right.printLevelOrder(queue);
			}
		}
		
		System.out.println("");
		
		
	}
	
	
	public long findMax() {
		if(root == null) {
			return Long.MAX_VALUE;
		}
		
		return root.getMax();
	}
	
	public long findMin() {
		if(root == null) {
			return Long.MIN_VALUE;
		}
		return root.getMin();
		
	}
	
	public TreeNodeV2 getNode(long val) {
		if(root == null) {
			return null;
		}
		return root.getNode(val);
		
	}
	
	public TreeNodeV2 del(long value) {
		if(root == null ) {
			return null;
		}
		TreeNodeV2 cur = root;
		TreeNodeV2 parent = root;
		while(cur!= null && cur.data != value) {
			parent = cur;
			if(cur.data> value) {
				cur = cur.left;
			}else if(cur.data < value) {
				cur = cur.right;
			}
		}
		if(cur == null) {
			return null;
		}
		if(cur.left == null && cur.right== null ) {
			if(root.data == cur.data) {
				root = null;
			}else if(parent.data > cur.data) {
				parent.left = null;
			}else {
				parent.right = null;
			}
			return cur;
		}else if(cur.left != null && cur.right== null ) {
			if(root.data == cur.data) {
				root = cur.left;
			}
			if(parent.data > cur.data) {
				parent.left = cur.left;
			}else {
				parent.right = cur.left;
			}
			cur.left = null;
		} else if(cur.left == null && cur.right != null) {
			if(root.data == cur.data) {
				root = cur.right;
			}
			if(parent.data > cur.data) {
				parent.left = cur.right;
			} else {
				parent.right = cur.right;
			}
			cur.right = null;
		} else {
			TreeNodeV2 replacementSubtreeNode = cur.right;
			TreeNodeV2 parentReplacementSubtreeNode = cur.right;
				while(replacementSubtreeNode.getLeft() != null) {
					parentReplacementSubtreeNode = replacementSubtreeNode;
					replacementSubtreeNode =  replacementSubtreeNode.getLeft();
				}
				parentReplacementSubtreeNode.left = replacementSubtreeNode.right;
				replacementSubtreeNode.right = cur.getRight();
				replacementSubtreeNode.left = cur.left;
				
				if(root.data == cur.data) {
					root = replacementSubtreeNode;
				}else if(parent.data < cur.data) {
						//set parent.right
						parent.right = replacementSubtreeNode;
				} else {
					//set parent.left
					parent.left = replacementSubtreeNode;
				}
				cur.left = null;
				cur.right = null;
				
		}
		
		return cur;
		
	}
	
	public TreeNodeV2 deleteNode(long value) {
		root = deleteNode(root, value);
		
		
		return root;
		
	}
	
	private TreeNodeV2 deleteNode(TreeNodeV2 subTreeRoot, long value) {
		if(subTreeRoot == null) {
			return subTreeRoot;
		}
		
		if(subTreeRoot.getData() > value) {
			 subTreeRoot.setLeft(deleteNode(subTreeRoot.getLeft(), value));
		} else if(subTreeRoot.getData()< value) {
			subTreeRoot.setRight(deleteNode(subTreeRoot.getRight(), value));
		}else {
			if(subTreeRoot.getLeft() == null && subTreeRoot.right == null) {
				return null;
			} else if(subTreeRoot.getLeft() == null) {
				return subTreeRoot.getRight();
			}else if(subTreeRoot.getRight() == null) {
				return subTreeRoot.getLeft();
			} else {
				TreeNodeV2 parentCur = subTreeRoot.getLeft();
				TreeNodeV2 cur = subTreeRoot.getLeft();
				
				while(cur.getRight() != null) {
					parentCur = cur;
					cur = cur.getRight();
				}
				
				parentCur.setRight(cur.getLeft());
				cur.setLeft(subTreeRoot.getLeft());
				cur.setRight(subTreeRoot.getRight());
				subTreeRoot = cur;
				
			}
			
		}
		return subTreeRoot;
	}
	
	public TreeNodeV2 deleteNodeV2(long value) {
		root = deleteNodeV2(root, value);
		
		return root;
	}

	private TreeNodeV2 deleteNodeV2(TreeNodeV2 subTreeRoot, long value) {
		if(subTreeRoot == null) {
			return subTreeRoot;
		}
		
		if(subTreeRoot.getData() < value) {
			subTreeRoot.setRight(deleteNodeV2(subTreeRoot.getRight(), value));
		}else if(subTreeRoot.getData() > value) {
			subTreeRoot.setLeft(deleteNodeV2(subTreeRoot.getLeft(),value));
		} else {
			if(subTreeRoot.getLeft() == null) {
				return subTreeRoot.getRight();
			}else if(subTreeRoot.getRight() == null) {
				return subTreeRoot.getLeft();
			} else {
				TreeNodeV2 parentCur = subTreeRoot.getRight();
				TreeNodeV2 cur = subTreeRoot.getRight();
				
				while(cur.getLeft()!= null) {
					parentCur = cur;
					cur = cur.getLeft();
				}
				parentCur.setLeft(cur.getRight());
				cur.setLeft(subTreeRoot.getLeft());
				cur.setRight(subTreeRoot.getRight());
				subTreeRoot = cur;
			}
		}
		
		return subTreeRoot;
	}
	
	
	public TreeNodeV2 deleteNodeV3(long value) {
		root = deleteNodeV3(root, value);
		
		return root;
	}

	private TreeNodeV2 deleteNodeV3(TreeNodeV2 subTreeRoot, long value) {
		if(subTreeRoot == null) {
			return subTreeRoot;
		}
		
		if(subTreeRoot.getData() < value) {
			subTreeRoot.setRight(deleteNodeV3(subTreeRoot.getRight(), value));
		}else if(subTreeRoot.getData() > value) {
			subTreeRoot.setLeft(deleteNodeV3(subTreeRoot.getLeft(),value));
		} else {
			if(subTreeRoot.getLeft() == null) {
				return subTreeRoot.getRight();
			}else if(subTreeRoot.getRight() == null) {
				return subTreeRoot.getLeft();
			} else {
				subTreeRoot.setData(subTreeRoot.getRight().getMin());
				subTreeRoot.setRight(deleteNodeV3(subTreeRoot.getRight(), subTreeRoot.getData()));
			}
		}
		
		return subTreeRoot;
	}

	@Override
	public String toString() {
		return "BinaryTreeV2 [root=" + root + "]";
	}
	
	

}

package io.justice.datastructure.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	TreeNode root;

	public void insertNode(long data) {
		TreeNode valToInsert = new TreeNode(data, null, null);
		
		
		
		if(root == null) {
			root = valToInsert;
			return;
		}
		
		TreeNode cur = root;
		TreeNode curParant = root;
		if(cur.data == data) {
			return;
		}
		
		while(cur != null) {
			curParant = cur;
		if(valToInsert.data < cur.data) {
			cur = cur.left;
			
		}else {
			cur = cur.right;
		}
		
		}
		
		cur = curParant;
		if( valToInsert.data  < cur.data) {
			cur.left = valToInsert;
			return;
		}
		cur.right = valToInsert;	
	}
	
	public void printTree() {
		TreeNode cur = root;
		
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
		preOrder(root);
		System.out.println("");
	}
	
	private void preOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public void printTreeInorder() {
		System.out.println("InOrder printing: ");
		inOrder(root);
		System.out.println(" ");
	}
	
	private void inOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public void printTreePostorder() {
		System.out.println("PostOrder printing: ");
		postOrder(root);
		System.out.println(" ");
	}
	
	private void postOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	public void printTreeLevelOrder() {
		System.out.println("LevelOrder printing: ");
		levelOrder(root);
		System.out.println(" ");
	}
	
	private void levelOrder(TreeNode node) {
		if(root == null) {
			return;
		}
		List<TreeNode> queue = new ArrayList<>();
		root.levelOrder(queue);
		TreeNode temp;
		while(!queue.isEmpty()) {
			
			temp = queue.remove(0);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null) {
				queue.add(temp.right);
			}
			System.out.print(temp.data + " ");
		}
	}
	
	public long findMax() {
		if(root == null) {
			return 0;
		}
		TreeNode cur = root;
		TreeNode parentCur = root;
		while(cur != null) {
			parentCur= cur;
			cur = cur.getRight();
		}
		
		return parentCur.data;
	}
	
	public long findMin() {
		if(root == null) {
			return 0;
		}
		TreeNode cur = root;
		TreeNode parentCur = root;
		
		while(cur != null) {
			parentCur= cur;
			cur = cur.getLeft();
		}
		
		return parentCur.data;
		
	}
	
	public TreeNode getNode(long val) {
		if(root == null) {
			return null;
		}
		TreeNode cur = root;
		
		while(cur != null && cur.getData() != val) {
			if(val < cur.getData()) {
				cur = cur.getLeft();
				} else {
					cur = cur.getRight();
				}
		}
		 if( cur == null) {
			 return null;
		 }
		return cur;
		
	}
	
	public TreeNode del(long value) {
		if(root == null ) {
			return null;
		}
		TreeNode cur = root;
		TreeNode parent = root;
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
		if (cur.left == null && cur.right == null) {
			if(parent.data == cur.data) {
				parent = null;
			} else if(parent.data > cur.data) {
				parent.left = null;
			} else  {
				parent.right = null;
				
			}
			return cur;
		} else if (cur.left != null && cur.right == null) {
			if(root.data == cur.data) {
				root = cur.left;
			}else if(parent.data > cur.data) {
				parent.left = cur.left;
			} else {
				parent.right = cur.left;
				
			}
			cur.left = null;
			return cur;
			
			} else if(cur.left == null && cur.right != null) {
				if(root.data == cur.data) {
					root = cur.right;
				} else if(parent.data > cur.data) {
					parent.left = cur.right;
				} else {
					parent.right = cur.right;
					
				}
				cur.right = null;
				return cur;
				
				} else {
					
			TreeNode replacementNode = cur.right;
			TreeNode parentReplacementNode = cur.right;
			while(replacementNode.getLeft() != null) {
				parentReplacementNode = replacementNode;
				replacementNode =  replacementNode.getLeft();
			}
			parentReplacementNode.left = replacementNode.getRight();
			replacementNode.right = cur.getRight();
			replacementNode.left =cur.left;
			if(root.data == cur.data) {
				root = replacementNode;
			}else if(parent.data < cur.data) {
				//set parent.right
				parent.right = replacementNode;
			} else {
				//set parent.left
				parent.left = replacementNode;
			}
			cur.left = null;
			cur.right = null;
			return cur;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}
	
	
}

package io.justice.datastructure.binarytree;

public class BinaryTreeApplication {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insertNode(25);
		binaryTree.insertNode(20);
		binaryTree.insertNode(15);
		binaryTree.insertNode(27);
		binaryTree.insertNode(30);
		binaryTree.insertNode(29);
		binaryTree.insertNode(26);
		binaryTree.insertNode(22);
		binaryTree.insertNode(32);
		binaryTree.insertNode(17);
		
		binaryTree.printTree();
		System.out.println("=============");
		binaryTree.printTreeInorder();
		System.out.println("=============");
		binaryTree.printTreePreOrder();
		System.out.println("=============");
		binaryTree.printTreePostorder();
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("Maximum : " + binaryTree.findMax());
		System.out.println("=============");
		System.out.println("Minimum : " + binaryTree.findMin());
		System.out.println("=============");
		System.out.println("GET value : " + binaryTree.getNode(-29));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTree.getNode(29));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTree.getNode(27));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTree.getNode(17));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTree.getNode(8888));
		System.out.println("=============");
		 binaryTree.printTreeLevelOrder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTree.del(15));
		 System.out.println("=============");
		 binaryTree.printTreeInorder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTree.del(22));
		 System.out.println("=============");
		 binaryTree.printTreeInorder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTree.del(27));
		 System.out.println("=============");
		 binaryTree.printTreeLevelOrder();
		 
		 
		 
		BinaryTreeV2 binaryTreeV2 = new BinaryTreeV2();
		binaryTreeV2.insertNode(25);
		binaryTreeV2.insertNode(20);
		binaryTreeV2.insertNode(15);
		binaryTreeV2.insertNode(27);
		binaryTreeV2.insertNode(30);
		binaryTreeV2.insertNode(29);
		binaryTreeV2.insertNode(26);
		binaryTreeV2.insertNode(22);
		binaryTreeV2.insertNode(32);
		binaryTreeV2.insertNode(17);
		
		binaryTreeV2.printTree();
		System.out.println("=============");
		binaryTreeV2.printTreeInorder();
		System.out.println("=============");
		binaryTreeV2.printTreePreOrder();
		System.out.println("=============");
		binaryTreeV2.printTreePostorder();
		System.out.println("=============");
		System.out.println("Maximum : " + binaryTreeV2.findMax());
		System.out.println("=============");
		System.out.println("Minimum : " + binaryTreeV2.findMin());
		
		System.out.println("=============");
		System.out.println("GET value : " + binaryTreeV2.getNode(-29));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTreeV2.getNode(29));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTreeV2.getNode(27));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTreeV2.getNode(17));
		System.out.println("=============");
		System.out.println("GET value : " + binaryTreeV2.getNode(8888));
		
		System.out.println("=============");
		binaryTreeV2.printLevelOrder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTreeV2.del(15));
		 System.out.println("=============");
		 binaryTreeV2.printTreeInorder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTreeV2.del(22));
		 System.out.println("=============");
		 binaryTreeV2.printTreeInorder();
		 System.out.println("=============");
		 System.out.println("Deleted node: " + binaryTreeV2.del(27));
		 System.out.println("=============");
		 binaryTreeV2.printLevelOrder();
		 
		 BinaryTree binaryTree3 = new BinaryTree();
		 
		 
		 binaryTree3.insertNode(50);
		 binaryTree3.insertNode(25);
		 binaryTree3.insertNode(15);
		 binaryTree3.insertNode(35);
		 
		 binaryTree3.insertNode(5);
		 binaryTree3.insertNode(20);
		 binaryTree3.insertNode(30);
		 binaryTree3.insertNode(40);
		 
		 System.out.println("Deleted node: " + binaryTree3.del(25));
		 System.out.println("=============");
		 binaryTree3.printTreeLevelOrder();
		 System.out.println("=============");
		 
		 BinaryTreeV2 binaryTreeV24 = new BinaryTreeV2();
		 
		 binaryTreeV24.insertNode(50);
		 binaryTreeV24.insertNode(25);
		 binaryTreeV24.insertNode(15);
		 binaryTreeV24.insertNode(35);
		 
		 binaryTreeV24.insertNode(5);
		 binaryTreeV24.insertNode(20);
		 binaryTreeV24.insertNode(30);
		 binaryTreeV24.insertNode(40);
		 
		 System.out.println("Deleted node: " + binaryTreeV24.del(25));
		 System.out.println("=============");
		 binaryTreeV24.printLevelOrder();
		 System.out.println("=============");
		 binaryTreeV2.printTreeInorder();
			System.out.println("===");
			binaryTreeV2.del(25);
			binaryTreeV2.printTreeInorder();
			System.out.println("===");
		 
		 
	}

}

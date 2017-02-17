package com.study.trees;

class Node {
	int data;
	Node left;
	Node right;
}

public class BinaryTree {

	private Node root = null;

	public static void main(String[] args) {
		BinaryTree obj = new BinaryTree();
		obj.constructTree();
		
		TreeTraversal traversals = new TreeTraversal();
		System.out.print("inorder - ");
		traversals.inorder(obj.root);
		System.out.println();
		System.out.print("preorder - ");
		traversals.preorder(obj.root);
		System.out.println();
		System.out.print("postorder - ");
		traversals.postorder(obj.root);
		System.out.println();
		
		ReadTrees readTree = new ReadTrees();
		System.out.print("nodes with one child - ");
		readTree.getNodeWithOneChild(obj.root);
		System.out.println();
		System.out.print("nodes with two children - ");
		readTree.getNodeWithTwoChildren(obj.root);
		System.out.println();
		System.out.print("leaves - ");
		readTree.getLeaves(obj.root);
		System.out.println();
		System.out.println();
		
		System.out.println("Tree before mirror ");
		traversals.inorder(obj.root);
		System.out.println();
		
		MirrorTree mirrorTree = new MirrorTree();
		System.out.println("Mirror of tree");
		mirrorTree.mirror(obj.root);
		System.out.println();
		
		System.out.println("Tree after mirror ");
		traversals.inorder(obj.root);
		System.out.println();
		
		System.out.println("##################");
		System.out.println("Tree before mirror ");
		traversals.inorder(obj.root);
		System.out.println();
		
		
		System.out.println("Mirror of tree - Gopal");
		obj.mirrorTree(obj.root);
		System.out.println();
		
		System.out.println("Tree after mirror ");
		traversals.inorder(obj.root);
		System.out.println();

	}
	
	private void mirrorTree(Node root) {
		if(root != null) {
			Node temp =  root.left;
			root.left = root.right;
			root.right = temp;
			mirrorTree(root.left);
			mirrorTree(root.right);
		}
	}

	//insert new node in the tree
	private void insertNode(int data) {
		Node newNode = getNewNode(data);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent;
		while (true) {
			parent = current;
			if (data < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	//returns the new node
	public Node getNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;

		return node;
	}

	private void constructTree() {
		//int[] treeElements = {8, 3, 10, 1, 6, 14, 4, 7, 13};
		int[] treeElements = {50, 17, 72, 12, 23, 54, 76, 9, 14, 19, 67};
		for (int i = 0 ; i < treeElements.length; i++) {
			insertNode(treeElements[i]);
		}
	}

}

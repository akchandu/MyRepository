package com.study.trees;

public class ReadTrees {

	public void getNodeWithOneChild(Node root) {
		if (root == null) {
			return;
		}
		if ((root.left == null && root.right != null) || (root.right == null && root.left != null)) {
			System.out.print(root.data + " ");
		}
		getNodeWithOneChild(root.left);
		getNodeWithOneChild(root.right);
	}
	
	public void getNodeWithTwoChildren(Node root) {
		if (root == null) {
			return;
		}
		if (root.left != null && root.right != null) {
			System.out.print(root.data + " ");
		}
		getNodeWithTwoChildren(root.left);
		getNodeWithTwoChildren(root.right);
	}
	
	public void getLeaves(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		getLeaves(root.left);
		getLeaves(root.right);
	}
	
	public void getTreePaths(Node root) {
		if (root == null) {
			return;
		}
	}
}

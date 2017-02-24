package com.study.trees;

public class MirrorTree {

	public void mirror (Node root) {
		if (root == null) {
			return;
		}
		Node temp = null;
		mirror(root.left);
		mirror(root.right);
		
		temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	//a=b;
	public void test(String command) {
		
	}

}

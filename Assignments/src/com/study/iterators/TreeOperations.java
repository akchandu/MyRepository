package com.study.iterators;

import java.util.ArrayList;
import java.util.List;

class Node<T> {
	Node<T> left;
	Node<T> right;
	T data;
}

public class TreeOperations<T> {
	
	private List<T> inorderList = new ArrayList<T>();

	Object root;

	public <T> void insertContainerInTree(List<T> container) {
		for (int i = 0; i < container.size(); i++) {
			insertNode(container.get(i));
		}
	}

	public <T> void insertNode(T data) {
		Node<T> newNode = getNewNode(data);
		if (root == null) {
			root = (Node<T>) newNode;
			return;
		}
		Node<T> current = (Node<T>) root;
		Node<T> parent;
		while (true) {
			parent = current;
			if (Integer.valueOf(data.toString()) < Integer.valueOf(current.data.toString())) {
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

	public <T> Node<T> getNewNode(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;

		return newNode;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getInorder() {
		inorder((Node<T>) root);
		return inorderList;
	}
	
	public void inorder(Node<T> root) {
		if (root != null) {
			inorder(root.left);
			inorderList.add(root.data);
			inorder(root.right);
		}
	}

}

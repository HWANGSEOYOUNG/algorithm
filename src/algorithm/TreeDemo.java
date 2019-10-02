package algorithm;

import java.util.ArrayList;
import java.util.List;

public class TreeDemo<T extends Object> implements Tree<T> {
	class Node<T> {
		T data;
		Node parent;
		Node left;
		Node right;
	}

	private Node<T> root;

	public TreeDemo() {

	}

	@Override
	public void addNode(T data) {
		Node newNode = new Node();
		newNode.data = data;

		if (root == null) {
			root = newNode;
		} else {
			Node parent = root;
			while (parent != null) {
				if (parent.data instanceof Comparable) {
					if (((Comparable) parent.data).compareTo(newNode.data) > 0) {
						if (parent.left == null) {
							parent.left = newNode;
							break;
						} else {
							parent = parent.left;
						}
					} else {
						if (parent.right == null) {
							parent.right = newNode;
							break;
						} else {
							parent = parent.right;
						}
					}

				}
			}
		}

	}

	@Override
	public void addLevelNode(T data) {
		Node newNode = new Node();
		newNode.data = data;

		if (root == null) {
			root = newNode;
		} else {
			List<Node> queue = new ArrayList<>();
			queue.add(root);

			while (queue.size() > 0) {
				Node parent = queue.remove(0);

				if (parent.left == null) {
					parent.left = newNode;
					newNode.parent = parent;
					break;
				} else if (parent.right == null) {
					parent.right = newNode;
					newNode.parent = parent;
					break;
				}
				queue.add(parent.left);
				queue.add(parent.right);
			}
		}

	}

	@Override
	public void inOrder() {
		inOrder(root);

	}

	@Override
	public void preOrder() {
		preOrder(root);

	}

	@Override
	public void postOrder() {
		postOrder(root);

	}

	public void inOrder(Node<T> node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.println(" " + node.data);
		inOrder(node.right);

	}

	public void preOrder(Node<T> node) {
		if (node == null)
			return;

		System.out.println(" " + node.data);
		preOrder(node.left);
		preOrder(node.right);

	}

	public void postOrder(Node<T> node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);

	}

	@Override
	public void levelOrder() {
		List<Node> queue = new ArrayList<>();
		queue.add(root);

		while (queue.size() > 0) {
			Node temp = queue.remove(0);

			if (temp == null)
				continue;

			System.out.println(" " + temp.data + (temp.parent == null ? "root" : "(" + temp.parent.data + ")"));
			queue.add(temp.left);
			queue.add(temp.right);
		}

	}

	public static void main(String[] args) {
		Tree tree = new TreeDemo<Integer>();
		
		tree.addLevelNode(1);
		tree.addLevelNode(2);
		tree.addLevelNode(3);
		tree.addLevelNode(4);
		tree.addLevelNode(5);
		tree.addLevelNode(6);
		tree.addLevelNode(7);
		tree.addLevelNode(8);
		tree.addLevelNode(9);
		
		tree.levelOrder();
	}
}

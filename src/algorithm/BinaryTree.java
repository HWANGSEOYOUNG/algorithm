package algorithm;

import java.util.*;

interface Tree <T extends Object> {
    void addNode(T data);
    void addLevelNode(T data);

    void inOrder();
    void preOrder();
    void postOrder();
    void levelOrder();
}

class BinaryTree<T extends Object> implements Tree<T> {
    class Node<T> {
        T data;
        Node parent;
        Node left;
        Node right;
    }
    private Node<T> root;

    public BinaryTree() {
    }

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

    public void addNode(T data) {
        Node newNode = new Node();
        newNode.data = data;

        if (root == null) {
            root = newNode;
        } else {
            Node parent = root;
            while (parent != null) {
                if (parent.data instanceof Comparable) {
                    // less than
                    if (((Comparable)parent.data)
                        .compareTo(newNode.data) > 0) {
                        if (parent.left == null) {
                            parent.left = newNode;
                            break;
                        } else {
                            parent = parent.left;
                        }
                    } else { // equal and great than
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

    private void inOrder(Node<T> node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(" " + node.data);
        inOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void preOrder(Node<T> node) {
        if (node == null)
            return;

        System.out.println(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void postOrder(Node<T> node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(" " + node.data);
    }

    public void postOrder() {
        postOrder(root);
    }

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
        Tree tree = new BinaryTree<Integer>();

        tree.addLevelNode(1);
        tree.addLevelNode(2);
        tree.addLevelNode(3);
        tree.addLevelNode(4);
        tree.addLevelNode(5);
        tree.addLevelNode(6);
        tree.addLevelNode(7);
        tree.addLevelNode(8);
        tree.addLevelNode(9);

        // tree.inOrder();
        // tree.preOrder();
        // tree.postOrder();
        tree.levelOrder();
    }
}
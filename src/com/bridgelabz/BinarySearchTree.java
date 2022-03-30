package com.bridgelabz;

public class BinarySearchTree {

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary Search tree program");
        NodeBinarySearchTree tree = new NodeBinarySearchTree();
        Node node = new Node();
        tree.insert(node, 62);
        tree.insert(node,48);
        tree.insert(node,81);
        tree.insert(node,39);
        tree.insert(node,57);
        tree.insert(node,21);
        tree.insert(node,12);
        tree.insert(node,7);
        tree.insert(node,92);
        tree.insert(node,76);
        tree.insert(node,61);
        tree.insert(node,19);
        tree.insert(node,59);

        System.out.println(" Element present in the tree :: "+ tree.searchNode(node,57));
        System.out.println();
        System.out.println("Level order traversal of binary tree is ");
        tree.inorderTraversal(node);
    }

}
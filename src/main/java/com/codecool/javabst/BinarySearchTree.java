package com.codecool.javabst;

import com.codecool.javabst.modal.Node;

import java.util.*;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {

    Node root;
    List<Node> nodeList = new ArrayList<>();

    public static BinarySearchTree build(List<Node> elements, Node root) {
        // construct a binary search tree here
        BinarySearchTree biSeTr = new BinarySearchTree();
        biSeTr.root = root;
        for (Node node : elements) {
            biSeTr.add(node);
        }
        return biSeTr;
    }

    public void add(Node node) {
        root = addRecursive(root, node);
        nodeList.clear();
        nodeList.add(root);
    }


    private Node addRecursive(Node current, Node newNode) {
        if (current == null) {
            return newNode;
        }

        if (newNode.getValue() < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), newNode));
        } else if (newNode.getValue() > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), newNode));
        } else {
            // value already exists
//            throw new IllegalArgumentException(newNode.toString() +" already exists!");
            return current;
        }
        return current;
    }

    public boolean search(Node toFind) {
        // return true if the element has been found, false if its not in the tree.
        return containsNodeRecursive(root, toFind);
    }

    private boolean containsNodeRecursive(Node current, Node searched) {
        if (current == null) {
            return false;
        }
        if (searched.getValue() == current.getValue()) {
            return true;
        }
        return searched.getValue() < current.getValue()
                ? containsNodeRecursive(current.getLeft(), searched)
                : containsNodeRecursive(current.getRight(), searched);
    }

    public void remove(Node toRemove) {
        //  removes an element. Throws an error if its not on the tree.
        root = removeRecursive(root, toRemove);

    }

    private Node removeRecursive(Node current, Node deleting) {
        if (current == null) {
            return null;
        }

        if (deleting.getValue() == current.getValue()) {
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            if (current.getRight() == null) {
                return current.getLeft();
            }

            if (current.getLeft() == null) {
                return current.getRight();
            }
            Integer smallestValue = findSmallestValue(current.getRight());
            current.setValue(smallestValue);
            current.setRight(removeRecursive(current.getRight(), current));
            return current;
        }
        if (deleting.getValue() < current.getValue()) {
            current.setLeft(removeRecursive(current.getLeft(), deleting));
            return current;
        }
        current.setRight(removeRecursive(current.getRight(), deleting));
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getValue() : findSmallestValue(root.getLeft());
    }

}

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

    public boolean search(Integer toFind) {
        // TODO return true if the element has been found, false if its not in the tree.
        return false;
    }

    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
    }

}

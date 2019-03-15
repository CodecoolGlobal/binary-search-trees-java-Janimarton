package com.codecool.javabst;

import com.codecool.javabst.modal.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        List<Node> nodes = new ArrayList<>();
        Node node12 = new Node(12);
        nodes.add(node12);
        Node node5 = new Node(5);
        nodes.add(node5);
        nodes.add(new Node(36));
        nodes.add(new Node(1));
        nodes.add(new Node(3));
        Node rootNode = new Node(6);


//        GraphPlotter graphPlotter = new GraphPlotter(nodes);


//         write some test code here
//        System.out.println(myTree.search(new Node(1))); // should be true
//        System.out.println(myTree.search(new Node(12))); // should be true
//        System.out.println(myTree.search(new Node(4))); // should be false
        Node node7 = new Node(7);
        nodes.add(node7);

        Node node10 = new Node(10);
        nodes.add(node10);

        BinarySearchTree myTree = BinarySearchTree.build(nodes, rootNode);

        printNodes(myTree);

        myTree.remove(node7);
        System.out.println("========= deleted: 7");
        printNodes(myTree);

        myTree.remove(node5);
        System.out.println("========= deleted: 5");
        printNodes(myTree);

        myTree.remove(node12);
        System.out.println("========= deleted: 12");
        printNodes(myTree);

        System.out.println("done");
    }

    private static void printNodes(BinarySearchTree myTree) {
        for (Node node : myTree.nodeList) {
            System.out.println(node.toString() + "\n");
        }
    }
}
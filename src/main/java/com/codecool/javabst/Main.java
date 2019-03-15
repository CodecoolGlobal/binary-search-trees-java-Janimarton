package com.codecool.javabst;

import com.codecool.javabst.modal.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node(12));
        nodes.add(new Node(5));
        nodes.add(new Node(36));
        nodes.add(new Node(1));
        nodes.add(new Node(3));
        Node rootNode = new Node(6);

        BinarySearchTree myTree = BinarySearchTree.build(nodes, rootNode);

        for (Node node : myTree.nodeList) {
            System.out.println(node.toString());
        }
//        GraphPlotter graphPlotter = new GraphPlotter(nodes);


//         write some test code here
        System.out.println(myTree.search(new Node(1))); // should be true
        System.out.println(myTree.search(new Node(12))); // should be true
        System.out.println(myTree.search(new Node(4))); // should be false


        System.out.println("done");
    }
}
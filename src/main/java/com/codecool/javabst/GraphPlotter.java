package com.codecool.javabst;

import com.codecool.javabst.modal.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.*;

import java.util.List;

public class GraphPlotter {

    private Graph graph;

    GraphPlotter(List<Node> points) {
        graph = new SingleGraph("Binary Tree");
        // add all nodes to the graph.
        for (Node node : points) {
            org.graphstream.graph.Node newNode = graph.addNode(Long.toString(node.getId()));
            newNode.addAttribute("ui.label", node.getValue() + " " + " (" + node.getId() + ")");
        }

//        for (Node node : points) {
//            for (Node n1 : node.getChildren()) {
//                String leftKey = Long.toString(node.getId());
//                String rightKey = Long.toString(n1.getId());
//                String edgeId = leftKey + "-" + rightKey;
//                if (graph.getEdge(edgeId) == null && graph.getEdge(rightKey + "-" + leftKey) == null) {
//                    graph.addEdge(leftKey + "-" + rightKey, leftKey, rightKey);
//                }
//            }
//        }
        graph.addEdge("1", 1, 2);
        graph.addEdge("2", 1, 4);


        graph.addAttribute("ui.quality");
        graph.addAttribute("ui.antialias");
        graph.addAttribute("ui.stylesheet",
                "graph {" +
                        "fill-color: #c0ffe3;" +
                        "}" +
                        "node {" +
                        "size: 6px;" +
                        "fill-color: #ddddff;" +
                        "text-color: #444;" +
                        "text-size: 10gu;" +
                        "z-index: 1;" +
                        "}" +
                        "node.highlight {" +
                        "size: 14px;" +
                        "fill-color: #222;" +
                        "text-color: #222;" +
                        "z-index: 2;" +
                        "}" +
                        "node.first{" +
                        "size: 18px;" +
                        "fill-color: #388E3C;" +
                        "text-color: #388E3C;" +
                        "z-index: 2;" +
                        "}" +
                        "node.last {" +
                        "size: 18px;" +
                        "fill-color: #d32f2f;" +
                        "text-color: #d32f2f;" +
                        "z-index: 2;" +
                        "}" +
                        "edge {" +
                        "shape: line;" +
                        "fill-color: #999;" +
                        "arrow-size: 3px, 2px;" +
                        "z-index: 0;" +
                        "}" +
                        "edge.highlight {" +
                        "fill-color: #222;" +
                        "}"
        );
        graph.display();
    }
}

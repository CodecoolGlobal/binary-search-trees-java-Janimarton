package com.codecool.javabst.modal;

public class Node {

    private long id;
    private static long idCounter = 0;
    private Integer value;
//    private Node parent;

    private Node right;
    private Node left;
//    private Node[] children = new Node[2];


    public Node(Integer value) {
        this.id = idCounter;
        idCounter++;
        this.value = value;
        left = null;
        right = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public static void setIdCounter(long idCounter) {
        Node.idCounter = idCounter;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

package com.stack;

import java.util.EmptyStackException;

public class CustomStack {
    int length = 0;
    Node top = null;

    public CustomStack() {}

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node tempNode = new Node(data);
        tempNode.setNextNode(top);
        top = tempNode;
        length++;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Node node = top;
        top = top.getNextNode();
        length--;
        return node.getData();
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getData();
    }
}

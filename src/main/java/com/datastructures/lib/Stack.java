package com.datastructures.lib;

public class Stack<T> {
    private Node<T> top;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) throw new RuntimeException("Stack is empty");

        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

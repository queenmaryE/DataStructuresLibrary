package com.datastructures.lib;

public class Queue<T> {
    private Node<T> front, rear;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (front == null) throw new RuntimeException("Queue is empty");

        T data = front.data;
        front = front.next;

        if (front == null) rear = null;
        return data;
    }

    public T peek() {
        if (front == null) throw new RuntimeException("Queue is empty");
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

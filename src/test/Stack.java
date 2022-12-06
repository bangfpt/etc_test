package test;

public class Stack<T> {
    class Node<T> {
        T value;
        Node prev;

        public Node(T value) {
            this.value = value;
        }
    }
    Node top, tailNode;

    public Stack() {
    }

    void push(T value) {
        Node node = new Node(value);
        if (top == null && tailNode == null) {
            top.value = value;
            return;
        } else {
            Node newNode = new Node<T>(value);
            newNode.value = value;
            newNode.prev = top;
            top = newNode;
        }
    }

    void pop(Node<T> node) {
        if (top == null) {
            return;
        }
        if (top.value == null) {
            return;
        }
        top = node.prev;
        pop(node.prev);
    }
}

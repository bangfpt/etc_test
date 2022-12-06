package test;


public class Queue {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;

    public boolean push(int value) {
        Node node = new Node(value);
        if (headNode == null && tailNode == null) {
            headNode = tailNode = node;
        } else {
            tailNode.next = node;
            tailNode = node;
        }
        return false;
    }

    public int pop() {
        if (headNode == null && tailNode == null) {
            System.out.println("empty");
        }
        int value = headNode.value;
        headNode = headNode.next;
        return value;
    }

    public void show() {
        if (headNode == null && tailNode == null) {
            System.out.println("empty");
            return;
        } else {
            Node temp = headNode;
            while (temp != null) {
                System.out.println(temp.value + " ");
                temp = temp.next;
            }
        }
    }

}
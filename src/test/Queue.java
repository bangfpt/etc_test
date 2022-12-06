package test;


public class Queue {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, lastNode;

    public boolean deQueue(int value) {
        Node node = new Node(value);
        if (headNode == null && lastNode == null) {
            headNode = lastNode = node;
        } else {
            lastNode.next = node;
            lastNode = node;
        }
        return false;
    }

    public int enQueue() {
        if (headNode == null && lastNode == null) {
            System.out.println("empty");
        }
        int value = headNode.value;
        headNode = headNode.next;
        return value;
    }

//    public void show() {
//        if (headNode == null && lastNode == null) {
//            System.out.println("empty");
//            return;
//        } else {
//            Node temp = headNode;
//            while (temp != null) {
//                System.out.println(temp.value + " ");
//                temp = temp.next;
//            }
//        }
//    }

}
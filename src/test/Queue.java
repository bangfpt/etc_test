package test;


public class Queue {
    private class Node {
        int value;
        Node pre;
        Node(int value) {
            this.value = value;
        }
    }
    Node preNode, node;
    Queue(){
        preNode = null;
    }



    public boolean enQueue(int value) {

        node = new Node(value);
        node.pre = preNode;
        preNode = node;
        return true;
    }

    void dequeue(Node e) {

        if (e == null) {
            e.value = Integer.parseInt(null);
            return ;
        }
        if(e.pre.pre == null){
            e.pre = null;
            return ;
        }
        dequeue(e.pre);
    }

    public void show() {
        if (preNode == null) {
            System.out.println("empty");
            return;
        } else {
            Node temp = preNode;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.pre;
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 5; i++) {
            queue.enQueue(i);
        }
        queue.show();
        queue.dequeue(queue.preNode);
        queue.show();
    }
}



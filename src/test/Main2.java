package test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       //  push( 3);
//        System.out.println(stack.length);
        //peak();
    }

//    static int top;
//    static int[] stack;
//    static int count = 0;
//    static Scanner scanner = new Scanner(System.in);
//
//    static void push(int size) {
//        stack = new int[size];
//        for (int i = 0; i <= size; i++) {
//            count++;
//        }
//        if (count == size) {
//            System.out.println("full");
//            return;
//        } else if (count == 0) {
//            System.out.println("empty");
//            return;
//        } else {
//            System.out.println("Nhập các phần tử cho mảng");
//            for (int i = 0; i < size; i++) {
//                System.out.print("Nhập phần tử thứ " + i + ": ");
//                stack[i] = scanner.nextInt();
//            }
//            System.out.println("Nhập số nguyên để push:  ");
//            int k = scanner.nextInt();
//
//            stack = insert(stack, k);
//            System.out.println("mảng sau khi push: ");
//            for (int i = 0; i < size+1; i++) {
//                System.out.println(stack[i] + " ");
//            }
//        }
//    }
//
//    public static int[] insert(int[] arr, int k) {
//        int arrIndex = arr.length - 1;
//        int tempIndex = arr.length;
//        int[] tempArr = new int[tempIndex + 1];
//        boolean inserted = false;
//
//        for (int i = tempIndex; i >= 0; i--) {
//            if (arrIndex > -1 && arr[arrIndex] > k) {
//                tempArr[i] = arr[arrIndex--];
//            } else {
//                if (!inserted) {
//                    tempArr[i] = k;
//                    inserted = true;
//                } else {
//                    tempArr[i] = arr[arrIndex--];
//                }
//            }
//        }
//        return tempArr;
//    }
//
//    static void pop(int item, int size) {
//        for (int i = 0; i <= size; i++) {
//            count++;
//        }
//        if (count == 0) {
//            System.out.println("empty");
//        } else {
//            for (int i = 0; i < size; i++) {
//                if (stack[i] != stack[0]) {
//
//                }
//            }
//        }
//    }
//
//    static int peak() {
//        System.out.println(stack[top]);
//        return stack[top];
//    }
//}

    class StackCustom<T> {

        class Node<T> {
            T value;
            Node prev;

            public Node(T value) {
                this.value = value;
            }
        }

        Node top, tailNode;

        public StackCustom() {
        }

        void add(T value) {
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


    class Queue {

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

    class Map<K, V> {
        class Node<K, V> {
            K key;
            V value;

            Node<K, V> previous;

            public Node(K key, V value, Node node) {
                this.key = key;
                this.value = value;
                this.previous = node;
            }
        }

        public Node node = null;

        public Map() {
        }

        void add(K key, V value) {
            node = new Node(key, value, node);
        }

        Object get(K key) {
            for (Node e = node; node != null; e = node.previous) {
                if (e.key == key) {
                    return e.value;
                }
            }
            return null;
        }

        Boolean remove(K key) {
            for (Node e = node; node != null; e = node.previous) {
                if (e.key == key) {
                    e = e.previous;
                    return true;
                }
                if (e.previous.key == key) {
                    e.previous = e.previous.previous;
                    return true;
                }

            }
            return false;
        }
    }
}

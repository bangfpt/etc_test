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



}

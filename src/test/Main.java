//package test;
//
//
//
//import sun.rmi.runtime.Log;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Posc posc = new Posc("ac", "aaaa", "bbbb", "vvvvv");
//        posc.sizePost = "12333";
//        posc.maxSize(posc.sizePost);
//        System.out.println();
//        Clas();
//
//    }
//
//    private static void Clas() {
//        List<Car> carList = new ArrayList<>();
//        carList.add(new Car("12", "1", "111", "111"));
//        System.out.println(carList);
//
//        Stack<String> stack = new Stack<>();
//        stack.push("111");
////        stack.push("2");
////        stack.push("3");
////        stack.push("4");
////        System.out.println(stack);
////        stack.remove(0);
////        System.out.println(stack);
//        Stack<Car> stack = new Stack<>();
//        stack.push(new Car("123", "333", "ac", "abcx"));
//        stack.push(new Car("2", "4", "v", "abcx"));
//        stack.push(new Car("3", "5", "a", "abcx"));
//
////        Iterator iterator = stack.iterator();
////        while (iterator.hasNext()){
////            Object value = iterator.next();
////            System.out.println(value);
////        }
//        String title ="";
//        for(Object value: stack){
//            title = value.toString();
//        }
//        System.out.println(title);
//
//        Queue<String> quene = new ArrayDeque<String>();
//        quene.add("111");
//        quene.add("2");
//        quene.add("3");
//        quene.add("4");
//        System.out.println(quene);
//        quene.remove();
//        System.out.println(quene);
//        System.out.println(quene.poll());
//        System.out.println(quene.peek());
//
//        Queue<String> linked = new LinkedList<>();
//        linked.add("12333");
//        linked.add("3");
//        linked.add("4");
//        linked.add("5");
//        System.out.println(linked);
//        linked.remove();
//        System.out.println(linked);
//        System.out.println(linked.poll());
//        System.out.println(linked);
//        System.out.println(linked.peek());
//        System.out.println(linked);
//    }
//}
//
////    public class Main {
////        public static void main(String[] args) {
////            for (int i = 0; i < size ; i++){
////                enqueue(i);
////            }
////            System.out.println(queue);
////        }
////
////        static int size = 10;
////        static int Front = 0;
////        static int Rear = -1;
////        int count;
////        static int[] queue = new int[];
////
////
////        private static final boolean isEmpty() {
////            return (Front < 0 || Front > Rear) ? true : false;
////        }
////
////        private static boolean isFull() {
////            return Rear == size - 1 ? true : false;
////        }
////
////
////        private static void enqueue(int item) {
////            if (isFull()) {
////                return;
////            }
////            Rear++;
////            queue[Rear] = item;
////        }
////
////        private static void dequene(int item) {
////            if (isEmpty()) {
////                return;
////            }
////            queue[Front] = item;
////            Front++;
////        }
////    }
////}
//
//

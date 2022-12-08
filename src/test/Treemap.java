package test;

import javax.swing.plaf.IconUIResource;
import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class Treemap<K, V> {

    public Entry<K, V> entry, pre, temp;
    ArrayList<K> listKey = new ArrayList<>();

    public Treemap() {
    }

    boolean isEmpty() {
        return entry == null;
    }

    void addKeyMap(K key, V value) {
        pre = entry;
        entry = new Entry<>(key, value, null);

        entry.pre = pre;

//        System.out.println(entry.key);
    }

    Entry<K, V> max (MyFunction<Entry<K, V>, Boolean> compare, Entry<K, V> entry) {
        Entry<K, V> current = entry;
        for (Entry<K, V> i = entry; i != null; i = i.pre) {
            if(compare.apply(i, current)) {
                current = i;
            }
        }
        return current;
    }
    void mySort (MyFunction<Entry<K, V>, Boolean> compare) {
        for (Entry<K, V> i = entry; i != null; i = i.pre) {
            Entry<K,V> max = max(compare, i);
            Entry<K,V> max2 = max(compare, i).clone();
            max.key = i.key;
            max.value = i.value;
            i.key = max2.key;
            i.value = max2.value;
        }
    }
    void sort() {
        for (Entry<K, V> x = entry; x != null; x = x.pre) {
            listKey.add(x.key);
        }
        int count = listKey.size();
        System.out.println(count + "    123333333");

        for (Entry<K, V> i = entry; i != null; i = i.pre) {

            System.out.println(123333);
            for (Entry<K, V> j = i; j != null; j = j.pre) {
                if (j.pre == null) {
                    return;
                }
                if(Integer.parseInt(j.key.toString()) < Integer.parseInt(j.pre.key.toString())){
                    if(j == entry){
                        Entry<K, V> temp  = entry;
                        temp.pre = entry.pre.pre;
                        entry = entry.pre;
                        entry.pre = temp;
                    }else{
                        Entry<K, V> temp  = j;
                        temp.pre = j.pre.pre;
                        j = j.pre;
                        j.pre = temp;
                    }
                }
            }
        }
    }


//    void remove(K key) {
//        for (Entry<K, V> e = entry; e != null; e = e.next) {
//            final Entry<K, V> left = e.next;
//            if (key.equals(e.key)) {
//                entry = null;
//                return;
//            }
//            if (key.equals(left.key) && left.next == null) {
//                e.next = null;
//                return;
//            }
//        }
//    }

    void show() {
        Entry n = entry;
        while (n != null) {
            System.out.println(n.key + " " + n.value);
            n = n.pre;
        }

    }

    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> pre;

        Entry(K key, V value, Entry node) {
            this.key = key;
            this.value = value;
            this.pre = node;
        }

        public Entry<K, V> clone() {
            return new Entry<>(key, value, null);
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Treemap.Entry)) {
                return false;
            } else {
                Entry<?, ?> entry = (Entry<?, ?>) o;
                return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
            }
        }

    }

    public static void main(String[] args) {
        Treemap<Integer, Integer> treemap = new Treemap<>();

        treemap.addKeyMap(1, 1);
        treemap.addKeyMap(4, 4);
        treemap.addKeyMap(0, 0);
        treemap.addKeyMap(3, 3);
        treemap.addKeyMap(2, 2);

        treemap.show();
        treemap.mySort((a, b) -> a.key < b.key);
//        treemap.sort();
        treemap.show();
    }
}

interface MyFunction<T, R> {

    R apply(T t1, T t2);
}




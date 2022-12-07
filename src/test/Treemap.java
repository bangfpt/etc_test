package test;

import java.util.Comparator;
import java.util.Objects;

public class Treemap<K, V> {
    class Entry {
        K key;
        V value;
        Entry left;
        Entry right;


        Entry(K key, V value, Entry node) {
            this.key = key;
            this.value = value;
            this.left = node;
            this.right = null;
            if (node != null) {
                this.right = this;
            }
        }

        public boolean equals(Object o) {
            if (!(o instanceof Treemap.Entry))
                return false;
            Entry e = (Entry) o;

            return compare(key, e.key) && compare(value, e.value);
        }


        final boolean compare(Object o1, Object o2) {
            return (Objects.equals(o1, o2));
        }

    }


    public Entry entry = null;

    public Treemap() {
    }

    void addKeyMap(K key, V value) {
        Comparator<? super K> cpr = null;
        entry = new Entry(key, value, entry);
        Entry t = entry;

        int compare = cpr.compare(key, t.key);
        if (key == null) {
            return;
        }
        if (key == t.key) {
            return;
        } else {
            if (compare < 0) {
                entry = entry.left;
            } else if (compare > 0) {
                entry = entry.right;
            }

        }

    }
    Boolean remove(K key) {
        for (Entry e = entry; entry != null; e = entry.left) {
            if (e.key.equals(key)) {
                if (e.left == null) {
                    e = e.right;
                    e.left = null;

                } else if (e.right == null) {
                    entry = entry.left;
                    entry.right = null;
                } else {
                    e.left.right = e.right;
                    e.right.left = e.left;
                }
                return true;
            }
        }
        return false;
    }

    void show() {
        Entry n = entry;
        while (n != null) {
            System.out.println(n.key + " " + n.value);
            n = n.left;
        }
    }


}





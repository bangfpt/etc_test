package test;

public  class Map<K, V> {
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
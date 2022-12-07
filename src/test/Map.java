package test;

public  class Map<K, V> {
    class Node<K, V> {
        K key;
        V value;

        Node<K, V> previous, next;

        public Node(K key, V value, Node node) {
            this.key = key;
            this.value = value;
            this.previous = node;
            this.next = node;
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

    Boolean remove(K key){
        for(Node n = node ; n != null ; n = n.previous){
            if(n.key.equals(key)){
                if(n.previous == null){
                    n = n.next;
                    n.previous = null;

                }else if(n.next == null){
                    node = node.previous;
                    node.next=null;
                    System.out.println(n.next);
                }else{
                    n.previous.next = n.next;
                    n.next.previous = n.previous;
                }
                return true;
            }

        }
        return false;
    }
}
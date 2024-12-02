package HashmapImpl.src;

import java.util.Arrays;

public class Hashmap<K, V> {

    public final int INITIAL_SIZE = 1 << 4;
    public final int MAX_CAPACITY = 1 << 30;

    private Node<K,V>[] nodes;

    public Hashmap() {
        nodes = new Node[INITIAL_SIZE];
    }

    public Hashmap(int size) {
        int powered_size = tableToConvertToNearestPowOf2(size - 1);
        nodes = new Node[powered_size];
    }

    private int tableToConvertToNearestPowOf2(int size) {
        size |= size >>> 1;
        size |= size >>> 2;
        size |= size >>> 4;
        size |= size >>> 8;
        size |= size >>> 16;
        return size + 1;
    }

    public V get(K key) {
        int hashcode = key.hashCode() % nodes.length;
        Node<K, V> node = nodes[hashcode];
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            } else {
                node = node.next;
            }
        }

        return null;
    }

    public void put(K key, V value) {
        int hashcode = key.hashCode() % nodes.length;
        Node<K, V> node = nodes[hashcode];

        if (node == null) {
            nodes[hashcode] = new Node<>(key, value);
            return;
        } else {
            Node<K, V> prevNode = null;

            while (node != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                } else {
                    prevNode = node;
                    node = node.next;
                }
            }

            prevNode.next = new Node<>(key, value);
        }
    }

    @Override
    public String toString() {
        return "Hashmap{" +
                " nodes=" + Arrays.toString(nodes) +
                '}';
    }

}

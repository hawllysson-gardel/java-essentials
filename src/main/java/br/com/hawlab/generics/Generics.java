package br.com.hawlab.generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Pair other = (Pair) obj;
        if(key == null) {
            return other.key == null;
        } else return key.equals(other.key);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }
}

class Pairs<K extends Number, V> {
    private final Set<Pair<K, V>> items = new HashSet<>();

    public void add(K key, V value) {
        if(key == null) return;

        Pair<K, V> newPair = new Pair<>(key, value);

        items.remove(newPair);
        items.add(newPair);
    }

    public V getValue(K key) {
        if(key == null) return null;

        Optional<Pair<K, V>> optionalPair = items.stream().filter(pair -> key.equals(pair.getKey())).findFirst();

        return optionalPair.map(Pair::getValue).orElse(null);
    }
}


public class Generics {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Generics");

        Pairs<Integer, String> pairs = new Pairs<>();

        pairs.add(1, "Maria");
        pairs.add(2, "Pedro");
        pairs.add(3, "Gui");
        pairs.add(4, "Ana");
        pairs.add(2, "Rebeca");

        System.out.println(pairs.getValue(1));
        System.out.println(pairs.getValue(2));
        System.out.println(pairs.getValue(4));

        System.out.println("------------------------------------------");
    }
}

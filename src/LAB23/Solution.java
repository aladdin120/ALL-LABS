package LAB23;

//part 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static class Union<K, V> {
        K key;
        V value;

        public Union(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public <T> ArrayList<T> newArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<T>();
        list.addAll(Arrays.asList(arr));
        return list;
    }

    public <T> HashSet<T> newHashSet(T[] arr) {
        HashSet<T> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(arr));
        return hashSet;
    }

    public <K, V> HashMap<K, V> newHashMap(Union<K,V>[] arr) {
        HashMap<K,V> hashMap = new HashMap<>();
        for (Union<K,V> elem : arr){
            hashMap.put(elem.key, elem.value);
        }
        return hashMap;
    }


}

//Time Based Key-Value Store
/*
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

//Path-Value-Timestamp
//Path is the common HashMap key
//by searching timestamp we will collect value

//WE are using TreeMap
//Red-Black-Tree
//Key-Value-Extra Bit (difference Maker)
//Here we use BST also so Time= O(log n)


import java.util.*;
public class leetcode_981 {
    private Map<String, TreeMap<Integer, String>> map;

    public leetcode_981() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap == null) {
            return "";
        }
//        checking TimeStamp
        Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}

package DataStructuresAlgorithm.HASHMAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HASHMAP_LINKEDHASHMAP {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Indian",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Indian",100);
        lhm.put("China",150);
        lhm.put("US",50);
        System.out.println(lhm);

        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("Indian",100);
        thm.put("China",150);
        thm.put("US",50);
        System.out.println(thm);
    }
}

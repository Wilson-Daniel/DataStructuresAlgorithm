package DataStructuresAlgorithm.HASHMAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HASHMAP_Find_Itinerary_From_ticket {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        String start = getStart(map);
        ArrayList<String> ans = new ArrayList<>();
        ans.add(start);
        for(String keys : map.keySet()){//for jitni keys hy itna loop run krne ke liye
            ans.add(map.get(start));
            start = map.get(start);
        }
        System.out.println(ans);
    }
}

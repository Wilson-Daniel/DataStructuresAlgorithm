package DataStructuresAlgorithm.HASHMAP;
import java.util.HashMap;
import java.util.Set;
public class HASHMAP_Implementation {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);

        int popul = hm.get("India");
        System.out.println(popul);

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //System.out.println(hm.remove("China"));
        //System.out.println(hm);

        Set<String> keys = hm.keySet();
        for(String k : keys){
            System.out.println("Key:"+k+" Value:"+hm.get(k));
        }
        System.out.println(hm.entrySet());
    }
}

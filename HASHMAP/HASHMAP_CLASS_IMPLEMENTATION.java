package DataStructuresAlgorithm.HASHMAP;


import java.util.ArrayList;
import java.util.LinkedList;

public class HASHMAP_CLASS_IMPLEMENTATION {
    public static class HashMap<K,V>{
        private class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;//n
        private LinkedList<Node> buckets[];
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0 ; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        //---------------------------------------------------
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll= buckets[bi];
            int di =0;
            for(int i=0 ; i<ll.size() ; i++){
                Node node  = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        //-----------------rehash-------------------------
        private void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            N=N*2;
            for(int i=0 ; i<buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0 ; i<oldBucket.length ; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        //---------------PUT function------------------
        public void put(K key,V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda =(double) n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        //---------------------MAIN-------------------------
        public static void main(String[] args) {
            HashMap<String, Integer> hm = new HashMap();
            hm.put("India",100);
            hm.put("US",50);
            hm.put("China",150);
            hm.put("Nepal",5);
            System.out.println(hm.containKey("India"));
            ArrayList<String> keys = hm.keySet();
            System.out.println(keys);
            System.out.println(hm.get("India"));
            System.out.println(hm.remove("India"));
            System.out.println(hm.get("India"));
        }
        //--------------------------------------------------
        //--------------containsKey()----------------------
        public boolean containKey(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);
            if(di != -1){
                return true;
            }else{
                return false;
            }
        }
        //-----------------remove()-------------------------
        public V remove(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }
        //-------------------get()------------------
        public V get(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }
        //-------------------keySet()-------------
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0 ; i<buckets.length ; i++){
                LinkedList<Node> ll =buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        //------------------isEmpty----------------
        public boolean isEmpty(){
            return n==0;
        }
    }
}

package DataStructuresAlgorithm.DAY__68.RECURSION_ASSIGNMWNT;

public class Q4 {
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(substring(s,0,0,0));
    }
    public static int substring(String s,int idx, int lastIdx,int count){
        if(s.length()==0){
            return 0;
        }
        if(idx == s.length()){
            return 0;
        }

        String small = s.substring(lastIdx,idx);
        substring(s,idx+1,lastIdx,count);
        if(small.charAt(lastIdx) == small.charAt(idx)){
            count++;
        }
        substring(s.substring(1),idx+1,lastIdx+1,count);
        return count;
    }
}

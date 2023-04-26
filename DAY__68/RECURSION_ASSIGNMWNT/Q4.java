package DataStructuresAlgorithm.DAY__68.RECURSION_ASSIGNMWNT;

public class Q4 {
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(substring(s,0,s.length()-1,s.length()));
    }
    public static int substring(String s,int idx, int lastIdx,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int  count = substring(s,idx+1,lastIdx,n-1)+substring(s,idx,lastIdx-1,n-1) - substring(s,idx+1,lastIdx-1,n-2);
        return count;
    }
}

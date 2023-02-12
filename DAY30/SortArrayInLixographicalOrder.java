package DataStructuresAlgorithm.DAY30;

public class SortArrayInLixographicalOrder {
    public static void main(String[] args) {
        String[] arr = {"abs","c","s","fg","sdf"};
//        lixographical(arr,5);
//        for (String i:arr){
//            System.out.print(i+" ");
//        }
        String s = "acb";
        String c = "l";
        System.out.println(arr[0].compareTo(arr[3]));
        System.out.println(lixo(s));
    }
    public static void lixographical(String[] arr, int n){
        for(int i=0 ; i<n ; i++){
            int minInd = i;
            for(int j= i+1 ; j<n ;j++){
                if((arr[i].compareTo(arr[minInd]) < 0)){
                    minInd = j;
                }
                String temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }
    }
    public static long lixo(String S){
        int n = S.length();
        // Code here
        long ans = 0;
        String[] arr = new String[n];
        for(int i= 0 ; i<n ; i++){
            arr[i] = String.valueOf(S.charAt(i));
            System.out.println(arr[i]);
        }
        for(int i=0 ; i<n ; i++){
            int minInd = i;
            for(int j= i+1 ; j<n ;j++){
                if((arr[i].compareTo(arr[minInd]) < 0)){

                    minInd = j;
                    ans++;
                }
                String temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }

        return ans;
    }
}

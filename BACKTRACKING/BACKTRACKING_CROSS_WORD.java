package DataStructuresAlgorithm.BACKTRACKING;

import static DataStructuresAlgorithm.BACKTRACKING.BACKTRACKING_N_QUEEN.print;

public class BACKTRACKING_CROSS_WORD {
    public static void main(String[] args) {
        char[][] arr = {{'+','+','+','+','+','+','+','+','+','+'},
                        {'+','-','-','-','-','-','-','+','+','+'},
                        {'+','+','+','-','+','+','+','+','+','+'},
                        {'+','+','+','-','+','+','+','+','+','+'},
                        {'+','+','+','-','-','-','-','-','+','+'},
                        {'+','+','+','-','+','+','-','+','+','+'},
                        {'+','+','+','+','+','+','-','+','+','+'},
                        {'+','+','+','+','+','+','-','+','+','+'},
                        {'+','+','+','+','+','+','-','+','+','+'},
                        {'+','+','+','+','+','+','+','+','+','+'},
        };
        String[] words = {"POLAND","LHASA","SPAIN","INDIA"};
        solution(arr,words,0);

    }
    public static void solution(char[][] arr,String[] words,int vidx){
        if(vidx == words.length){
            printArr(arr);
            return;
        }
        String word = words[vidx];
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                if(arr[i][j] == '-' || arr[i][j]==word.charAt(0)){
                    if(canPlaceWordHorizontally(arr,word,i,j)){
                        boolean[] wePlaced = placeWordHorizontally(arr,word,i,j);
                        solution(arr,words,vidx+1);
                        unplaceWordHorizontally(arr,wePlaced,i,j);
                    }
                    if(canPlaceWordVertically(arr,word,i,j)){
                        boolean[] wePlaced = placeWordVertically(arr,word,i,j);
                        solution(arr,words,vidx+1);
                        unplaceWordVirtically(arr,wePlaced,i,j);
                    }
                }
            }
        }
    }
    public static boolean canPlaceWordHorizontally(char[][] arr,String word,int i,int j){
        if(j-1>=0 && arr[i][j-1] != '+'){//ya toh khali hy ya fir koi or character hy
            return false;// ya toh boundary khtm ho jani chaiye ya first or last pe + nhi hona chaiye
        }else if(j+word.length()<arr[0].length && arr[i][j+word.length()] != '+'){
            return false;
        }
        for(int jj=0 ; jj<word.length() ; jj++){
            if(j+jj >= arr[0].length){
                return false; // kahi board se bht to nhi chla gya hy
            }
            if(arr[i][j+jj]=='-' || arr[i][j+jj]==word.charAt(jj)){
                continue;
            }else{
                return false; //means _ be nhi pda of apna first character bhi nhi pda to mtlb koi or character pda hy

            }
        }
        return true;
    }
    public static boolean[] placeWordHorizontally(char[][] arr,String word,int i,int j){
        boolean[] wePlaced = new boolean[word.length()]; //ye humne dala hy
        for(int jj=0 ; jj<word.length() ; jj++){
            if(arr[i][j+jj] == '-'){
                arr[i][j+jj] = word.charAt(jj);
                wePlaced[jj] = true;
            }
        }
        return wePlaced;
    }
    public static void unplaceWordHorizontally(char[][] arr,boolean[] wePlaced,int i,int j){
        for(int jj=0 ; jj<wePlaced.length ; jj++){
            if(wePlaced[jj] == true){
                arr[i][j+jj] = '-';
            }
        }
    }
    public static boolean canPlaceWordVertically(char[][] arr,String word,int i,int j){
        if(i-1>=0 && arr[i-1][j] != '+'){
            return false; // ya toh boundary khtm ho jani chaiye ya first or last pe + nhi hona chaiye
        }else if(i+word.length()<arr.length && arr[i+word.length()][j] != '+'){
            return false;
        }
        for(int ii=0 ; ii<word.length() ; ii++){
            if(i+ii >= arr.length){
                return false; // kahi board se bht to nhi chla gya hy
            }
            if(arr[i+ii][j]=='-' || arr[i+ii][j]==word.charAt(ii)){
                continue;
            }else{
                return false; //means _ be nhi pda of apna first character bhi nhi pda to mtlb koi or character pda hy

            }
        }
        return true;
    }

    public static boolean[] placeWordVertically(char[][] arr,String word,int i,int j){
        boolean[] wePlaced = new boolean[word.length()]; //ye humne dala hy
        for(int ii=0 ; ii<word.length() ; ii++){
            if(arr[i+ii][j] == '-'){
                arr[i+ii][j] = word.charAt(ii);
                wePlaced[ii] = true;
            }
        }
        return wePlaced;
    }
    public static void unplaceWordVirtically(char[][] arr,boolean[] wePlaced,int i,int j){
        for(int ii=0 ; ii<wePlaced.length ; ii++){
            if(wePlaced[ii] == true){
                arr[i+ii][j] = '-';
            }
        }
    }
    public static void printArr(char[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

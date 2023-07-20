package DataStructuresAlgorithm.STRINGS;

public class STRING_Given_A_Route {
    public static float findDisplacement(String str){
        int x=0;
        int y=0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='W'){
                x--;
            }else if(ch=='E'){
                x++;
            }else if(ch=='N'){
                y++;
            }else{
                y--;
            }
        }
        double dis = Math.sqrt(x*x+y*y);
        return (float)dis;
    }
    public static void main(String[] args) {
        System.out.println(findDisplacement("NSS"));

    }
}

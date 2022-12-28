package DataStructuresAlgorithm.DAY4;

public class LargestOf3Digits {
    public static void main(String[] args) {
        int a=16;
        int b=15;
        int c=19;
//        if(a>b){
//            if(a>c){
//                System.out.println("a");
//            }else{
//                System.out.println("c");
//            }
//        }else{
//            if(b>c){
//                System.out.println("b");
//            }else{
//                System.out.println("c");
//            }
//        }
        if(a>b && a>c){
            System.out.println(a);
        }else{
            if(b>a && b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}

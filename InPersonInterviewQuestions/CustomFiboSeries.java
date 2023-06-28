package DataStructuresAlgorithm.InPersonInterviewQuestions;

public class CustomFiboSeries {
    public static void main(String[] args) {
        int N = 6;
        int k=3;
        int a=0;
        int b=1;
        for(int i=0 ; i<N ; i++){
            if(i<k){
                System.out.print("1 ");
                a=b=1;
            }else{
                int c = a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}

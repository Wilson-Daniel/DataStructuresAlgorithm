package DataStructuresAlgorithm.DAY4;

public class PointInsideCircleOrNot {
    public static void main(String[] args) {
        int r = 4;
        int x = 4, y = 6, x1 = 4, y1 = 6;
        int OA = (x1-x)+(y1-y);
        if((OA*OA)>(r*r)){
            System.out.println("Outside");
        }else if((OA*OA)<(r*r)){
            System.out.println("Inside");
        }else{
            System.out.println("On Circumference");
        }
    }
}

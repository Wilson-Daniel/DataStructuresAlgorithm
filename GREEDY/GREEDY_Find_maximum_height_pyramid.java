package DataStructuresAlgorithm.GREEDY;

public class GREEDY_Find_maximum_height_pyramid {
    public static int maxLevel(int[] boxes,int n){
        int prevLev = boxes[0];
        int prevCount = 1;

        int ans =1;
        int currLev = 0;
        int currCount = 0;
        for(int i=1 ; i<n ; i++){
            currLev += boxes[i];
            currCount+=1;
            if(currLev>prevLev && currCount>prevCount){
                prevLev = currLev;
                prevCount = currCount;

                currLev = 0;
                currCount = 0;

                ans++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] boxes = {40, 100, 20, 30};
        System.out.println(maxLevel(boxes,4));;
    }
}

package DataStructuresAlgorithm.PRIORITY_QUEUE;

import java.util.PriorityQueue;

public class PRIORITYQUEUE_Nearby_Cars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;
        Point(int x,int y,int distSq,int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;//ascending order sorting
        }
    }
    public static void main(String[] args) {
        int[][] pts = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point2> pq = new PriorityQueue<>();
        for(int i=0 ; i<pts.length ; i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point2(pts[i][0],pts[i][1],dist,i));
        }
        for(int i=0 ; i<k ;i++){
            System.out.print(pq.remove().idx+" ");
        }

        // Leetcode question
//        PriorityQueue<Point> pq = new PriorityQueue<>();
//        for(int i=0 ; i<points.length ; i++){
//            int distsq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
//            pq.add(new Point(points[i][0],points[i][1]));
//        }
//        int[][] ans = new int[k][k];
//        for(int i=0 ; i<k ; i++){
//            Point curr = pq.remove();
//            ans[i][0] = curr.x;
//            ans[i][1] = curr.y;
//        }
//        for(int i=0 ; i<ans.length ; i++){
//            for(int j =0 ; j<2 ; j++){
//                System.out.print(ans[i][j]+"");
//            }
//            System.out.println();
//        }
    }
    public static class Point2 implements Comparable<Point2>{
        int x;
        int y;
        int dist;
        int idx;
        Point2(int x,int y,int dist, int idx){
            this.x = x;
            this.y=y;
            this.dist = dist;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point2 s2){
            return this.dist - s2.dist;
        }
    }
}

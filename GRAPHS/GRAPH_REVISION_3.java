package DataStructuresAlgorithm.GRAPHS;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GRAPH_REVISION_3 {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    static class Edge2{
        int src;
        int dest;
        public Edge2(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph2(ArrayList<Edge2> graph1[]){
        for(int i=0 ; i<graph1.length ; i++){
            graph1[i] = new ArrayList<>();
        }
        graph1[0].add(new Edge2(0,1));
        //graph[0].add(new Edge(0,2));
        graph1[0].add(new Edge2(0,3));

        graph1[1].add(new Edge2(1,0));
        graph1[1].add(new Edge2(1,2));

//        graph1[2].add(new Edge2(2,0));
        graph1[2].add(new Edge2(2,1));

        graph1[3].add(new Edge2(3,0));
        graph1[3].add(new Edge2(3,4));

        graph1[4].add(new Edge2(4,3));
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        graph[4].add(new Edge(4,2,2));
    }
//--------------CONNECTED COMPONENTS--------------------------
    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(!vis[i]){
                bfsUtils(graph,vis);
            }
        }
    }
    public static void bfsUtils(ArrayList<Edge> graph[], boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0 ; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            dfsUtil(graph,i,vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph , int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr+" ");

        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }

        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph);
        ArrayList<Edge2>[] graph2 = new ArrayList[V];
        boolean[] vis = new boolean[graph2.length];
        createGraph2(graph2);
        System.out.println(detectCycle(graph2));
    }

    //------------------CYCLE DETECTION----------
    public static boolean detectCycle(ArrayList<Edge2>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,i,-1,vis)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge2>[] graph, int curr,int par,boolean[] vis){
        vis[curr]=true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge2 e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(detectCycleUtil(graph,e.dest,curr,vis)){
                    return true;
                }
            }else if(vis[e.dest] && e.dest!=par) {
                return true;
            }
        }
        return false;
    }



}

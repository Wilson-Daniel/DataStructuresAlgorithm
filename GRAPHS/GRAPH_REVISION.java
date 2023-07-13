package DataStructuresAlgorithm.GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GRAPH_REVISION {
    static public class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(6,5));
    }
    //----------------------------------------------------------
    //-------------BFS CONNECTED COMPONENTS---------------------
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<vis.length ; i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    //----------------------------------------------------------
    //-------------DFS CONNECTED COMPONENTS---------------------
    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<vis.length ; i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0 ;i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }
    //----------------------------------------------------------
    //-------------CYCLE DETECTION UNDIRECTED GRAPH---------------
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<vis.length ; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis,int curr,int parent){
        vis[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(detectCycleUtil(graph,vis,e.dest,curr)){
                    return true;
                }
            }else if(vis[e.dest] && e.dest!=parent){
                return true;
            }
        }
        return false;
    }
    //----------------------------------------------------------
    //-------------CYCLE DETECTION DIRECTED GRAPH---------------
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int i=0 ; i<vis.length ; i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,boolean[] stack){
        vis[curr] = true;
        for(int i=0 ; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // neigh already in stack
                return true;
            }else if(!vis[curr] && isCycleUtil(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.print("BFS (CONNECTED COMPONENTS): ");
        bfs(graph);
        System.out.println();
        System.out.print("DFS (CONNECTED COMPONENTS): ");
        dfs(graph);
        System.out.println();
        System.out.print("CYCLE DETECTION (UNDIRECTED GRAPH): "+detectCycle(graph));
        System.out.println();
        System.out.print("CYCLE DETECTION (DIRECTED GRAPH): "+isCycle(graph));

    }
}

package DataStructuresAlgorithm.GRAPHS;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class GRAPH_Has_Path {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    //-----------------------------------------------------
    //--------------------Creating a graph-----------------
    public static void createNode(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[0].add(new Edge(2,0,1));
        graph[0].add(new Edge(2,4,1));

        graph[0].add(new Edge(3,1,1));
        graph[0].add(new Edge(3,4,1));
        graph[0].add(new Edge(3,5,1));

        graph[0].add(new Edge(4,2,1));
        graph[0].add(new Edge(4,3,1));
        graph[0].add(new Edge(4,5,1));

        graph[0].add(new Edge(5,3,1));
        graph[0].add(new Edge(5,4,1));
        graph[0].add(new Edge(5,6,1));

        graph[0].add(new Edge(6,5,1));
    }
    //own logic, this will make 1 extra move when 0 is src and 0 is dest likek it will go to 1 and then well get true
    public static boolean hasPath(ArrayList<GRAPH_BFS.Edge>[] graph, int curr, int dest, boolean[] vis){
        vis[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            GRAPH_BFS.Edge e = graph[curr].get(i);
            if(e.dest == dest){
                vis[e.dest] = true;
                return true;
            }
            if(!vis[e.dest]){
                hasPath(graph,e.dest,dest,vis);
            }
        }
        return false;
    }
    public static boolean hasPath2(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if(src==dest){
            return true;
        }
        vis[src] = true;
        for(int i=0 ; i<graph[src].size() ; i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath2(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createNode(graph);
        System.out.println(hasPath2(graph,0,5,new boolean[V]));
        int[][] edge = {{0,1},{0,2},{3,5},{5,4},{4,3}};
//        ArrayList<ArrayList<Edge2>> graph1 = new ArrayList<>();
//        createGraph(graph1,edge);
//        for (int i=0 ; i< graph1.size() ; i++){
//            for(int j=0 ; j<graph1.get(i).size() ; j++){
//                System.out.print(i+" "+graph1.get(i).get(j).dest+" ");
//            }
//            System.out.println();
//        }
    }
    static class Edge2{
        int src;
        int dest;
        Edge2(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<ArrayList<Edge2>> graph,int[][] edge){
        for(int i=0 ; i<edge.length ; i++){
            graph.get(edge[i][0]).add(new Edge2(edge[i][0], edge[i][1]));
        }

    }
}

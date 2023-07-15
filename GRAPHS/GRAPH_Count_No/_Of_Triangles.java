package DataStructuresAlgorithm.GRAPHS.GRAPH_Count_No;


import java.util.ArrayList;

public class _Of_Triangles {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(1,0));
        graph[2].add(new Edge(1,3));
        graph[3].add(new Edge(2,1));
    }
    public static boolean countTri(ArrayList<Edge> graph[],int src,int par,boolean[] vis,boolean[] stack){

        vis[src] = true;
        stack[src] = true;
        for(int i=0 ;i<graph[src].size() ; i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest]) {
//                if(countTri(graph, e.dest, par, vis)) {
//                    System.out.print(e.dest+" ");
//                    System.out.print(src+" ");
//                    return true;
//                }
            }
            System.out.println();
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        //countTri(graph,0,-1,new boolean[V]);
    }
}

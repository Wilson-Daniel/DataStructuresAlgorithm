package DataStructuresAlgorithm.GRAPHS;

import java.util.ArrayList;

public class GRAPH_TOPOLOGICAL_SORT {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[2].add(new Edge(1,3));
        graph[3].add(new Edge(2,3));

    }
}

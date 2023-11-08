package DataStructuresAlgorithm.GRAPHS;

import java.sql.Array;
import java.util.*;

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
        graph1[0].add(new Edge2(0,2));
//        graph1[0].add(new Edge2(0,3));

        graph1[1].add(new Edge2(1,0));
        graph1[1].add(new Edge2(1,3));

//        graph1[2].add(new Edge2(2,0));
        graph1[2].add(new Edge2(2,0));
        graph1[2].add(new Edge2(2,4));

        graph1[3].add(new Edge2(3,1));
        graph1[3].add(new Edge2(3,4));

        graph1[4].add(new Edge2(4,3));
        graph1[4].add(new Edge2(4,2));
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
    public static void createDGraph(ArrayList<Edge2> graph1[]){
        for(int i=0 ; i<graph1.length ; i++){
            graph1[i] = new ArrayList<>();
        }
        graph1[0].add(new Edge2(0,1));
        graph1[0].add(new Edge2(0,2));
//        graph1[0].add(new Edge2(0,3));

//        graph1[1].add(new Edge2(1,0));
        graph1[1].add(new Edge2(1,3));

//        graph1[2].add(new Edge2(2,0));
//        graph1[2].add(new Edge2(2,0));
        graph1[2].add(new Edge2(2,3));

//        graph1[3].add(new Edge2(3,3));
//        graph1[3].add(new Edge2(3,4));

//        graph1[4].add(new Edge2(4,3));
//        graph1[4].add(new Edge2(4,2));
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

    //------------------CYCLE DETECTION----------
    public static boolean detectCycle(ArrayList<Edge2>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge2>[] graph, boolean[] vis,int curr,int par){
        vis[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge2 e = graph[curr].get(i);
            //case 1
            if(!vis[e.dest]){
                if(detectCycleUtil(graph,vis,e.dest,curr)){
                    return true;
                }
            }//case 2
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
        }
        return false;
    }
    //bipartite Graph
    public static boolean isBipartite(ArrayList<Edge2>[] graph) {
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge2 e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static boolean advBypart(ArrayList<Edge2>[] graph){
        boolean[] vis = new boolean[graph.length];

        for (int i=0 ; i<graph.length ; i++){
            if(!vis[i]){
                if(detCycle(graph,vis,i,-1)){
                    return false;
                }
            }
        }
        if (graph.length%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean detCycle(ArrayList<Edge2>[] graph,boolean[] vis,int curr,int par) {
        vis[curr] = true;
        for(int i=0 ; i<graph[0].size() ; i++){
            Edge2 e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(detCycle(graph,vis,e.dest,curr)) {
                    return true;
                }
            }else if(!vis[e.dest] && e.dest!=par){
                return true;
            }
        }
        return false;
    }
    //directed cycle detected
    public static boolean isDiCucle(ArrayList<Edge2>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int i=0; i<graph.length ; i++){
            if(!vis[i]){
                if(isDiCucleUtil(graph,vis,stack,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isDiCucleUtil(ArrayList<Edge2>[] graph,boolean[] vis,boolean[] stack,int curr){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0 ; i<graph[curr].size(); i++){
            Edge2 e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isDiCucleUtil(graph,vis,stack,e.dest)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    //topological Sort
    public static void topoSort(ArrayList<Edge2>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<graph.length ; i++){
            if(!vis[i]){
                topoSortUtil(graph,vis,s,i);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topoSortUtil(ArrayList<Edge2>[] graph, boolean vis[], Stack<Integer> s,int curr){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size() ; i++){
            Edge2 e = graph[curr].get(i);
            if(!vis[e.dest]){
                topoSortUtil(graph,vis,s,e.dest);
            }
        }
        s.push(curr);
    }
    //topological sort using bfs
    public static void calIndeg(ArrayList<Edge2>[] graph,int[] indeg){
        for(int i=0 ; i<graph.length ; i++){
            for(int j=0 ; j<graph[i].size() ; j++){
                Edge2 e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge2>[] graph){
        int[] indeg = new int[graph.length];
        calIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ; i<indeg.length ; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0 ; i<graph[curr].size() ; i++){
                Edge2 e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }
    //dijkstras algo
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        Pair(int n,int path){
            this.n = n;
            this.path=path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int dist[] = new int[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(src!=i){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                for(int i=0 ; i<graph[curr.n].size() ; i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u]+wt<dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0 ; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
    }
    //belman ford algo
    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i=0 ; i<dist.length ; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for(int i=0 ; i<V-1 ; i++){
            for(int j=0 ; j<graph.length ; j++){
                for(int k=0 ; k<graph[j].size() ; k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0 ; i<dist.length ; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void allPath(ArrayList<Edge2>[] graph, int curr,int dest,String path){
        if(curr==dest){
            System.out.println(path+curr);
            return;
        }
        for(int i=0 ; i<graph[curr].size() ; i++){
            Edge2 e = graph[curr].get(i);
            allPath(graph,e.dest,dest,path+curr);
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
        Set<Integer> set1 = new HashSet<>();
        set1.add(graph[0].get(0).src);
        Set<Integer> set2 = new HashSet<>();
        System.out.println(isBipartite(graph2));
        System.out.println(advBypart(graph2));

        System.out.println(advBypart(graph2));
        ArrayList<Edge2>[] dgraph3 = new ArrayList[V];
        createDGraph(dgraph3);
        System.out.println(isDiCucle(dgraph3));
//        topoSort(graph2);

        ArrayList<Edge2>[] graph3 = new ArrayList[6];
        createGraph3(graph3);
        topSort(graph2);

        ArrayList<Edge2>[] graph4 = new ArrayList[6];
        createGraphallpath(graph4);
        allPath(graph4,5,1,"");

        dijkstra(graph,0);
        System.out.println();
        bellmanFord(graph,0);

    }

    public static void createGraph3(ArrayList<Edge2> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge2(2,3));
        graph[3].add(new Edge2(3,1));

        graph[4].add(new Edge2(4,0));
        graph[4].add(new Edge2(4,1));

        graph[5].add(new Edge2(5,0));
        graph[5].add(new Edge2(5,2));
    }
    public static void createGraphallpath(ArrayList<Edge2> graph[]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge2(0,3));
        graph[2].add(new Edge2(2,3));
        graph[3].add(new Edge2(3,1));

        graph[4].add(new Edge2(4,0));
        graph[4].add(new Edge2(4,1));

        graph[5].add(new Edge2(5,0));
        graph[5].add(new Edge2(5,2));
    }


}

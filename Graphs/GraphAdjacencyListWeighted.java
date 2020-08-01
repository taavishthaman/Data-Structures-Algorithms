package Graphs;
import java.util.*;
import Heaps.ModifiedHeap;

class Pair{
    int vertex;
    int weight;
    Pair(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class GraphAdjacencyListWeighted{
    ArrayList<ArrayList<Pair>> graph;

    public GraphAdjacencyListWeighted(int v){
        graph = new ArrayList<ArrayList<Pair>>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<Pair>());
        }
    }

    public void addUndirectedEdge(int start, int end, int weight){

        graph.get(start).add(new Pair(end, weight));
        graph.get(end).add(new Pair(start, weight));
    }

    public void printGraph(){

        for(int i=0; i<graph.size(); i++){
            System.out.print(i+"=>");
            for(int j=0; j<graph.get(i).size(); j++){
                System.out.print("{"+graph.get(i).get(j).vertex+" "+graph.get(i).get(j).weight+"}");
            }
            System.out.println();
        }
    }

    public void DFS(int src){
        boolean[] found = new boolean[this.graph.size()];
        System.out.println("Found "+src);
        DFSRec(src, found);
    }

    public void DFSRec(int src, boolean[] found){
        found[src] = true;

        for(int i=0; i<this.graph.get(src).size(); i++){
            if(!found[this.graph.get(src).get(i).vertex]){
                System.out.println("Found "+this.graph.get(src).get(i).vertex);
                found[this.graph.get(src).get(i).vertex] = true;
                DFSRec(this.graph.get(src).get(i).vertex, found);
            }
        }
    }

    public void dijkstra(int s){
        ModifiedHeap PQ = new ModifiedHeap();

        int dist[] = new int[graph.size()];

        for(int i=0; i<graph.size(); i++){
            dist[i] = 1000000;
        }

        dist[s] = 0;

        PQ.add(s, 0);

        while(!PQ.isEmpty()){
            int[] arr = PQ.remove();
            ArrayList<Pair> cur = cur;
            for(int i=0; i<cur.size(); i++){
                if(dist[cur.get(i).vertex] > dist[cur[0]] + cur.get(i).weight){
                    dist[cur.get(i).vertex] = dist[cur[0]] + cur.get(i).weight;
                    heap.add(graph[cur[0]].get(i).vertex, graph[cur[0]].get(i).weight);
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]);
        }


    }

    
}
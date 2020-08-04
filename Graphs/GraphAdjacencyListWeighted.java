package Graphs;
import java.util.*;
import Heaps.ModifiedHeap;
import Heaps.Pair;

class GPair{
    int vertex;
    int weight;
    public GPair(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class GraphAdjacencyListWeighted{
    ArrayList<ArrayList<GPair>> graph;

    public GraphAdjacencyListWeighted(int v){
        graph = new ArrayList<ArrayList<GPair>>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<GPair>());
        }
    }

    public void addUndirectedEdge(int start, int end, int weight){

        graph.get(start).add(new GPair(end, weight));
        graph.get(end).add(new GPair(start, weight));
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
        int[] dist = new int[this.graph.size()];

        for(int i=0; i<this.graph.size(); i++){
            dist[i] = 100000;
        }

        dist[s] = 0;

        PQ.add(s,0);

        while(!PQ.isEmpty()){
            Pair p = PQ.delete();
            int u = p.n;
            int wt = p.wt;
            for(int i=0; i<this.graph.get(u).size(); i++){
                if(dist[this.graph.get(u).get(i).vertex] > dist[u] +  this.graph.get(u).get(i).weight){
                    dist[this.graph.get(u).get(i).vertex] = dist[u] + this.graph.get(u).get(i).weight;
                    PQ.add(this.graph.get(u).get(i).vertex, dist[this.graph.get(u).get(i).vertex]);
                }
            }
        }

        for(int i=0; i<this.graph.size(); i++){
            System.out.print(dist[i]);
        }        

    }

    
}
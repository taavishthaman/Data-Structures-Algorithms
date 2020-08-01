package Graphs;
import java.util.*;

import Queues.CircularQueue;


public class GraphMatrix{

    int[][] graph;
    public GraphMatrix(int v){
        graph = new int[v][v];
    }

    public void addUndirectedEdge(int start, int end, int weight){

        this.graph[start][end] = weight;
        this.graph[end][start] = weight;
    }

    public void printGraph(){

        for(int i=0; i<this.graph.length; i++){
            for(int j=0; j<this.graph[0].length; j++){
                System.out.print(this.graph[i][j]);
            }
            System.out.println();
        }
    }

    public void BFS(int s){

        boolean[] found = new boolean[this.graph.length];
        
        found[s] = true;

        CircularQueue Q = new CircularQueue();
        Q.enqueue(s);
        System.out.println("Found "+s);

        while(!Q.isEmpty()){
            int v = Q.getFront();
            Q.dequeue();

            for(int i=0; i<graph.length; i++){
                if(this.graph[v][i] == 1){
                    if(!found[i]){
                        Q.enqueue(i);
                        found[i] = true;
                        System.out.println("Found "+i);
                    }
                }
            }
        }
    }

    public void DFS(int s){

        boolean[] found = new boolean[this.graph.length];

        DFSRec(found, s);
    }

    public void DFSRec(boolean[] found, int s){

        found[s] = true;

        for(int i=0; i<graph.length; i++){

            if(graph[s][i] == 1){
                if(!found[i]){
                    System.out.println("Found "+i);
                    DFSRec(found, i);
                }
            }
        }
    }

    public void ConnectedComponents(){

        int count = 0;
        boolean found[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            int v = i;
            if(!found[i]){
                BFSSub(i, found);
                count++;
            }
        }

        System.out.println(count);
    }

    private void BFSSub(int s, boolean[] found){
        
        found[s] = true;

        CircularQueue Q = new CircularQueue();
        Q.enqueue(s);

        while(!Q.isEmpty()){
            int v = Q.getFront();
            Q.dequeue();
            for(int i=0; i<graph.length; i++){
                if(graph[v][i] == 1){
                    if(!found[i]){
                        Q.enqueue(i);
                        found[i] = true;
                    }
                }
            }
        }
    }

    public void dijkstra(int src){
        int[] dist = new int[this.graph.length];
        boolean[] sptSet = new bollean[this.graph.length];

        for(int i=0; i<dist.length; i++){
            dist[i] = 100000;
            sptSet[i] = false;
        }

        dist[src] = 0;
        sptSet[src] = true;

        for(int count=0; count<this.graph.length-1; count++){
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;

            for(int v=0; v<this.graph.length; v++){
                if(!sptSet[v] && graph[u][v] && dist[u] != Integer.MAX_INT && dist[u] + graph[u][v] < dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
    }

}
package Graphs;

import java.util.*;
import Queues.CircularQueue;
import Heaps.Heap;

public class GraphAdjacencyList{

    ArrayList<ArrayList<Integer>> graph;
    public GraphAdjacencyList(int v){
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList());
        }
    }

    public void addUndirectedEdge(int start, int end){
        graph.get(start).add(end);
        graph.get(end).add(start);
    }

    public void printGraph(){
        for(int i=0; i<this.graph.size(); i++){
            System.out.print(i+"=>");
            for(int j=0; j<this.graph.get(i).size(); j++){
                System.out.print(this.graph.get(i).get(j)); 
            }
            System.out.println();
        }
    }

    public void BFS(int s){

        boolean[] found = new boolean[this.graph.size()];

        found[s] = true;

        System.out.println("Found "+s);

        CircularQueue Q = new CircularQueue();

        Q.enqueue(s);

        while(!Q.isEmpty()){
            int v = Q.getFront();
            Q.dequeue();
            for(int i=0; i<this.graph.size(); i++){
                for(int j=0; j<this.graph.get(v).size(); j++){
                    if(!found[this.graph.get(v).get(j)]){
                        found[this.graph.get(v).get(j)] = true;
                        System.out.println("Found "+this.graph.get(v).get(j));
                        Q.enqueue(this.graph.get(v).get(j));
                    }
                }
            }
        }
    }

    public void DFS(int s){

        boolean[] found = new boolean[this.graph.size()];

        DFSRec(0, found);

    }

    public void DFSRec(int s, boolean[] found){

        System.out.println("Found "+s);
        found[s] = true;

        for(int i=0; i<this.graph.get(s).size(); i++){
            if(!found[this.graph.get(s).get(i)]){
                DFSRec(this.graph.get(s).get(i), found);
            }
        }
    }

    public void connectedComponents(){

        boolean[] found = new boolean[this.graph.size()];
        int count = 0;

        for(int i=0; i<this.graph.size(); i++){
            if(!found[i]){
                DFSRec(i, found);
                count++;
            }
        }

        System.out.println(count);
    }


    
}
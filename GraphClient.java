//import Graphs.GraphMatrix;
import Graphs.GraphAdjacencyList;
import Graphs.GraphAdjacencyListWeighted;
import Graphs.GraphHashMap;
import Graphs.GraphMatrix;

import java.util.*;

class GraphClient{
    public static void main(String[] args){

        //GraphMatrix g = new GraphMatrix(10);

        // g.addUndirectedEdge(0,1);
        // g.addUndirectedEdge(0,2);
        // g.addUndirectedEdge(1,2);
        // g.addUndirectedEdge(1,4);
        // g.addUndirectedEdge(2,4);
        // g.addUndirectedEdge(2,3);
        // g.addUndirectedEdge(3,4);

        // g.printGraph();

        // g.BFS(2);
        // g.DFS(0);

        // g.addUndirectedEdge(0,1);
        // g.addUndirectedEdge(1,2);
        // g.addUndirectedEdge(0,2);

        // g.addUndirectedEdge(3,4);
        // g.addUndirectedEdge(3,6);
        // g.addUndirectedEdge(4,5);
        // g.addUndirectedEdge(6,5);

        // g.addUndirectedEdge(7,8);
        // g.addUndirectedEdge(8,9);
        // g.addUndirectedEdge(7,9);

        // g.ConnectedComponents();

        // GraphAdjacencyList g = new GraphAdjacencyList(10);
        // g.addUndirectedEdge(0,1);
        // g.addUndirectedEdge(1,2);
        // g.addUndirectedEdge(0,2);

        // g.addUndirectedEdge(3,4);
        // g.addUndirectedEdge(3,6);
        // g.addUndirectedEdge(4,5);
        // g.addUndirectedEdge(6,5);

        // g.addUndirectedEdge(7,8);
        // g.addUndirectedEdge(8,9);
        // g.addUndirectedEdge(7,9);

        // g.printGraph();

        // g.BFS(3);

        // g.DFS(0);

        // g.connectedComponents();

        //  GraphMatrix graph = new GraphMatrix(6);

        //  graph.addUndirectedEdge(0,1,2);
        //  graph.addUndirectedEdge(0,2,4);
        //  graph.addUndirectedEdge(1,2,1);
        //  graph.addUndirectedEdge(1,3,7);
        //  graph.addUndirectedEdge(2,4,3);
        //  graph.addUndirectedEdge(3,4,2);
        //  graph.addUndirectedEdge(3,5,1);
        //  graph.addUndirectedEdge(4,5,5);

        //  graph.printGraph();

        //  graph.dijkstra(0);
        
        GraphAdjacencyListWeighted graph = new GraphAdjacencyListWeighted(6);

         graph.addUndirectedEdge(0,1,2);
         graph.addUndirectedEdge(0,2,4);
         graph.addUndirectedEdge(1,2,1);
         graph.addUndirectedEdge(1,3,7);
         graph.addUndirectedEdge(2,4,3);
         graph.addUndirectedEdge(3,4,2);
         graph.addUndirectedEdge(3,5,1);
         graph.addUndirectedEdge(4,5,5);

         graph.printGraph();

         graph.dijkstra(0);

        // GraphHashMap graph = new GraphHashMap();
        // graph.addVertex("A");
        // graph.addVertex("B");
        // graph.addVertex("C");
        // graph.addVertex("D");
        // graph.addVertex("E");
        // graph.addEdge("A","B",2);
        // graph.addEdge("A","C",3);
        // graph.addEdge("B","C",5);
        // graph.addEdge("B","E",8);
        // graph.addEdge("C","D",7);

        // graph.display();

        // System.out.println(graph.numEdges());
        // graph.removeVertex("C");
        // graph.display();

        // System.out.println(graph.hasPath("A", "E", new HashMap<String, Boolean>()));
        // graph.removeEdge("A", "C");
        // System.out.println(graph.hasPath("A", "C", new HashMap<String, Boolean>()));


    }
}
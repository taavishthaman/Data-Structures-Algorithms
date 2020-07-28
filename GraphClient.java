import Graphs.GraphMatrix;

class GraphClient{
    public static void main(String[] args){

        GraphMatrix g = new GraphMatrix(5);

        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(1,2);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);

        g.printGraph();

        g.BFS(2);
        g.DFS(0);
    }
}
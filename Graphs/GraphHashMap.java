package Graphs;
import java.util.*;

public class GraphHashMap{

    class Vertex{
        HashMap<String, Integer> nbrs = new HashMap();
    }

    HashMap<String, Vertex> vtces;
    public GraphHashMap(){
        vtces = new HashMap<String, Vertex>();
    }

    public int size(){
        return this.vtces.size();
    }

    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    public boolean contains(String vname){
        return this.vtces.containsKey(vname);
    }

    public void removeVertex(String vname){
        Vertex vtx = vtces.get(vname);

        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

        for(String key : keys){
            vtces.get(key).nbrs.remove(vname);
        }

        vtces.remove(vname);
    }

    public int numEdges(){

        int count = 0;
        ArrayList<String> keys = new ArrayList<>(this.vtces.keySet());
        for(String key : keys){
            Vertex vtx = this.vtces.get(key);
            count = count + vtx.nbrs.size();
        }

        return count/2;
    }

    public boolean containsEdge(String vname1, String vname2){

        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
            return false;
        }

        return true;
    }  
    
    public void addEdge(String vname1, String vname2, int cost){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.put(vname2, cost);
        vtx2.nbrs.put(vname1, cost);
    }

    public void removeEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
    }

    public void display(){

        ArrayList<String> keys = new ArrayList<>(this.vtces.keySet());

        for(String key : keys){
            System.out.println(key+" "+this.vtces.get(key).nbrs);
        }
    }

    public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed){
        processed.put(vname1, true);

        if(containsEdge(vname1, vname2)){
            return true;
        }

        Vertex vtx = this.vtces.get(vname1);

        ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());

        for(String nbr : nbrs){
            if(!processed.containsKey(nbr) && hasPath(nbr, vname2, processed)){
                return true;
            }
        }

        return false;
    }


}
package Heaps;
import java.util.*;

public class ModifiedHeap{
    class Pair{
        public int n;
        public int wt;
        public Pair(int n, int wt){
            this.n = n;
            this.wt = wt;
        }
    }

    ArrayList<Pair> heap;

    public ModifiedHeap(){
        heap = new ArrayList();
    }

    public void add(int n, int wt){
        Pair p = new Pair(n, wt);
        heap.add(p);
        upHeapify(this.heap.size()-1);
    }

    private void upHeapify(int ci){
        int pi = (ci-1)/2;
        Pair ppair = heap.get(pi);
        Pair cpair = heap.get(ci);
        if(ppair.wt > cpair.wt){
            swap(pi, ci);
            upHeapify(pi);
        }
    }

    private void swap(int f, int s){

        Pair first = heap.get(f);
        Pair second = heap.get(s);

        heap.set(f, second);
        heap.set(s, first);
    }

    public Pair delete(){
        swap(0, this.heap.size()-1);
        Pair last = this.heap.remove(this.heap.size()-1);

        downHeapify(0);

        return last;
    }

    private void downHeapify(int pi){
        int ci1 = 2*pi+1;
        int ci2 = 2*pi+2;
        int min = pi;

        if(ci1 < this.heap.size()-1 && this.heap.get(ci1).wt < this.heap.get(ci1).wt){
            min = ci1;
        }

        if(ci1 < this.heap.size()-1 && this.heap.get(ci1).wt < this.heap.get(ci2).wt){
            min = ci2;
        }

        if(min != pi){
            swap(pi, min);
            downHeapify(min);
        }
    }
}
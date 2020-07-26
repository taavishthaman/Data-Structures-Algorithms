package Heaps;

import java.util.*;

public class Heap{

    ArrayList<Integer> data;

    public Heap(){
        data = new ArrayList<>();
    }

    public void add(int val){
        data.add(val);

        upHeapify(this.data.size()-1);
    }

    void upHeapify(int ci){
        int pi = (ci-1)/2;

        if(this.data.get(pi) > this.data.get(ci)){
            swap(pi, ci);
            upHeapify(pi);
        }
    }

    public boolean isEmpty(){
        if(this.data.size() == 0){
            return true;
        }
        return false;
    }

    public int delete(){
        swap(0, this.data.size()-1);
        int min = this.data.remove(this.data.size()-1);

        downHeapify(0);

        return min;
    }

    void downHeapify(int pi){

        int ci1 = 2*pi + 1;
        int ci2 = 2*pi + 2;

        int min = pi;

        if(ci1 < this.data.size() && data.get(ci1) < data.get(min)){
            min = ci1;
        }
        if( ci2 < this.data.size() && data.get(ci2) < data.get(min)){
            min = ci2;
        }

        if(min != pi){
            swap(min, pi);
            downHeapify(min);
        }
    }

    void swap(int i, int j){
        int ith = data.get(i);
        int jth = data.get(j);

        data.set(i, jth);
        data.set(j, ith);
    }

    public void print(){
        System.out.print(this.data);
    }
} 
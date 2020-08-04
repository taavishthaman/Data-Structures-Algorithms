import Heaps.Heap;
import Heaps.ModifiedHeap;
import Heaps.Pair;

class HeapClient{
    public static void main(String[] args){
        // Heap heap = new Heap();

        // heap.add(5);
        // heap.add(6);
        // heap.add(4);
        // heap.add(3);
        // heap.add(2);
        // heap.add(1);

        // while(!heap.isEmpty()){
        //     System.out.println(heap.delete());
        // }
        // //Heap
        // heap.print();

        ModifiedHeap heap = new ModifiedHeap();
         heap.add(1,7);
         heap.add(2,10);
         heap.add(3,4);
         heap.add(4,7);

         Pair p = heap.delete();

         System.out.println(p.wt);
    }
}
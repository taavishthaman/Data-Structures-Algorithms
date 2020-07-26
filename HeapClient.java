import Heaps.Heap;

class HeapClient{
    public static void main(String[] args){
        Heap heap = new Heap();

        heap.add(5);
        heap.add(6);
        heap.add(4);
        heap.add(3);
        heap.add(2);
        heap.add(1);

        while(!heap.isEmpty()){
            System.out.println(heap.delete());
        }
        //Heap
        heap.print();
    }
}
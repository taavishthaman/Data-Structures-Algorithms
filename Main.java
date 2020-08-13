import Sorting.Sort;
import Heaps.Heap;

public class Main{
    public static void main(String[] args){

        // int[] arr = {8,7,6,5,4,9};
        // Sort sort = new Sort(arr);
        // //arr = sort.bubbleSort();
        // arr = sort.selectionSort();
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Heap heap = new Heap();
        // heap.insert(5);
        // heap.insert(4);
        // heap.insert(3);
        // heap.insert(7);
        // heap.insert(1);
        // heap.printHeap();
        // System.out.println(heap.extractMin());
        // System.out.println(heap.extractMin());
        // System.out.println(heap.extractMin());
        // System.out.println(heap.extractMin());
        // System.out.println(heap.extractMin());
        // System.out.println(heap.extractMin());
        // heap.printHeap();

        // int[] arr = {8,7,6,5,4,9,1,1};
        // Sort sort = new Sort(arr);

        // arr = sort.mergeSort(arr, 0, arr.length-1);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }

        // Queue Q = new Queue();

        Sort sort = new Sort();
        int[] arr = {5,4,3,2,1, -1, -4, -4, -6};

        //sort.bubbleSort(arr);
        //sort.selectionSort(arr);
        sort.insertionSort(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }
}
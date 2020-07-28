package Sorting;

public class Sort{

    int[] arr;
    public Sort(int[] arr){
        this.arr = arr;
    }

    public int[] bubbleSort(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(){
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }

    public int[] mergeSort(int[] arr, int lo, int hi){

        if(lo == hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo+hi)/2;
        int[] ls = mergeSort(arr,lo, mid);
        int[] rs = mergeSort(arr, mid+1, hi);

        int[] res = merge(ls, rs);
        return res;
    }

    public int[] merge(int[] A, int[] B){

        int[] merged = new int[A.length + B.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < A.length && j < B.length){
            if(A[i] <= B[j]){
                merged[k] = A[i];
                i++;
                k++;
            }
            else{
                merged[k] = B[j];
                j++;
                k++;
            }
        }

        while(i < A.length){
            merged[k] = A[i];
            k++;
            i++;
        }

        while(j < B.length){
            merged[k] = B[j];
            j++;
            k++;
        }

        return merged;
    }

    
}
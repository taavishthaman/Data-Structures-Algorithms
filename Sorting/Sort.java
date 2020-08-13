package Sorting;

public class Sort{

    int[] arr;
    public Sort(){

    }

    public Sort(int[] arr){
        this.arr = arr;
    }

    public void bubbleSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public void insertionSort(int[] arr){
        for(int counter=1; counter<=arr.length-1; counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
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
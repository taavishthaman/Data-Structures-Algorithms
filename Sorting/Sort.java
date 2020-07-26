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

    
}
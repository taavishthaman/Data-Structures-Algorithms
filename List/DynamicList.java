package List;

public class DynamicList <T>{

    T[] arr;
    private int capacity = 1;
    private int index = -1;
    public DynamicList(){
        arr = (T[]) new Object[capacity];
    }

    public void insert(T data){
        if(index == capacity-1){
            capacity = capacity*2;
            T[] newArr = (T[]) new Object[capacity];
            for(int i=0; i<=index; i++){
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
            index++;
            this.arr[index] = data;
        }
        else{
            index++;
            arr[index] = data;
        }
    }

    public void remove(T data){
        boolean found = false;
        for(int i=0; i<=index; i++){
            if(this.arr[i] == data && !found){
                found = true;
                for(int j=i; j<index; j++){
                    arr[j] = arr[j+1];
                }
                this.index--;
            }
        }
    }

    public void removeAt(int idx) throws Exception{
        if(idx < 0 || idx > this.index){
            throw new Exception("Invalid Index");
        }
        else{
            for(int i=idx; i<index; i++){
                this.arr[i] = this.arr[i+1];
            }
            this.index--;
        }
    }

    public int getSize(){
        return this.arr.length;
    }

    public void print(){
        System.out.print("[");
        for(int i=0; i<=index; i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.print("]");
    }
}

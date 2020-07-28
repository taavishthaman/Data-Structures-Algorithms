package Stack;

public class Stack <T>{

    //Default capacity of the stack
    public static final int DEFAULT_CAPACITY = 10;
    private T[] arr;
    int ptr = -1;

    //Constructor 1 takes no arguments
    public Stack(){
        this(DEFAULT_CAPACITY);
    }

    //Constructor 2 takes capacity as an argument
    public Stack(int capacity){
        arr = (T[]) new Object[capacity];
    }

    public void push(T data) throws Exception{
        if(this.ptr == this.getSize()){
            throw new Exception("Stack is full");
        }
        this.ptr++;
        this.arr[ptr] = data;
    }

    public T pop() throws Exception{
        if(this.ptr == -1){
            throw new Exception("Stack is empty");
        }
        T val = this.arr[ptr];
        this.ptr--;
        return val;
    }

    public int getSize(){
        return this.arr.length-1;
    }

    public void printStack(){
        System.out.print("[");
        for(int i = ptr; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
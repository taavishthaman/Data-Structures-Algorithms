package Queues;

public class CircularQueue{

    public static final int DEFAULT_CAPACITY = 10;
    private int[] arr;
    private int front;
    private int rear;
    private int ms;
    private int cs;
    public CircularQueue(){
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity){
        this.arr = new int[capacity];
        cs = 0;
        ms = this.arr.length;
        front = 0;
        rear = this.arr.length-1;
    }

    public boolean isEmpty(){
        return this.cs == 0;
    }

    public boolean isFull(){
        return this.cs == this.ms;
    }

    public void enqueue(int data){
        if(!isFull()){
            this.rear = (this.rear+1)%this.arr.length;
            this.arr[this.rear] = data;
            this.cs++;
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            this.front = (this.front+1)%this.arr.length;
            this.cs--;
        }
    }

    public int getFront(){
        return this.arr[front];
    }


} 
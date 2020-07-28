import Queues.CircularQueue;

class QueueClient{
    public static void main(String[] args){

        CircularQueue Q = new CircularQueue();

        for(int i=1; i<=5; i++){
            Q.enqueue(i);
        }

        while(!Q.isEmpty()){
            System.out.print(Q.getFront());
            Q.dequeue();
        }
        Q.dequeue();

    }
}
package List;

public class DoublyLinkedList <T>{

    class Node{
        T data;
        Node next;
        Node prev;
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public void insertAtHead(T data){
        Node nn = new Node();
        nn.data = data;

        if(this.head == null){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            nn.next = this.head;
            this.head.prev = nn;
            this.head = nn;
            this.size++;
        }
    }

    public void insertAtTail(T data){
        Node nn = new Node();
        nn.data = data;

        if(this.head == null){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            this.tail.next = nn;
            nn.prev = this.tail;
            this.tail = nn;
            this.size++;
        }
    }

    public void insertAtPos(T data, int pos){

        Node nn = new Node();
        nn.data = data;
        Node temp = this.head;

        if(pos == 0){
            insertAtHead(data);
        }
        else if(pos == this.size){
            insertAtTail(data);
        }
        else{
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }

            Node temp2 = temp.next;
            temp.next = nn;
            nn.prev = temp;
            nn.next = temp2;
            temp2.prev = nn;
            this.size++;
        }
    }

    public void removeFromPos(int pos){

        if(pos == 0){
            this.head = this.head.next;
            this.size--;
        }
        else if(pos < this.size-1){
            Node temp = this.head;
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }
            Node temp2 = temp.next.next;
            temp2.prev = temp;
            temp.next = temp.next.next;
            this.size--;
        }
        else if(pos == this.size-1){
            System.out.println("Here");
            Node temp = this.head;
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
            this.size--;
        }
    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public void printListBackwards(){

        Node temp = this.tail;
        while(temp.prev != null){
            System.out.print(temp.data);
            temp = temp.prev;
        }
    }
} 
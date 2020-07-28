package List;

public class LinkedList <T> {

    class Node{
        Node next;
        T data;
    }

    Node head = null;
    public Node tail = null;
    int size = 0;
    public void insertAtHead(T data){

        Node nn = new Node();
        nn.next = null;
        nn.data = data;

        if(this.head == null){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            nn.next = this.head;
            this.head = nn;
            this.size++;
        }
    }

    public void insertAtEnd(T data){

        Node nn = new Node();
        nn.next = null;
        nn.data = data;

        if(this.head == null){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            this.tail.next = nn;
            this.tail = nn;
            this.size++;
        }
    }

    public void insertAtPos(int pos, T data){
        if(pos == 0){
            insertAtHead(data);
        }
        else if(pos == this.size-1){
            insertAtEnd(data);
        }
        else{
            Node nn = new Node();
            nn.data = data;
            nn.next = null;

            Node temp = this.head;
            for(int i=0; i<pos-2; i++){
                temp = temp.next;
            }
            Node temp2 = temp.next;
            temp.next = nn;
            nn.next = temp2;
            this.size++;
        }
    }

    public void removeFromPos(int pos){
        Node temp = this.head;
        if(pos == 0){
            this.head = this.head.next;
        }
        else if(pos == this.size){
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            this.size --;
            this.tail = temp;
        }
        else{
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }
}
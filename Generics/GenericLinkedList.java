public class GenericLinkedList <T>{

    class Node{
        Node next;
        T data;
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public void insertAtEnd(T data){

        Node nn = new Node();
        nn.data = data;

        if(head == null){
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

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }

    public int find(T data){
        int idx = 0;
        for(Node temp = this.head; temp != null; temp = temp.next){
            if(temp.data.equals(data)){
                return idx;
            }
            idx++;
        }
        return -1;
    }

    public static void main(String[] args){
        GenericLinkedList<Integer> gll = new GenericLinkedList();
        for(int i=1; i<=5; i++){
            gll.insertAtEnd(i);
        }
        System.out.println(gll.find(3));
        gll.display();
    }
}

import List.DynamicList;
import List.LinkedList;
import List.DoublyLinkedList;

class ListClient{
    public static void main(String[] args) throws Exception{
        // DynamicList list = new DynamicList();

        // list.insert(10.5);
        // list.insert(20);
        // list.insert(30);
        // list.insert(40);
        // list.insert(30);
        // list.insert("Hello");
        // list.remove(30);
        // list.remove(30);
        // list.remove("Hello");
        // list.removeAt(1);
        // list.print();

        // LinkedList ll = new LinkedList();

        // ll.insertAtEnd(5);
        // ll.insertAtEnd(7);
        // ll.insertAtEnd(9);
        // ll.insertAtPos(1, 10);
        // ll.insertAtPos(3, 9);
        // ll.insertAtPos(0, -5);
        // ll.insertAtPos(5, "Tail");
        // ll.insertAtHead("Head");
        // ll.printList();
        // System.out.println();
        // ll.removeFromPos(6);
        // ll.printList();

        // DoublyLinkedList dll = new DoublyLinkedList();

        // for(int i=1; i<=5; i++){
        //     dll.insertAtTail(i);
        // }

        // dll.printList();

        // dll.insertAtPos(7,5);
        // dll.printList();
        // dll.removeFromPos(0);
        // dll.printList();

        // dll.printListBackwards();

        LinkedList ll = new LinkedList();
        for(int i=1; i<=5; i++){
            ll.insertAtEnd(i*10);
        }
        ll.printList();
        ll.reverseList();
        ll.printList();
        System.out.println();
        //ll.reverseK(3);
        //ll.printList();
    }
}
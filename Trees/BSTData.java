package Trees;

public class BSTData{


    public class Node{
        int data;
        int childCount;

        Node left;
        Node right;
        Node parent;
    }

    Node root = null;

    public void insert(int x){
        Node n = new Node();
        n.data = data;
        n.left = null;
        n.right = null;
        n.parent = null;
        if(this.root == null){
            this.root = n;
            return;
        }
        insertRec(n, n.parent);
    }

    public void insertRec(Node n, Node parent){
        if(n.data <= parent.data){
            if(parent.left == null){
                parent.left = n;
                parent.count++;
            }
            insertRec(n, parent);
        }
        else if(n.data > parent.data){
            if(parent.right == null){
                parent.right = n;
                parent.count++;
            }
            insertRec(n, parent);
        }
    }

}
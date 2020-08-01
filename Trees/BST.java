package Trees;

public class BST{

    public class Node{
        int data;
        Node left;
        Node right;
        Node parent;
    }

    Node root = null;

    public void insert(int data){
        Node n = new Node();
        n.data = data;
        n.left = null;
        n.right = null;
        n.parent = null;
        if(this.root == null){
            this.root = n;
            return;
        }
        insertRec(n, root);

    }

    public boolean search(int data){
        return searchRec(data, this.root);
    }

    public boolean searchRec(int data, Node n){
        if(n == null){
            return false;
        }
        if(n.data == data){
            return true;
        }
        else if(data < n.data){
            return searchRec(data, n.left);
        }
        else {
            return searchRec(data, n.right);
        }
    }

    public void insertRec(Node n, Node parent){
        if(n.data <= parent.data){
            if(parent.left == null){
                parent.left = n;
                n.parent = parent;
                return;
            }
            insertRec(n, parent.left);
        }
        else if(n.data > parent.data){
            if(parent.right == null){
                parent.right = n;
                n.parent = parent;
                return;
            }
            insertRec(n, parent.right);
        }
    }

    public int findMin(){
        if(this.root == null){
            return -1;
        }
        return findMinRec(this.root);
    }
    public int findMinRec(Node n){
        if(n.left == null){
            return n.data;
        }
        return findMinRec(n.left);
    }

    public int findMax(){
        if(this.root == null){
            return -1;
        }
        return findMaxRec(this.root);
    }
    public int findMaxRec(Node n){
        if(n.right == null){
            return n.data;
        }
        return findMaxRec(n.right);
    }

    public Node findMaxRecN(Node n){
        if(n.right == null){
            return n;
        }
        return findMaxRecN(n.right);
    }

    public int predecessor(int data){
        return predecessorN(searchN(data));
    }
    
    public Node searchN(int data){
        return searchRecN(data, this.root);
    }

    public Node searchRecN(int data, Node n){
        if(n == null){
            return null;
        }
        if(n.data == data){
            return n;
        }
        else if(data < n.data){
            return searchRecN(data, n.left);
        }
        else {
            return searchRecN(data, n.right);
        }
    }


    public int predecessorN(Node n){
        
        if(n.left != null){
            return findMaxRec(n.left);
        }
        else if(n.parent.data < n.data){
            return n.parent.data;
        }
        else if(n.left == null && n.parent.data > n.data){
            return n.data;
        }
        else{
            return findMaxRec(n.parent);
        }
    }

    public Node findMinN(Node n){
        if(n.left == null){
            return n;
        }
        return findMinN(n.left);
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node n){
        if(n == null){
            return;
        }
        inorderRec(n.left);
        System.out.println(n.data);
        inorderRec(n.right);
    }

    public void deleteNode(int x){
        Node n = searchN(x);
        

        if(n.left == null && n.right == null){
            n = null;
        }
        else if(n.left == null && n.right != null){
            System.out.println("HERE "+n.right.parent);
            Node temp = n.right.parent;
            n.parent = temp;
        }
        else if(n.right == null && n.left != null){
            n.left.parent = n.parent;
        }
        else{
            Node f = findMaxRecN(n.left);
            Node temp = f;
            temp.left = n.left;
            temp.right = n.right;
            temp.parent = n.parent;
            n = null;
        }

    }


}
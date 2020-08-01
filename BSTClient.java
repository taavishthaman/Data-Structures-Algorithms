import Trees.BST;

class BSTClient{
    public static void main(String[] args){

        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);
        bst.insert(1);

        bst.inorder();

        System.out.println(bst.search(8));
        System.out.println(bst.search(9));

        System.out.println(bst.findMin());

        System.out.println(bst.findMax());

        System.out.println(bst.predecessor(5));

        bst.deleteNode(7);
        bst.inorder();
    }
}
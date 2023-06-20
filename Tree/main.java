class BinarySearchTree{

    TreeNode root;

    public BinarySearchTree(){
        root=null;
    }

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            data=value;
            left=null;
            right=null;
        }
    }
public TreeNode insert(TreeNode root,int value){
    if(root==null){
        root=new TreeNode(value);
        return root;
    }
    if(root.data>value){
        root.left=insert(root.left, value);
    }
    else if(root.data<value){
        root.right=insert(root.right, value);
    }
    return root;
}

public TreeNode search(TreeNode root,int value){
    if(root==null || root.data==value){
        return root;
    }
    if(root.data>value){
        return search(root.left, value);
    }
    else{
        return search(root.right, value);
    }
}

public void inOrder(TreeNode root){
    if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.println(root.data+" ");
    inOrder(root.right);
}


public void insertIntoTree(int value){
    root=insert(root, value);
}

public TreeNode searchTree(int value){
    return search(root, value);

}

public void inOrderTraversal(){
    inOrder(root);
}
}

public class main {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insertIntoTree(5);
        bst.insertIntoTree(10);
        bst.insertIntoTree(155);
        bst.insertIntoTree(58590);
        bst.inOrderTraversal();
    }
}

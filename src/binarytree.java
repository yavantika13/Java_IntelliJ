import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import javax.swing.*;
import java.util.*;
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binarytree {
//
//    Node root;
//    public binarytree(){
//        root = null;
//    }
//    // first - IO
//    void inorder(Node node){
//        if(node == null) return;
//            inorder(node.left);
//            System.out.println(node.data + " ");
//            inorder(node.right);
//            System.out.println(node.data);
//
//    }
//    // second - PO
//    void preorder(Node node){
//        if(node == null) return;
//        System.out.println(node.data + " ");
//        preorder(node.left);
//        preorder(node.right);
//    }
//    // Third POstorder
//    void postorder(Node node){
//        if (node == null) return;
//        postorder(node.left);
//        postorder(node.right);
//        System.out.println(node.data + " ");
//    }
//    public static void main(string[] args) {
//        binarytree tree = new binarytree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.right.right = new Node(5);
//        tree.inorder(tree.root);
//        System.out.println();
//        tree.preorder(tree.root);
//        System.out.println();
//        tree.postorder(tree.root);
//       System.out.println();
//    }
//}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class diameter{
    int height;
    int diameter;
    diameter(int h, int d){
        height = h;
        diameter = d;
    }
}
public class binarytree {
    Node root;
    public binarytree(){
        root=null;
    }
    // First - IO
    void inordertraversal(Node node){
        if(node==null) return;
        inordertraversal(node.left);
        System.out.print(node.data + " ");
        inordertraversal(node.right);
       // System.out.println(node.data);
    }
    // Second - PO
    void preordertraversal(Node node){
        if(node==null) return;
        System.out.print(node.data + " ");
        preordertraversal(node.left);
        preordertraversal(node.right);
    }
    // Third - PPO
    void postordertraversal(Node node){
        if(node==null) return;
        postordertraversal(node.left);
        postordertraversal(node.right);
        System.out.print(node.data + " ");
    }
    int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return  Math.max(leftHeight, rightHeight) + 1;
    }
    int countnodes(Node root){
        if(root == null) return 0;
        return 1 + countnodes(root.left) + countnodes(root.right);
    }
    boolean bt(Node node, int max, int min){
        if(node == null) return true;
        if(node.data >= max || node.data <= min) return false;
        return bt(node.left, min, node.data) &&
                bt(node.right, node.data, max);
    }
    Node lca(Node root, int n1, int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if(left != null && right != null){
            return root;
        }
        return (left != null) ? left : right;
    }
    diameter Diameter(Node root){
        if(root == null){
            return new diameter(0,0);
        }
        diameter left = Diameter(root.left);
        diameter right = Diameter(root.right);
        int height = Math.max(left.height, right.height) + 1;
        int SelfDiameter = left.height + right.height + 1;
        int dia = Math.max(SelfDiameter,
                Math.max(left.diameter, right.diameter));
        return new diameter(height, dia);
    }
    Node invert(Node root){
        if(root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }

    public static void main(String[] args) {
        binarytree tree=new binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(5);
//        tree.inordertraversal(tree.root);
//        System.out.println();
//        tree.preordertraversal(tree.root);
//        System.out.println();
//        tree.postordertraversal(tree.root);
        System.out.print("Inorder: ");
        tree.inordertraversal(tree.root);

        System.out.print("\nPreorder: ");
        tree.preordertraversal(tree.root);

        System.out.print("\nPostorder: ");
        tree.postordertraversal(tree.root);

        System.out.println("\nHeight: " + tree.height(tree.root));
        System.out.println("Total Nodes: " + tree.countnodes(tree.root));

        System.out.println(tree.bt(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        Node ans = tree.lca(tree.root, 4, 5);
        if(ans != null)
            System.out.println("LCA:" + ans.data);
        else
            System.out.println("Not Found");
        diameter result = tree.Diameter(tree.root);
        System.out.println("Diameter" + result.diameter);

        System.out.print("\nBefore Invert (Inorder): ");
        tree.inordertraversal(tree.root);
        tree.invert(tree.root);
        System.out.println("\nAfter Invert(Inorder):  ");
        tree.inordertraversal(tree.root);
    }
}
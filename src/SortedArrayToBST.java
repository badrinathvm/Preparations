/**
 * Created by Badri on 9/10/17.
 */

// Java program to print BST in given range

// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}


// Reference : http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
public class SortedArrayToBST {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        Node root = SortedArrayToBST.sortedArrayToBST(arr,0,arr.length-1);
        SortedArrayToBST.preOrder(root);
    }

    public static Node sortedArrayToBST(int []arr , int start , int end){

        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr,start,mid-1);

        node.right = sortedArrayToBST(arr,mid+1,end);

        return node;
    }

    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

}

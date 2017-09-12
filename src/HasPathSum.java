/**
 * Created by m785451 on 9/11/17.
 */



// * Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class HasPathSum {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        System.out.println(HasPathSum.hasPathSum(root,21));
    }

    public static boolean  hasPathSum(TreeNode root, int sum){

        if(root == null){
            return false;
        }

        if(root.val == sum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);

    }

    public static TreeNode invertTree(TreeNode root){
        if(root != null){
            helper(root);
        }

        return root;
    }

    public static void helper(TreeNode p){

        //exchange
        TreeNode temp = p.left;
        p.left = p.right;
        p.right = temp;

        if(p.left!= null){
            helper(p.left);
        }

        if(p.right!=null){
            helper(p.right);
        }
    }

}

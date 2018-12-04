import java.util.LinkedList;
import java.util.List;

/**
 * Created by shivercao on 3/25/2018.
 */
public class Binary_Tree_Paths {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int i){ val = i; }
    }

    public List<String> binary_Tree_Paths(TreeNode root){
        List<String> res = new LinkedList<>();
        if(root == null) return res;
        String s = new String();
        helper(res, s, root);
        System.out.println(res);
        return res;
    }

    public void helper(List<String> res, String s, TreeNode root){
        if(root.left == null && root.right == null) res.add(s + root.val);
        if(root.left != null) helper(res, s + root.val + "->", root.left);
        if(root.right != null) helper(res, s + root.val + "->", root.right);
    }

    // iterative method
    public List<String> binary_Tree(TreeNode root){
        List<String> res = new LinkedList<>();
        if(root == null) return res;
        boolean left = true;
        boolean checker = true;

        //iterative ->left -> null
        while(checker){
            String s = "";
            while(root.left != null || root.right != null){
                s = s + root.val + "->";
                root = left? root.left : root.right;
                if(left) 


            }
        }
    }


    public static void main(String[] args) {
        Binary_Tree_Paths sample = new Binary_Tree_Paths();
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.right = new TreeNode(5);

        sample.binary_Tree_Paths(tree);
    }
}

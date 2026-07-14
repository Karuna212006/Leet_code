// Last updated: 7/14/2026, 2:00:37 PM
class Solution {
    ArrayList<Integer> ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root != null){
            inorderTraversal(root.left);
            ans.add(root.val);
            inorderTraversal(root.right);
     
        }
    return ans;
    }
}
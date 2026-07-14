// Last updated: 7/14/2026, 2:00:36 PM
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
            Queue<TreeNode> qu=new LinkedList<>();
            if(root==null) return ans;
            qu.add(root);
            while(!qu.isEmpty()){
                int  size =qu.size();
                List<Integer> subAns=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode peek=qu.poll();
                    subAns.add(peek.val);
                    if(peek.left!=null){
                        qu.add(peek.left);
                    }
                    if(peek.right!=null){
                        qu.add(peek.right);
                    }
                }
                ans.add(subAns);
            }
        return ans;
    }
}
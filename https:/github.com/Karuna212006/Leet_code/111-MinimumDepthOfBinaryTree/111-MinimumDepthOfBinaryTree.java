// Last updated: 7/14/2026, 2:00:31 PM
class Solution {
    public int minDepth(TreeNode root) {
      int lc=0;
      int rc=0;
      if(root ==null)return 0;
      lc=1+minDepth(root.left);
      rc=1+minDepth(root.right);
      if(lc==1)return rc;
      if(rc==1)return lc;
      return Math.min(lc,rc);
    }
}
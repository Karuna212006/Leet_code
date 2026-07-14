// Last updated: 7/14/2026, 2:00:33 PM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> currow=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    currow.add(1);
                }else{
                    List<Integer> pre=pascal.get(i-1);
                    currow.add(pre.get(j)+pre.get(j-1));
                }
            }
                pascal.add(currow);
        }
        return pascal;
    }
}
// Last updated: 7/14/2026, 2:00:30 PM
class Solution {
    public List<Integer> getRow(int r) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<=r;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    List<Integer> prev=pascal.get(i-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            pascal.add(row);
        }
        return pascal.get(r);
    }
}
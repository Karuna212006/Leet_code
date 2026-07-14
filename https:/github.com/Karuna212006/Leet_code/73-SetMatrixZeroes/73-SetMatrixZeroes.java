// Last updated: 7/14/2026, 2:00:44 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Set<Integer> zeroRows=new HashSet<>();
        Set<Integer> zerocols=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroRows.add(i);
                    zerocols.add(j);
                }
            }
        }

        for(int r:zeroRows){
            for(int j=0;j<n;j++){
                    matrix[r][j]=0;
            }
        }

        for(int c:zerocols){
            for(int i=0;i<m;i++){
                matrix[i][c]=0;
            }
        }
    }
}
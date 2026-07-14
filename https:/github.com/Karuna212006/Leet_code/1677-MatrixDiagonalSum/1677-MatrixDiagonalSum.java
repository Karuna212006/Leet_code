// Last updated: 7/14/2026, 1:58:37 PM
class Solution {
    public int diagonalSum(int[][] arr) {
        int sum=0;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1) sum+=arr[i][j];
                
            }
        }
        return sum;
    }
}
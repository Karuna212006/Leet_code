// Last updated: 7/14/2026, 1:58:55 PM
class Solution {
    public int pivotIndex(int[] arr) {
         int n= arr.length;
        int []pf=new int[n];
        int []sf=new int[n];

        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=arr[i]+pf[i-1];
        }
        sf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=arr[i]+sf[i+1];
        }
        for(int i=0;i<n;i++){
            if(pf[i]==sf[i]){
                return i;
            }
        }
        return -1;

    }
}
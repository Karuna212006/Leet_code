// Last updated: 7/14/2026, 1:59:34 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        
        int k=0;
       for(int m:nums){
        if(m!=0){
            nums[k]=m;
            k++;

        }
       }
       while(k<n){
        nums[k]=0;
        k++;
       }
    }
}
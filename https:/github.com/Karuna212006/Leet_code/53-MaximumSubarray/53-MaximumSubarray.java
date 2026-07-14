// Last updated: 7/14/2026, 2:01:07 PM
class Solution {
    public int maxSubArray(int[] arr) {
        int max=arr[0];
        int submax=0;
        for(int a:arr){
            submax+=a;
            max=Math.max(max,submax);
            if(submax <0)submax=0;
        }
        return max;
    }
}
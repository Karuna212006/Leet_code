// Last updated: 7/14/2026, 2:00:12 PM
class Solution {
    public int findMin(int[] nums) {
        int right=nums.length-1;
        int left=0;
        while(right >= left){
            int mid=left+(right-left)/2;
            if(nums[mid] > nums[right] ){
                left=mid+1;
            }else if(nums[mid] < nums[right]){
                right=mid;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}
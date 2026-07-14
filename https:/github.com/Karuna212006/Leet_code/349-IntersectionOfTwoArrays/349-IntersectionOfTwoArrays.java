// Last updated: 7/14/2026, 1:59:31 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> res=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            if(set1.contains(num)){
                res.add(num);
            }
        }
        int []arr=new int[res.size()];
        int i=0;
        for(int num:res){
            arr[i++]=num;
    
        }
        return arr;
    }
}
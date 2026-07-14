// Last updated: 7/14/2026, 1:59:09 PM
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            
            if(arr[index] < 0){
                  list.add(Math.abs(arr[i]));
            }else{
                arr[index]=arr[index]*-1;
            }
        }
        return list;
    }
}
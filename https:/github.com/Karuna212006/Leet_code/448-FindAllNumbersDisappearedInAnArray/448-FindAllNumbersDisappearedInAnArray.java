// Last updated: 7/14/2026, 1:59:05 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list=new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                int index=Math.abs(arr[i])-1;

                if(arr[index] > 0){
                    
                    arr[index]=arr[index]*-1;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    list.add(i+1);
                }
            }

            return list;
        }
    }

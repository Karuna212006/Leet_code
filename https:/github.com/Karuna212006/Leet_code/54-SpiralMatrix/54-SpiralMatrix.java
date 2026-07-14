// Last updated: 7/14/2026, 2:00:59 PM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list=new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        int top = 0;
        int right = col - 1;
        int left = 0;
        int bot = row - 1;

        int total = row * col;
        int cnt = 0;
        while (cnt < total) {
            //Top wall
            for (int j = left; j <= right && cnt < total; j++) {
                list.add(arr[top][j]);
                cnt++;
            }
            top++;

            for (int i = top; i <= bot && cnt < total; i++) {
                list.add(arr[i][right]);
                cnt++;

            }
            right--;

            for (int j = right; j >= left && cnt < total; j--) {
                list.add(arr[bot][j]);
                cnt++;
            }
            bot--;

            for (int i = bot; i >= top && cnt < total; i--) {
                list.add(arr[i][left]);
                cnt++;
            }
            left++;
        }
        return list;
    }
}
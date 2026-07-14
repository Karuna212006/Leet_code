// Last updated: 7/14/2026, 1:58:34 PM
class Solution {

    class FenwickTree {
        int[] bit;
        int n;

        FenwickTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int index, int delta) {
            index++;
            while (index <= n) {
                bit[index] += delta;
                index += index & -index;
            }
        }

        int query(int index) {
            index++;
            int sum = 0;
            while (index > 0) {
                sum += bit[index];
                index -= index & -index;
            }
            return sum;
        }

        int rangeQuery(int left, int right) {
            return query(right) - (left > 0 ? query(left - 1) : 0);
        }
    }

    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = pos[nums1[i]];
        }

        long[] leftSmaller = new long[n];
        FenwickTree leftBIT = new FenwickTree(n);

        for (int i = 0; i < n; i++) {
            leftSmaller[i] = leftBIT.query(arr[i] - 1);
            leftBIT.update(arr[i], 1);
        }

        long[] rightGreater = new long[n];
        FenwickTree rightBIT = new FenwickTree(n);

        for (int i = n - 1; i >= 0; i--) {
            rightGreater[i] = rightBIT.rangeQuery(arr[i] + 1, n - 1);
            rightBIT.update(arr[i], 1);
        }

        long answer = 0;

        for (int i = 0; i < n; i++) {
            answer += leftSmaller[i] * rightGreater[i];
        }

        return answer;
    }
}
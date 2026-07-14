// Last updated: 7/14/2026, 1:58:39 PM
class Solution {
    public int numWaterBottles(int nb, int ne) {
        int total=nb;
        int empty=nb;
        while(empty>=ne){
            int newbottel=empty/ne;
            total+=newbottel;
            empty=empty%ne+newbottel;
        }
        return total;
    }
}
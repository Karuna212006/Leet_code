// Last updated: 7/14/2026, 2:00:07 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            char ch = (char) ('A' + (columnNumber % 26));
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}

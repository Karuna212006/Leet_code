// Last updated: 7/14/2026, 1:58:49 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        int tw=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                f++;
                
            }else if(bills[i]==10){
                if(f!=0){
                t++;
                f--;
            }else{
                return false;
            }  }else{
                if(t!=0&&f!=0){
                tw++;
                t--;
                f--;
                }else if (f>=3){
                    tw++;
                    f-=3;  
                }else {
                    return false;
                } 
                }
            } return true; 
             }
       }
    
        
    

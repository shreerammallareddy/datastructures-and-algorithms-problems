class Solution {
    /* Time Complexity O(n) and Space Complexity O(1)
        
        Logic: 

        1. Since the array is to be divided into 3 parts and sum of each part must be equal hence,
           the average of whole sum of array elements must be divisible by 3. Based on this we formulate
           first Condition. 
        2. The Second Condition is Since the sum of the 3 parts must be equal 
           
    */
    // System.out.println(sum);
    // System.out.println("firstSubSumFound: "+firstSubSumFound);
    // System.out.println("secondSubSumFound: "+secondSubSumFound);
    // System.out.println("thirdSubSumFound: "+thirdSubSumFound);
    public boolean canThreePartsEqualSum(int[] A) {
        
        if(A.length == 0){
            return false;
        }
        
        int sum = 0;
        
        for(int i:A){
            sum+=i;
        }
        
        if(sum%3 != 0){
            return false;
        }else{
            
            int subsum = sum/3;
            boolean firstSubSumFound = false;
            boolean secondSubSumFound = false;
            boolean thirdSubSumFound = false;
            sum = 0;
            for(int i:A){
               
                 sum+=i;
                if(!firstSubSumFound && sum==subsum){
                   firstSubSumFound = true;
                }else if(firstSubSumFound && !secondSubSumFound && sum == 2*subsum){
                   secondSubSumFound = true;
                }else if(firstSubSumFound && secondSubSumFound && !thirdSubSumFound && sum == 3*subsum){
                   thirdSubSumFound = true;
                }       
               
            }
            
             if(firstSubSumFound && secondSubSumFound && thirdSubSumFound){
                 return true;
             }
            
            return false;
            
        }
        
        
    }
}
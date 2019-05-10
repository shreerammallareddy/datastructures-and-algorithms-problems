class Solution {
 /*   The Key point here is the input; The input here given is 1 <= a[i] <= n i.e.,
      the values of input array are always less than the size of the input.
      
      Hence, the logic here is to turn the value in that index to -1. below is the clearly mentioned process
      input : [4,3,2,7,8,2,3,1]
      
      Here the numbers start from 1 not zer so indices should also be considered from 1 hence ArrayIndex +1
              a[0] = 4;
              now make the value at 3rd index to negetive
              [4,3,2,-7,8,2,3,1]
              
              a[1] = 3
              now make the value at 2nd index to negetive
              [4,3,-2,-7,8,2,3,1]
              
              a[2] = Abs(-2)
              now make the value at 1st index to negetive
              [4,-3,-2,-7,8,2,3,1]
              
              a[3] = Abs(-7)
              now make the value at 6th index to negetive
              [4,-3,-2,-7,8,2,3,1]
              .
              . -> skipping till index 5. The input at index 5 is [4,3,-1,-1,-1,2,3,1]
              
              a[5] = 2
              now make the value at 1st index to -ve
              But 1st index is already -ve so this is [repeating element]+1 and store it in resultant array
              [4,-3,-2,-7,-8,2,3,1]              
              
              
              a[6] = 3
              now make the value at 2nd index to -ve
              But 2nd index is already -ve so this is [repeating element]+1 and store it in resultant array
              [4,-3,-2,-7,-8,2,3,1]
              
              a[7] = 1
              now make the value at 0th index to -ve
              [-4,-3,-2,-7,-8,2,3,1]
 */   
    
    public List<Integer> findDuplicates(int[] nums) {
        
        if(nums.length == 0){
            return new ArrayList();
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=0;i< nums.length; i++){
            
            int indexValToChange = Math.abs(nums[i])-1;
            if(nums[indexValToChange] > 0){
                nums[indexValToChange] = -nums[indexValToChange];             
            }else{
                res.add(indexValToChange+1);
            }  
            //printArr(nums);
        }
        
        return res;
        
    } 
    
    // private void printArr(int[] nums){
    //     for(int i:nums){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }
}
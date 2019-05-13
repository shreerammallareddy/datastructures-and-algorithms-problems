/* Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        
       return j+1;
		
    }
}
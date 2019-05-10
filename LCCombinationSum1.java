class Solution {
    /*
     This is one of the classic example to get started with Back tracking. Here in this problem, we have to find out the all
     possible combinations to meet specific Constraint which here in case is sum must be equal to given target.
     The Logic in Backtraking is depth fist Search as similar to tree where we find all child nodes.
     The seed condition for recurssion would be either the length of input Array or any additional contraint give such as "target" in this problem
    
    */
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    
    
    private void backtracking(List<List<Integer>> result, List<Integer> tempList, int[] input, int target, int start){
        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new ArrayList(tempList));
            return;
        }
        
        for(int i = start; i<input.length ; i++){
            tempList.add(input[i]);
            backtracking(result, tempList, input, target - input[i], i);
            tempList.remove(tempList.size()-1);            
        }
        
    }
    
    
}
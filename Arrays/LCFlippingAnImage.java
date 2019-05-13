/*
// Step1 : Horizontal Flip of all Elements it means Reversing teh array
// Step2 : Invert the elements of Horizontally flipped array, i.e., replacing each elements binary compliment by using the JAVA ^ bit wise operator by doing bitwise XOR with 1
Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int col = 0;
		for (int row = 0;row< A.length; row++){
			
			int start = 0;
			int end = A[row].length - 1;
			while( start < end ){
				int temp = A[row][end]^1;
				A[row][end] = A[row][start]^1;
				A[row][start] = temp;
				start++;
				end--;
			}
			if(start==end) {
				A[row][start] = A[row][start] ^1;
			}		
		}
        
        return A;
    }
}
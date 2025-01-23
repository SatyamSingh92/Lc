
class Solution {
    public int longestOnes(int[] nums, int k) {
        int countOfZero= 0;
        int left =0;
        int maxLen =0;
        for(int right =0; right< nums.length; right++) {
            if(nums[right] == 0) {
                countOfZero++;
            }
            while( countOfZero > k) {
                // points 
             if (nums[left] == 0) { 
                    countOfZero--;
                }
             
             left++;
             
             }
           maxLen = Math.max(maxLen, right-left+1);

        }

        return maxLen;
        
        
    }
}
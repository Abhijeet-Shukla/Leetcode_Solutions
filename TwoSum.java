// Difficulty=Easy
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int i = 0, j = 1;
        while(nums[i]+nums[j] != target){
            if(j == nums.length-1){
                i++;
                j=i+1;
            }
            else
                j++;
        }
        result[0] = i;
        result[1] = j;
        return result;
    }
}

// Runtime=49ms
// Memory=39.2MB

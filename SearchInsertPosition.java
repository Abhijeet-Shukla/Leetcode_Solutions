// Difficulty=Easy

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1,ans=0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return ans=m;
            }
            else if(nums[m]<target){
                ans=m+1;
                s=m+1;
            }
            else{
                e=m-1;
                ans=m;
            }
        }
        return ans;
    }
}

// RunTime=0ms
// Memory=43.7MB

class Solution {
    public int search(int[] nums, int target) {
        
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m] == target)
                return m;
            if(nums[m] < target)
                l=m+1;
            else
                r=m-1;
        }
        return -1;        
    }
}

//Runtime=0ms
//Memory=39.7MB

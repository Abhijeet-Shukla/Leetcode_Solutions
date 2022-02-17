// Difficulty=Medium

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n];
        while(n<k){
            k-=n;
        }
        for(int i=0;i<n-k;i++){
                arr[i+k]=nums[i];
            }
        for(int i=0;i<k;i++){
                arr[i]=nums[n-k+i];
            }
        for(int i=0;i<n;i++){
                nums[i]=arr[i];
            }
    }
}

//Runtime=1ms
//Memory=64.9MB

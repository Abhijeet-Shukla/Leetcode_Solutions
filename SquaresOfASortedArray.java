// Difficulty=Easy

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr=new int[nums.length];
        Queue<Integer> pQ=new PriorityQueue<>();
        int k=0;
        for(int i:nums){
            pQ.add(i*i);
        }
        for(int i=0;i<nums.length;i++){
            arr[k++]=pQ.peek();   
            pQ.poll();
        }       
        return arr;
    }
}

//Runtime=55ms
//Memory=58.6MB

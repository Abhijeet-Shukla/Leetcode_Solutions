// Difficulty=Medium

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Queue<Character> queue = new LinkedList<>();
    
        for(int i = 0; i<s.length(); i++){
       
            while(queue.contains(s.charAt(i)))
                queue.poll();
        
            queue.add(s.charAt(i));
            maxLen = Math.max(maxLen, queue.size());
        }
        return maxLen;
    }
}

// Runtime=36ms
// Memory=45.1MB

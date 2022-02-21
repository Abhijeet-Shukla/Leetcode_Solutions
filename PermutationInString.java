// Difficulty=Medium

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character,Integer> window =  new HashMap<Character,Integer>();
        HashMap <Character,Integer> need =  new HashMap<Character,Integer>();
	
	    for(char c : s1.toCharArray()){
            need.put(c,need.getOrDefault(c,0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)) {
                 window.put(c,window.getOrDefault(c,0) + 1);

                if(window.get(c).equals(need.get(c)))valid++;
            }
            while (right - left >= s1.length()) {
                if (valid == need.size())
                    return true;
                char d = s2.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                     window.put(d,window.getOrDefault(d,0) - 1);
                }
            }
        }
        return false;
    }
}

// Runtime=45ms
// Memory=44.1MB

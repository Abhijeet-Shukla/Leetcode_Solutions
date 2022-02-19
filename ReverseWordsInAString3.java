// Difficulty=Easy

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
	    int n = arr.length;
    	int j =0;
	    int i =0;

	    while(i<n )
	    { 
		    while(j<n && (int) arr[j] != 32)
			    j++;
        
		    rev(arr, i, j-1);
		    i=j+1;
		    j= i;
	    }
	    return String.valueOf(arr);
    }

    public void rev(char[] arr, int i , int j)
    {
	    while(i<j && j<arr.length)
	    {
		    char temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++;
		    j--;
	    }
    }
}

// Runtime=2ms
// Memory=42.5MB

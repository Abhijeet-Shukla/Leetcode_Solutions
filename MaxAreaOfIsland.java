// Difficulty=Medium

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxCount = 0;
        
        if(m == 1  && n == 1)
            return grid[0][0] == 1 ? 1 : 0;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentCount = floodFill(grid, i, j, 2);
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
        }

        return maxCount;
    }
    
    public int floodFill(int[][] image, int sr, int sc, int newColor) {
        return fillRecursively(image, sr, sc, 1, newColor, 1);
    }
    
    public int fillRecursively(int[][] image, int sr, int sc,
                                      int currentColor, int newColor, int count) {

        int m = image.length;
        int n = image[0].length;

        if (sr < 0 || sc < 0 || sr >= m || sc >= n || image[sr][sc] == newColor || image[sr]            [sc] != currentColor)
            return 0;

        image[sr][sc] = newColor;

        count += fillRecursively(image, sr - 1, sc, currentColor, newColor, 1);
        count += fillRecursively(image, sr + 1, sc, currentColor, newColor, 1);
        count += fillRecursively(image, sr, sc - 1, currentColor, newColor, 1);
        count += fillRecursively(image, sr, sc + 1, currentColor, newColor, 1);
        
        return count;
    }
}

// Runtime=4ms
// Memory=47MB

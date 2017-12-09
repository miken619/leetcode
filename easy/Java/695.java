/*Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.*/

class 695 {
  public int maxAreaOfIsland(int[][] grid) {
      int n = grid.length, m = grid[0].length;
      int maxIsland = 0;
      
      for(int i = 0; i < n; ++i) {
          for(int j = 0; j < m; ++j) {
              if(grid[i][j] == 1) {
                  maxIsland = Math.max(dfs(grid, i, j, n, m), maxIsland);
              }
          }
      }
      
      return maxIsland;
  }
  
  public int dfs(int[][] grid, int i, int j, int n, int m) {     
      if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) return 0;
      
      grid[i][j] = 0;     
      return 1 + dfs(grid, i - 1, j, n, m) + 
                 dfs(grid, i + 1, j, n, m) + 
                 dfs(grid, i, j - 1, n, m) + 
                 dfs(grid, i, j + 1, n, m);
      
  }
}
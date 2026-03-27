import java.util.*;

class Solution {

    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        if (maze[0][0] == 0) return ans;
        boolean[][] vis = new boolean[n][n];
        solve(0, 0, maze, n, ans, "", vis);
        return ans;
    }

    public void solve(int i, int j, int[][] maze, int n,
                      ArrayList<String> ans, String path, boolean[][] vis) {
        if (i==n-1 && j==n-1) {
            ans.add(path);
            return;
        }
        vis[i][j] = true;
        if (i+1<n && maze[i+1][j]==1 && !vis[i+1][j]) {
            solve(i+1,j,maze,n,ans,path+"D",vis);
        }
        if (j-1>=0 && maze[i][j-1]==1 && !vis[i][j-1]) {
            solve(i,j-1,maze,n,ans, path+"L",vis);
        }
        if (j+1<n && maze[i][j+1]==1 && !vis[i][j+1]) {
            solve(i,j+1,maze,n,ans,path+"R",vis);
        }
        if (i-1>=0 && maze[i-1][j]==1 && !vis[i-1][j]) {
            solve(i-1,j,maze,n,ans,path+"U",vis);
        }
        vis[i][j] = false;
    }
}
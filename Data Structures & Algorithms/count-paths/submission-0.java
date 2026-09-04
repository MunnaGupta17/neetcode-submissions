class Solution {
    Map<String,Integer> memo;
    int bfs(int m,int n,int row, int col) {
        String position = row+" "+col;
        if(memo.containsKey(position)) return memo.get(position);
        if (row < 0 || row >= m || col < 0 || col >= n)
            return 0;

        if (row == m - 1 && col == n - 1)
            return 1;
        memo.put(position,bfs(m,n,row+1, col) + bfs(m,n,row, col+1));
        return memo.get(position);
    }

    public int uniquePaths(int m, int n) {
        memo = new HashMap<>();
        return bfs(m,n,0,0);
    }
}

class Solution {
    
    Map<Integer,Long> memo = new HashMap<>();
    long dfs(int[] coins, int amount){
        if(amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        if(memo.containsKey(amount)) return memo.get(amount);
        long result = Integer.MAX_VALUE;
        for(int i =0; i<coins.length; i++){
            long dfsResult = dfs(coins,amount-coins[i]);
            result = Math.min(result,(long)dfsResult+1);
        }        
        memo.put(amount,result);
        return result;
    }

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        long result = dfs(coins,amount);
        if(result >= Integer.MAX_VALUE) return -1;
        return (int)result;
    }
}

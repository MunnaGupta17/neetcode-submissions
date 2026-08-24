class Solution {
    static Map<String,Integer> memo = new HashMap<>();
    static int bfs(int n){
        System.out.println(n);
        if(n == 0) return 1;
        if(n < 0) return 0;
        String one = n+"-1";
        String two = n+"-2";
        if(memo.containsKey(one) && memo.containsKey(two)){
            return memo.get(one)+memo.get(two);
        }else if(memo.containsKey(one)){
            return memo.get(one)+bfs(n-2);
        }else if(memo.containsKey(two)){
            return bfs(n-1)+memo.get(two);
        }
        int oneAns = bfs(n-1);
        int twoAns = bfs(n-2);
        memo.put(one,oneAns);
        memo.put(two,twoAns);
        return oneAns+twoAns;
    }
    public int climbStairs(int n) {
        return bfs(n);
    }
}

        
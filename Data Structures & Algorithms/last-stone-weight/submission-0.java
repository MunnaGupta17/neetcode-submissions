class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int lastStone = stones[0];
        for(int i = 0; i<stones.length; i++){
            q.add(stones[i]);
        }
        while(q.size() >= 2){
            int x = q.poll();
            int y = q.poll();
            if(x<y){
                q.add(y-x);
            }else if(y<x){
                q.add(x-y);
            }
        }
        if(q.size() == 1) return q.poll();
        return 0;
    }
}

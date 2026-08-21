class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left =0, right = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        while(left<=right){
            long mid = (left+right)/2;
            long time = 0;
            for(int j = 0; j<piles.length; j++){
                time += (long)Math.ceil((double)piles[j]/mid);
            }
            // System.out.println(left+" , "+right+" , "+time);
            if(time <= h){
            
                result = Math.min(result,(int)mid);
                right = (int)mid-1;
                
            }else{
                left = (int)mid+1;
            }
        }

        return result;
        
    }
}
// 2147483647

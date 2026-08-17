class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j= heights.length-1, n = heights.length;
        int result = 0;
        while(i<j){
            // System.out.println("i = "+i+".   j = " +j);
            int width = j-i;
            int height = Math.min(heights[i],heights[j]);
            // System.out.println(width+" , "+height);
            int currentVolume = width*height;
            if(currentVolume > result) result = currentVolume;
            if(heights[i] > heights[j]) j--;
            else i++;

        }
        return result;
    }
}

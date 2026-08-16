class Solution {
    public int[] productExceptSelf(int[] nums) {

        Map<Integer,Integer> prefix = new HashMap<>();
        int total = 1;
        for(int i = 0; i<nums.length; i++){
            total *= nums[i];
            prefix.put(i,total);
        }
        Map<Integer,Integer> suffex = new HashMap<>();
        int sufTotal = 1;
        for(int i = nums.length-1; i>=0; i--){
            sufTotal *= nums[i];
            suffex.put(i,sufTotal);
        }
        nums[0] = suffex.get(1);
        nums[nums.length-1] = prefix.get(nums.length-2);
        for(int i = 1; i<nums.length-1; i++){
            nums[i] = prefix.get(i-1)*suffex.get(i+1);
        }

        return nums;
        
    }
}  


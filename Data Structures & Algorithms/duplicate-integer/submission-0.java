class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> store = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            // System.out.println(store);
            if(store.contains(nums[i]))return true;
            store.add(nums[i]);
        }
        return false;
 
    }
}

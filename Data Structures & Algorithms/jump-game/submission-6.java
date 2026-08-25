class Solution {
    Map<Integer, Boolean> already = new HashMap<>();
    boolean bfs(int[] nums, int index) {
        if (index == nums.length - 1)
            return true;
        if (index >= nums.length - 1)
            return false;
        if (already.containsKey(index))
            return already.get(index);
        int maxJump = 1;
        boolean result = false;
        while (maxJump <= nums[index]) {
            result = (result || bfs(nums, index + maxJump));
            if (result)
                break;
            maxJump++;
        }
        already.put(index, result);
        return result;
    }

    public boolean canJump(int[] nums) {
        already.clear();
        boolean result = bfs(nums, 0);

        return result;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            list.add(nums[i]);
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }

        }
        int result = 0;
        for(int i= 0; i<list.size(); i++){
            int length= 1;
            while(i+1 < list.size() && list.get(i+1) == list.get(i)+1){
                length++;
                i++;
            }
            if(length > result) result = length;
        }
        return result;
    }
}


 

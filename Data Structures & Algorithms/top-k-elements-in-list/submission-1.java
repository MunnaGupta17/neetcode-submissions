class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<k; i++){
            int key = 0, f = 0;
            for(Integer num : freq.keySet()){
                int value = freq.get(num);
                if(f < value){
                    key = num;
                    f = value;
                }
            }
            list.add(key);
            freq.remove(key);
        }
 
        int[] result = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}

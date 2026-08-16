class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        // System.out.println(freq);
        int[] result = new int[k];

        List<Integer>[] bucket = new List[nums.length+1];
        
        for(Integer num : freq.keySet()){
            int value = freq.get(num);
            if(bucket[value] == null){
               bucket[value] = new ArrayList<>();
            }
            
            bucket[value].add(num);
        }
        // System.out.println(bucket.length);
        int j = 0;
        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                List<Integer> freqNum = bucket[i];
                // System.out.println(freqNum);
                for(int a = 0; a<freqNum.size(); a++){
                    result[j] = freqNum.get(a);
                    j++;
                    k--;
                }
                if(k == 0) break;
            }
            // System.out.println(bucket[i]);
        }
        
        return result;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
            
        }
        // System.out.println(map);
        for(int i =0 ; i<nums.length; i++){
            int difference = target-nums[i];
            System.out.println(i+"  "+difference);
            if(map.containsKey(difference)){
                
                    int secondnumberindex = map.get(difference);
                    if(i != secondnumberindex) {
                        if(i < secondnumberindex){
                            result[0] = i;
                            result[1] = secondnumberindex;
                        }else{
                            result[0] = secondnumberindex;
                            result[1] = i;
                        }
                        return result;
                    }

            }
        }
        return result;
    }
}

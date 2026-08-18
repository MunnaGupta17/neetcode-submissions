class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" , ");
        }
        System.out.println();
        int n = nums.length;
        Set<String> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int total = nums[i]+nums[left]+nums[right];
                if(total == 0){
                    String tripletString = nums[i]+" "+nums[left]+" "+nums[right];
                    if(!set.contains(tripletString)){
                        set.add(tripletString);
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[left]);
                        triplet.add(nums[right]);
                        result.add(triplet);
                        
                    }
                    left++;
                    right--;

                }else if(total > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
        
    }
}

// [-1,0,1,2,-1,0,0,0,4,4,4,4,4,-4,-4,-4,-4,6,-50,-6]





//  -50 , -6 , -4 , -4 , -4 , -4 , -1 , -1 , 0 , 0 , 0 , 0 , 1 , 2 , 4 , 4 , 4 , 4 , 4 , 6 , 
//                                           |                                           |
   

















class Solution {
    Set<List<Integer>> set;
    void bfs(int[] nums, List<Integer> temp,int index){
        if(index >= nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<temp.size(); i++){
                list.add(temp.get(i));
            }
            Collections.sort(list);
            set.add(list);
            return;
        }
        
        bfs(nums,temp,index+1);
        temp.add(nums[index]);
        bfs(nums,temp,index+1);
        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        set = new HashSet<>();
        bfs(nums,new ArrayList<>(),0);
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> a: set){
            result.add(a);
        }
        return result;
    }
}

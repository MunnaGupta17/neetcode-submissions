class Solution {

    List<List<Integer>> result = new ArrayList<>();
    void bfs(int[] nums, int index,List<Integer> list){
        if(index >= nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<list.size(); i++){
                temp.add(list.get(i));
            }
            result.add(temp);
            return;
        }
        bfs(nums,index+1,list);
        list.add(nums[index]);
        bfs(nums,index+1,list);
        list.remove(list.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        bfs(nums,0,new ArrayList<>());
        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();

        Map<String,List<Integer>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            int[] freq = new int[256];
            String temp = strs[i];
            for(int j = 0; j<temp.length(); j++){
                freq[temp.charAt(j)]++;
            }
            StringBuilder sortedStr = new StringBuilder();
            for(int j = 0; j<freq.length; j++){
                while(freq[j] > 0){
                    // System.out.println((char)j);
                    sortedStr.append((char)j);
                    freq[j]--;
                }
            }
            if(map.containsKey(sortedStr.toString())){
                List<Integer> updateHolder = map.get(sortedStr.toString());
                updateHolder.add(i);
                map.put(sortedStr.toString(),updateHolder);
            }else{
                List<Integer> newValue = new ArrayList<>();
                newValue.add(i);
                map.put(sortedStr.toString(),newValue);
            }
            
        }

        for(String str : map.keySet()){
            List<Integer> indexes = map.get(str);
            List<String> group = new ArrayList<>();
            for(int i = 0; i<indexes.size(); i++){
                group.add(strs[indexes.get(i)]);
            }
            result.add(group);
        }
        return result;
    }
}

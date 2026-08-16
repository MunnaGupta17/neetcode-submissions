class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length(), tLength = t.length();
        if(sLength != tLength) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i<sLength; i++){
            if(!map.containsKey(t.charAt(i))) return false;
            if(map.get(t.charAt(i)) == 1) map.remove(t.charAt(i));
            else map.put(t.charAt(i),map.get(t.charAt(i))-1);
            
        }

        return true;


    }
}

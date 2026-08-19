class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] == windowFreq[i])
                matches++;
        }
        if(matches == 26) return true;
        int left = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            windowFreq[s2.charAt(left) - 'a']--; // removed the first character in window

            windowFreq[s2.charAt(i) - 'a']++; // added new character in the window
            matches = 0;
            for(int j = 0; j<26; j++){
                if(s1Freq[j] == windowFreq[j]) matches++;
            }
            if(matches == 26) return true;

            left++;
        }

        return matches == 26;
    }
}

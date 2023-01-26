class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        //keep a static boolean array of 26, where the value of each element is either true (in string allowed) or false (not in string allowed)
        boolean[] allowedArr = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            allowedArr[allowed.charAt(i)-'a'] = true;
        }        
        
        //traverse words array, and for each word...
          //1. look at each character and check if the corresponding position in the array is true (if the char is in string allowed)
          // 2. if false, break and continue to the next word
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wi = 0;
            while (wi < word.length()) {
                char c = word.charAt(wi);
                if (!allowedArr[c-'a']) break;
                wi++;
            }
            
            //we increment count only if we traversed the whole word without breaking, which means we got a 'consistent' word 
            if (wi >= word.length()) count++;
        }
        
        return count;
    }
}
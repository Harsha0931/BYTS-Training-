import java.util.*;
import java.io.*;


class Solution {
    public char repeatedCharacter(String s) {
        int len = s.length();
        char[]arr=s.toCharArray();
        HashSet<Character>h = new HashSet<>();
        for(int i=0;i<=len-1;i++){
            char c= arr[i];
            if(h.contains(c)){
                return c;
            }
            else{
                h.add(c);
            }
        }
        return '\0';
        
    }
}
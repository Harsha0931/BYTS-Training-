class Solution {
    public int uniqueMorseRepresentations(String[] words) {

    String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    HashMap<String,Boolean>mp=new HashMap<>();

    for(int i=0;i<words.length;i++){

    String check="";

    for(int j=0;j<words[i].length();j++){

    check+=arr[words[i].charAt(j)-'a'];

    }

    mp.put(check,true);

    }

    return mp.size();

        
    }
}
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int l=s.length();
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<l;++i){
            char a=s.charAt(i);
            if(map.containsKey(a)){
                int val=map.get(a);
                if(distance[a-'a']!=(i-val-1))return false;
            }
            map.put(a,i);
        }
        return true;
        
        
    }
}
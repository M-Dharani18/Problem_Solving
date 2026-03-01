class Solution {
    public int countCharacters(String[] words, String chars) {
        // Map<Character,Integer> mp = new HashMap<>();
        // int sum=0;
        // for(char ch:chars.toCharArray()){
        //     mp.put(ch,mp.getOrDefault(ch,0)+1);
        // }
        // for(String s:words){
        //     Map<Character,Integer> mp1 = new HashMap<>();
        //     boolean valid=true;
        //     for(char ch:s.toCharArray()){
        //     mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        // }
        //     for(char ch:mp1.keySet()){
        //         if(mp1.get(ch)>mp.getOrDefault(ch, 0)) {
        //         valid=false;
        //         break;}
        //     }
        // if(valid) sum+=s.length();
        // }
        // return sum;
        int sum=0;
        int[] freq = new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        for(String s:words){
            boolean valid=true;
            int[] freq1 = new int[26];
            for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
            }
            for(char c:s.toCharArray()){
                if(freq1[c-'a']>freq[c-'a']) {
                    valid=false;
                    break;
                }
            }
            if(valid) sum+=s.length();
        }
        return sum;
    }
}
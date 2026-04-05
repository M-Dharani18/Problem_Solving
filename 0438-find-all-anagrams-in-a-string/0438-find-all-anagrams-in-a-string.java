class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // int l=0;
        // List<Integer> li = new ArrayList<>();
        // Map<Character,Integer> mp1 = new HashMap<>();
        // for(char ch:p.toCharArray()){
        //     mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        // }

        // Map<Character,Integer> mp2 = new HashMap<>();
        // for(int r=0;r<s.length();r++){
        //     if(r-l+1>p.length()){
        //         mp2.put(s.charAt(l),mp2.get(s.charAt(l))-1);
        //         if(mp2.get(s.charAt(l))==0) mp2.remove(s.charAt(l));
        //         l++;
        //     }
        //     mp2.put(s.charAt(r),mp2.getOrDefault(s.charAt(r),0)+1);
        //     if(mp1.equals(mp2)) li.add(l);
        // }
        // return li;

        List<Integer> li = new LinkedList<>();
        if(s.length()<p.length()) return li;
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:p.toCharArray()){
             mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int counter = mp.size();
        int l=0,r=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0) counter--;
            }
            r++;
            while(counter==0){
                char temp=s.charAt(l);
                if(mp.containsKey(temp)){
                    mp.put(temp,mp.get(temp)+1);
                    if(mp.get(temp) > 0) counter++;
                }
            if(r-l==p.length()) li.add(l);
            l++;
            }
        }
        return li;
    }
}
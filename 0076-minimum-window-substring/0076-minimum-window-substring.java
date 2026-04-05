class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int counter=mp.size(),head=0;
        int l=0,r=0,len=Integer.MAX_VALUE;
        while(r<s.length()){
            char c=s.charAt(r);
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)-1);
                if(mp.get(c)==0) counter--;
            }
            r++;
            while(counter==0){
                char a = s.charAt(l);
                if(mp.containsKey(a)){
                    mp.put(a,mp.get(a)+1);
                    if(mp.get(a)>0) counter++;
                }
                if(r-l<len){
                    len=r-l;
                    head=l;
                }
                l++;
            }
        }
        if(len==Integer.MAX_VALUE) return "";
        return s.substring(head,head+len);
    }
}
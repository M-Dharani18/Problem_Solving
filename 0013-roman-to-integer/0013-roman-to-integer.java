class Solution {
    public int romanToInt(String s) {
        // int res=0;
        // HashMap<Character,Integer> hm = new HashMap<>();
        // hm.put('I',1);
        // hm.put('V',5);
        // hm.put('X',10);
        // hm.put('L',50);
        // hm.put('C',100);
        // hm.put('D',500);
        // hm.put('M',1000);

        // for(int i=0;i<s.length()-1;i++){
        //     if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
        //     res-=hm.get(s.charAt(i));
        //     else{
        //         res+=hm.get(s.charAt(i));
        //     }
        // }
        // return res+hm.get(s.charAt(s.length()-1));

    //     int ans=0;
    //     int prevnum=0;
    //     int num=0;
    //     for(int i=s.length()-1;i>=0;i--){
    //         char ch=s.charAt(i);
    //         if(ch=='I') num =1;
    //         if(ch=='V') num=5;
    //         if(ch=='X') num=10;
    //         if(ch=='L') num=50;
    //         if(ch=='C') num=100;
    //         if(ch=='D') num=500;
    //         if(ch=='M') num=1000;

    //         if(num<prevnum) { ans=ans-num; }
    //         else ans=ans+num;
    //         prevnum=num;
    //     }
    //     return ans;
    // }
    int res=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        for(int i=0;i<s.length()-1;i++){
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))) { res-=hm.get(s.charAt(i)); }
            else res+=hm.get(s.charAt(i));
        }
        return res+hm.get(s.charAt(s.length()-1));
    }

}
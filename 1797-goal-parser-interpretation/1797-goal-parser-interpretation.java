class Solution {
    public String interpret(String command) {
        String s = command,s1="";
        s=command.replace("()","o");
        s1=s.replace("(al)","al");
        return s1;
     }
}
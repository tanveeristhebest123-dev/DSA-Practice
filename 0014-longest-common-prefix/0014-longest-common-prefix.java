class Solution {
    public String longestCommonPrefix(String[] strs) {
        String n=strs[0];
        String s1="";
        String s2="";
        for(int i=0;i<n.length();i++){
            s1+=n.charAt(i);
            int c=0;
            for(var j:strs){
                if(j.startsWith(s1)){
                    c++;
                }
            }
            if(c==strs.length){
                s2=s1;
            }
            else{
                break;
            }
        }
        return s2;
    }
}
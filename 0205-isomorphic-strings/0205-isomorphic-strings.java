class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        Map<Character,Character> m=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)))
            {}
            else{
                if(m.containsValue(t.charAt(i))){
                    return false;
                }
                m.put(s.charAt(i),t.charAt(i));
            }
            sb.append(m.get(s.charAt(i)));
        }
        return sb.toString().equals(t);
    }
}
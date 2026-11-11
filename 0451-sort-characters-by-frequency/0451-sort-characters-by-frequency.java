import java.util.Collection;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> vals = new ArrayList<>(m.values());
        Collections.sort(vals, Collections.reverseOrder());
        List<Character> keys = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(var i:vals){
            for(var j:m.entrySet()){
                if(i==j.getValue() && !keys.contains(j.getKey())){
                    sb.append(j.getKey().toString().repeat(i));
                    keys.add(j.getKey());
                }
            }
        }
        return sb.toString();
    }
}
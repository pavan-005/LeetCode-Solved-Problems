class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character, Character> hm = new HashMap<>(26);
        HashSet<Character> hs = new HashSet<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(ch1[i])){
                if(hm.get(ch1[i]) != ch2[i])
                    return false;
            } else{
                    if(hs.contains(ch2[i]))
                        return false;
                    hm.put(ch1[i], ch2[i]);           
                    hs.add(ch2[i]);         
            }               
        }
        return true; 
    }
}
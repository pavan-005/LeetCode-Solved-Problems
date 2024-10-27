class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;}

        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (hm.containsKey(c)) {
                if (!hm.get(c).equals(w)) {
                    return false;}
            } else {
                if (hs.contains(w)) {
                    return false;}
                hm.put(c, w);
                hs.add(w);}}
        return true;
    }
}
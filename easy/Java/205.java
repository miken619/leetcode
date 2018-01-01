/*Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.*/

class 205 {
    public boolean isIsomorphic(String s, String t) {   
        Map<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < t.length(); ++i) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if(map.containsKey(sCh)) {
                char temp = map.get(sCh);
                if(temp != tCh) return false;
            }else if(map.containsValue(tCh))  return false;
            else map.put(sCh, tCh);
            
        }
        return true;
    }
}
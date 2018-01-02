/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] patternArray = pattern.toCharArray();
        String[] strArray = str.split(" ");
        if(patternArray.length != strArray.length) return false; 
        
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < patternArray.length; ++i) {
            String patternElem = strArray[i];
            char strElem = patternArray[i];
            System.out.println("patternElem: " + patternElem);
            System.out.println("strElem: " + strElem);
            if(map.containsKey(strElem)) {
                String value = map.get(strElem);
                if(!value.equals(patternElem)) return false;
            }else {
                if(map.containsValue(patternElem)) return false;
                else map.put(strElem, patternElem);
            }
        }
        return true;
    }
}
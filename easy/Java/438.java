/*Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".*/

class 438 {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        
        for(char ch: p.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        int counter = map.size();
        
        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                int value = map.get(c) - 1;
                map.put(c, value);
                if(value == 0) --counter;
            }
            ++end;
            while(counter == 0) {
                char tempc = s.charAt(start);
                if(map.containsKey(tempc)) {
                    int value = map.get(tempc) + 1;
                    map.put(tempc, value);
                    if(value > 0) ++counter;
                }
                if(end - start == p.length()) result.add(start);
                ++start;
            }
        }
        return result;
    }
}
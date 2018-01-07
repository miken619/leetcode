/*Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.*/

class Solution {
    public String frequencySort(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         StringBuilder sb = new StringBuilder();
//         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
//             new Comparator<Map.Entry<Character, Integer>>() {
//                 @Override
//                 public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
//                     return (b.getValue() - a.getValue() == 0) ? a.getKey() - b.getKey() : b.getValue() - a.getValue();
//                 }
//             }
//         );
        
//         for(char ch: s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
        
//         pq.addAll(map.entrySet());
        
//         while(!pq.isEmpty()) {
//             Map.Entry m = pq.remove();
            
//             for(int i = 0; i < (int)m.getValue(); ++i) {
//                 sb.append(m.getKey());
//             }
//         }
        
//         return sb.toString();
        
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(max, map.get(ch));
        }
        
        List<Character>[] bucket = new List[max + 1];
        
        for(char ch: map.keySet()) {
            int value = map.get(ch);
            
            if(bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            
            bucket[value].add(ch);
        }
        
        for(int i = bucket.length - 1; i >= 0; --i) {
            if(bucket[i] != null) {
                for(char ch: bucket[i]) {
                    for(int j = 0; j < map.get(ch); ++j) {
                        sb.append(ch);
                    }
                }
            }
        }
        
        return sb.toString();
    }
}
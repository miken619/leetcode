/*In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Note:
The input will only have lower-case letters.
1 <= dict words number <= 1000
1 <= sentence words number <= 1000
1 <= root length <= 100
1 <= sentence words length <= 1000
*/

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] tokens = sentence.split(" +");
        TrieNode root = buildTrie(dict);
        return replaceWords(tokens, root);
    }
    
    public String replaceWords(String[] tokens, TrieNode root) {
        StringBuilder sb = new StringBuilder();
        
        for(String token: tokens) {
            sb.append(findShortestWord(token, root));
            sb.append(" ");
        }
        
        return sb.substring(0, sb.length() - 1);
    }
    
    public String findShortestWord(String token, TrieNode root) {
        TrieNode temp = root;
        StringBuilder sb = new StringBuilder();
        
        for(char ch: token.toCharArray()) {
            sb.append(ch);
            if(temp.children[ch - 'a'] != null) {
                if(temp.children[ch - 'a'].isWord == true) return sb.toString();
                temp = temp.children[ch - 'a'];
            }else return token;
        }
        
        return token;
    }
    
    public TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode(' ');
  
        for(String str: dict) {
            TrieNode temp = root;
            for(char ch: str.toCharArray()) {
                if(temp.children[ch - 'a'] == null) temp.children[ch - 'a'] = new TrieNode(ch);
                temp = temp.children[ch - 'a'];
            }
            temp.isWord = true;
        }
        
        return root;
    }
    
    class TrieNode {
        char val;
        TrieNode[] children;
        boolean isWord;
        
        TrieNode(char val) {
            this.val = val;
            children = new TrieNode[26];
            isWord = false;
        }
    }
}
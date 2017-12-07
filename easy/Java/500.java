/*Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

class 500 {
    public String[] findWords(String[] words) {
        String regex = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        List<String> list = new ArrayList<String>();
    
        for(String word: words) {
            if(word.toLowerCase().matches(regex)) list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
}
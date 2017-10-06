
// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

// Example 1:
// Input: ["Hello", "Alaska", "Dad", "Peace"]
// Output: ["Alaska", "Dad"]

return words.filter((w) => {
    
     if (
         /^[qwertyuiop]*$/i.test(w) ||
         /^[asdfghjkl]*$/i.test(w) ||
         /^[zxcvbnm]*$/i.test(w)
     ) return true;
     
     return false;
 });
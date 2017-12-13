/*Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/

class 506 {
    public String[] findRelativeRanks(int[] nums) {
         Integer[] index = new Integer[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        
        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        
        String[] result = new String[nums.length];
        
        for(int i = 0; i < result.length; ++i) {
            if(i == 0) result[index[i]] = "Gold Medal";
            if(i == 1) result[index[i]] = "Silver Medal";
            if(i == 2) result[index[i]] = "Bronze Medal";
            if(i > 2) result[index[i]] = (i + 1) + "";
        }
        return result;
     }
}
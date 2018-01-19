/*You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.

Example 1:
Input: [[1,2], [2,3], [3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4]
Note:
The number of given pairs will be in the range [1, 1000].
*/

class Solution {
    public int findLongestChain(int[][] pairs) {
        int length = pairs.length;
        int[] result = new int[length];
        
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        Arrays.fill(result, 1);
        for(int i = 1; i < length; ++i) {
            for(int j = 0; j < i; ++j) {
                result[i] = Math.max(result[i], (pairs[i][0] > pairs[j][1]) ? result[j] + 1: result[j]);
            }
        }
        
        return result[length - 1];
    }
}
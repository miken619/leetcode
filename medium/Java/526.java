/*Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 <= i <= N) in this array:

The number at the ith position is divisible by i.
i is divisible by the number at the ith position.
Now given N, how many beautiful arrangements can you construct?

Example 1:
Input: 2
Output: 2
Explanation: 

The first beautiful arrangement is [1, 2]:

Number at the 1st position (i=1) is 1, and 1 is divisible by i (i=1).

Number at the 2nd position (i=2) is 2, and 2 is divisible by i (i=2).

The second beautiful arrangement is [2, 1]:

Number at the 1st position (i=1) is 2, and 2 is divisible by i (i=1).

Number at the 2nd position (i=2) is 1, and i (i=2) is divisible by 1.
Note:
N is a positive integer and will not exceed 15.*/

class Solution {
    public int countArrangement(int N) {
       boolean[] skip = new boolean[N + 1];
       return countArrangementHelper(N, 1, skip);
    }
    
    public int countArrangementHelper(int N, int idx, boolean[] skip) {
        if(idx > N) return 1;
        
        int result = 0;
        
        for(int i = 1; i <= N; ++i) {
            if(skip[i] == false) {
                if(i%idx == 0 || idx%i == 0) {
                    skip[i] = true;
                    result += countArrangementHelper(N, idx + 1, skip);
                    skip[i] = false;
                }else continue;
            }
        }
        
        return result;
    }
}
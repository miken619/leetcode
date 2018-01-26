/*Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]*/

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        
        combinationSum3Util(result, row, k, n, 1);      
        return result;
    }
    
    public void combinationSum3Util(List<List<Integer>> result, List<Integer> row, int k, int n, int idx) {
        if(k <= 0) {
            if(n == 0) result.add(new ArrayList<>(row));
            return;
        } 

        for(int i = idx; i <= 9; ++i) {    
          row.add(i);
          combinationSum3Util(result, row, k - 1, n - i, i + 1);   
          row.remove(row.size() - 1);

        }
    }
}
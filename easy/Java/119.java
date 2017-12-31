/*Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

*/

class 119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for(int i = 1; i <= rowIndex; ++i) {
            for(int j = i - 1; j >= 1; --j) {
                int temp = result.get(j) + result.get(j - 1);
                result.add(j, temp);        
            }
             result.add(1);
        }
        return result;
    }
}
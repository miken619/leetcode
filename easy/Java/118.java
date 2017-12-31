/*Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/

class 118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = null;
        for(int i = 1; i <= numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i; ++j) {
                if(j == 0 || j == i - 1) row.add(1);
                else row.add(j, prev.get(j) + prev.get(j - 1));
            }   
            prev = row;
            list.add(row);
        }
        return list;
    }
}
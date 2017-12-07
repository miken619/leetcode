/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

class 657 {
    public boolean judgeCircle(String moves) {
        int count = 0;
        
        for(int i = 0; i < moves.length(); ++i) {
            switch(moves.charAt(i)) {
                case 'L':
                case 'D':    
                    --count;
                    break;
                case 'R':
                case 'U':    
                    ++count;
                    break;               
            }
        }
        
        return count == 0;
    }
}
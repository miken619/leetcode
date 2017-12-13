/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

*/

class 013 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
        
        int result = 0;
        int prev = -1;
        
        for(int i = s.length() - 1; i >=0; --i) {
            int value = map.get(s.charAt(i));
            
            if(prev != -1 && value < prev) result -= value;
            else result += value;
                
            prev = value;
        }
        
        return result;
    }
}
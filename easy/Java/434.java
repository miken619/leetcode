/*Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5*/

class 434 {
    public int countSegments(String s) {
        String trimStr = s.trim();
        if(trimStr.length() == 0) return 0;
        return trimStr.split(" +").length;
        
        //return ("x " + s).split(" +").length - 1;
    }
}
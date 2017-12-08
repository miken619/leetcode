/*Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        
        for(int i = 1; i <= n; ++i) {
            int mult3 = i % 3;
            int mult5 = i % 5;
            
            if(mult3 == 0 && mult5 == 0) list.add("FizzBuzz");
            else if (mult3 == 0) list.add("Fizz");
            else if (mult5 == 0) list.add("Buzz");
            else list.add(i+"");
        }
        
        return list;
    }
}
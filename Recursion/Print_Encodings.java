/* 
Print Encodings
Easy

1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 10

Format
Input
A string str

Output
Permutations of str in order hinted by Sample output

Example

Sample Input
655196

Sample Output
feeaif
feesf

*/


// Print Encodings ->  (char) [(n-1) + 'a']          PEP CODING | March 25, 20224
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);  // taking input
        String str = scn.nextLine();       
        printEncodings(str, "");
    }
    public static void printEncodings (String str, String asf) {
        //Step-08
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        // Firstly we will try for extracting 1 character from string ie extracting '1' from "123"

        //Step-01  
        String ch0 = str.substring(0,1);  //'1' (extracting first character ie '1' from the string ("123"))

        //Step-02
        String ros = str.substring(1); //"23" (taking rest of the string)

        //Step-03
        if(ch0.equals("0")) return;
        printEncodings(ros, asf+(char)(Integer.parseInt(ch0)-1+'a')); // Encoding Logic (here "(char)" is written because we have to TypeCast it into character) 'ch0' contains string ie "1" so we have to convert it into integer, we do it by writing Integer.parseInt. a-a=0 so a=0+a, similarly d-a=3 ie d=3+a which can be written as d=(n-1)+a as d represents value 4.
        
        //Secondly we will try for extracting 2 characters from string ie extracting '12' from "123"
        //Step-04
        if(str.length() >= 2){
            //Step-05
            String ch01 = str.substring(0,2); //"12" //Extracting first 2 characters from string ie extracting '12' from "123"
            //Step-06
            String ros2 = str.substring(2);  //"3"
            //Step-07
            if(Integer.parseInt(ch01) <= 26){ //(here we have to convert string to Integer ie we have string in ch01 ie "12", so we are converting it into Integer by writing Integer.parseInt) checking if the 2 characters are less than 26 or not in cases like "993" as we have encodings only till 26
                printEncodings(ros2, asf+(char)(Integer.parseInt(ch01)-1+'a')); // Encoding Logic
            }
        }
    }
}
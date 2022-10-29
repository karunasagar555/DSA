/* 

Print Permutations   -- PEP CODING | March 25th, 2022
Easy

1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 7

Format
Input
A string str

Output
Permutations of str in order hinted by Sample output

Example
Sample Input

abc

Sample Output
abc
acb
bac
bca
cab
cba

*/

// Permutation - How many ways you have - qsn, ans approach - n! ways (n factorial ways) when input is unique, differs otherwise 
// Initially qsn - abc (sample input), ans - "" ( initially ans will be empty) 

import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        printPermutations(str, "");  // calling the function, initially we assume our answer to be empty ie -> ""

    }

    public static void printPermutations(String str, String asf) {   // asf- answer so far

        // Base case -> when the string becomes empty
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0; i < str.length(); i++){    // running a loop for 1st fill ( _ _ _ )
            char ch = str.charAt(i);   //a       // taking out the first fill, ie 'a' has been added in 1st position 
            String ros = str.substring(0,i) + str.substring(i+1);    //bc                 // ros - rest of the string
            printPermutations(ros, asf+ch);  // bc, a  (we call the fun again, by passing remaining string bc and asf+ch )
        }
    }
}


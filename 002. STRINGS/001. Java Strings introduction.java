/*
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  A is "hello" and B is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Ask the user for the input
        Scanner s = new Scanner(System.in);
        
        // Ask user to enter a string
        String myString1 = s.nextLine();
        
        // Ask user to enter another string
        String myString2 = s.nextLine();
        
        // Adding the length of the two strings
        System.out.println(myString1.length() + myString2.length()); 
        System.out.println( (myString1.compareTo(myString2) > 0) ? "Yes" : "No");
        /*if(myString1 == myString2)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }*/
        
        // create two substrings from name
        // first substring contains first letter of name
        // second substring contains remaining letters
        String firstLetter = myString1.substring(0, 1);
        String remainingLetters = myString1.substring(1, myString1.length());
        
        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        myString1 = firstLetter + remainingLetters;
        System.out.print(myString1 + " ");    
        
        // create two substrings from name
        // first substring contains first letter of name
        // second substring contains remaining letters
        String firstLetter1 = myString2.substring(0, 1);
        String remainingLetters1 = myString2.substring(1, myString2.length());
        
        // change the first letter to uppercase
        firstLetter1 = firstLetter1.toUpperCase();

        // join the two substrings
        myString2 = firstLetter1 + remainingLetters1;
        System.out.print(myString2);    
    }
}

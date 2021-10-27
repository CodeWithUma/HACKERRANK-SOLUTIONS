/*
Sum of the lengths of A and B.

length() returns count of total number of characters.

Example:
*/
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A="Hello World!";
    
    int length = A.length();
    
    System.out.println("Length of String A is "+length);
    
    }
}

/*
This prints:

Length of String A is 12

Determine if A is lexicographically larger than B.

The method compareTo() is used for comparing two strings lexicographically.

Here the comparison is between string literals. For e.g. A.compareTo(B) where A and B are String literals.

This method returns a negative integer, zero or positive integer if the string calling the method (which is string  here) is lexicographically smaller, equal or larger 
than the string given as the method argument.
*/

import java.io.*;
import java.util.*;

public class CompareToExample {
    
    public static void main(String args[]) {
        String A = "StringA";
        String B = "StringB";

        int result = A.compareTo( B );
        
        if(result>0)
            System.out.println("A is lexicographically larger than B");
        else if(result<0)
            System.out.println("A is lexicographically smaller than B");
        else
            System.out.println("A is lexicographically equal to B");
    }
}

/*
Output for the above code:

A is lexicographically smaller than B

Capitalize the first letter in  and  and print them on a single line, separated by a space.

The java string toUpperCase() method returns the string in uppercase letter. In other words, it converts all characters of the string into upper case letter.

Now we will use substring(int startIndex, int endIndex) method which returns new String object containing the substring of the given string from specified startIndex 
(inclusive) to endIndex (exclusive).

Take the first letter of the string A using substring(int startIndex, int endIndex) method and capitalize the first letter using toUpperCase() method.
A.substring(0, 1).toUpperCase()
Concatenate the above string with the rest of the string using substring(int startIndex)
A.substring(0, 1).toUpperCase() + A.substring(1)
The final code would look like:
*/
System.out.println(A.length()+B.length());
        
if(A.compareTo(B)>0)
    System.out.println("Yes");
else
    System.out.println("No");

System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) 
+" "+ B.substring(0, 1).toUpperCase() + B.substring(1));
Problem Setter's code:


import java.util.*;
    
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        System.out.println( A.length() + B.length() );
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}

/*
A better way using a seperate method for capitalization:

`java public static void main(String[] args) { Scanner sc=new Scanner(System.in); String A=sc.next(); String B=sc.next(); System.out.println(A.length()+B.length()); 
 System.out.println(A.compareTo(B)>0?"Yes":"No"); System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B)); }

public static String capitalizeFirstLetter(String original) {
if (original == null || original.length() == 0) {
    return original;
}
return original.substring(0, 1).toUpperCase() + original.substring(1);
} */

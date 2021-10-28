/*
Use Method substring() for getting a substring of a particular String. There are two variants of this method:

String substring(int beginIndex): - Returns the substring starting from the specified index(beginIndex) till the end of the string.

1. This method throws IndexOutOfBoundsException If the beginIndex is less than zero or greater than the length of String.

*/

public class SubStringExample{
    public static void main(String args[]) {
        String str= new String("HelloWorld");

        System.out.println(str.substring(2));
    }
}

/*
2 .This will print lloWorld, the string starting from index 2 till the end of the string.
String substring(int beginIndex, int endIndex): - Returns the substring starting from the given index(beginIndex) till the specified index(endIndex).

3. It throws IndexOutOfBoundsException If the beginIndex is less than zero OR beginIndex > endIndex OR endIndex is greater than the length of String.
*/

public class SubStringExample{
    public static void main(String args[]) {
        String str= new String("HelloWorld");

        System.out.println(str.substring(3, 7));
    }
}

/*
4. This will print loWo, the string starting from index 3 till endIndex-1 of the string.

Solution:
*/
System.out.println(S.substring(start,end));

/*
Just use the String substring(int beginIndex, int endIndex) method and print the substring from start to end.
*/

/*
CODE:- 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

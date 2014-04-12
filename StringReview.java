/*
 * File: StringReview.java
 * Created by: Edwin Ko
 * Purpose: As a review for manipulating strings using methods for CS111.
 *
 * 1. A static method called sumASCII that takes a String as its parameter and 
 * returns the sum of the ASCII of the entire string. For example, a call of 
 * sumASCII("good luck!") should return 921.
 * Note: Each character has a unique ASCII code; 'a' has the ASCII code of 97, 
 * 'b' has the ASCII code of 98. Refer to this table.
 *
 * 2. A static method called removeMiddle that takes a String, and returns the 
 * string with the middle replaced with spaces. For example, a call of 
 * removeMiddle("candy") should return "c   y".
 *
 * 3. A static method called removeXYZ that takes a String, removes x, y z (both 
 * lower and upper case) from it, and returns the new string with the letters 
 * removed. For example, a call of removeConsonants("ManxipuZlatizyng StYrZinygs 
 * iXs fxuyn!") should return "Manipulating Strings is fun!".
 */

public class StringReview {
  
  public static void main(String[] args) {
    
    // test cases
    System.out.println(sumASCII("good luck!")); 
    System.out.println(removeXYZ("ManxipuZlatizyng StYrZinygs iXs fxuyn!"));
    System.out.println(removeMiddle("candy"));
    
  }
  
  // returns the sum of the ASCII values of each char in the string
  public static int sumASCII(String str) {
    
    int sum = 0;                       // declare sum outside the loop
    
    for (int i = 0; i < str.length(); i++) {       
      sum += (int)(str.charAt(i));   // cumulatively sum up the ASCII values
    }        
    return sum;
  }
  
  // returns just the start and end char with spaces in between
  public static String removeMiddle(String str) {
    
    String str2 = "";         // new string to be returned, initialize as an empty string
    
    for (int i = 0; i < str.length(); i++) {     
      if (i == 0 || i == str.length()-1) {     // if the char is the first or last in the string    
        str2 += str.charAt(i);             // append to str2 because we want to keep them!
      } else {       
        str2 += " ";           // else, replace with spaces 
      }
    }
    return str2;
  }
  
  // returns a string without x, y and z
  // Disclaimer: There are many ways to do this!
  public static String removeXYZ(String str) {
    
    String str2 = "";       // new string to be returned, initialize as an empty string
    
    for (int i = 0; i < str.length(); i++ ){
      char first = str.charAt(i);    // looks at each char in the String 
      if (first != 'x' && first != 'y' && first != 'z'  // checks for lower cases of x, y and z
            && first != 'X' && first != 'Y' && first != 'Z') {      // checks for upper cases of X, Y and Z
        str2 += first;       // append to str2 
      } 
    }
    return str2;
  }
  
}






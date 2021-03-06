import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
      
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList <String> substrings = new ArrayList<>();
        
        for(int i = 0; i <= s.length()-k; i++ ){
            substrings.add(s.substring(i,i+k));
        }
        Collections.sort(substrings);
        
          String smallest =substrings.get(0);
          String largest = substrings.get(substrings.size()-1);
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

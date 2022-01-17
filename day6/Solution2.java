import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        input.nextLine();
        for(int i=0;i<N;i++){
            String string=input.nextLine();
            char[] charArray=string.toCharArray();
            for(int j=0;j<charArray.length;j++){
                if(j%2==0)
                    System.out.print(charArray[j]);
            }
            System.out.print(" ");
            for( int j=0;j<charArray.length;j++){
                if(j%2!=0)
                    System.out.print(charArray[j]);
            }
            System.out.println();
        }
    }

}

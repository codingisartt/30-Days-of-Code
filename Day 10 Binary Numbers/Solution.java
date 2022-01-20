import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        char[] binary=Integer.toBinaryString(n).toCharArray();
        int tmpCount=0;
        int maxCount=0;
        for(int i=0;i<binary.length;i++){
            tmpCount=(binary[i]=='0') ? 0:tmpCount+1;
            if(tmpCount>maxCount){
                maxCount=tmpCount;
            }
        }
        System.out.println(maxCount);
        bufferedReader.close();
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String S = in.next();
        System.out.println("Enter start point");
        int start = in.nextInt();
        System.out.println("Enter end point");
        int end = in.nextInt();
        String s1=S.substring(start, end);
        System.out.println(s1);
    }
    
}
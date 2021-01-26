package valera;

import valera.ArraysAndString.Test3;
import valera.ArraysAndString.Test4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Test3.test("Mr John Smith    "));
        System.out.println(Test3.test2("Mr John Smith    ", 13));
        String str1 ="pale";
        String str2 ="ple";
        System.out.println(Test4.test(str1,str2));
        System.out.println(Test4.test2(str1,str2));
        str1 ="pales";
        str2 ="pale";
        System.out.println(Test4.test(str1,str2));
        System.out.println(Test4.test2(str1,str2));
        str1 ="pales";
        str2 ="bale";
        System.out.println(Test4.test(str1,str2));
        System.out.println(Test4.test2(str1,str2));
        str1 ="pale";
        str2 ="bae";
        System.out.println(Test4.test(str1,str2));
        System.out.println(Test4.test2(str1,str2));
        str1 ="paes";
        str2 ="pales";
        System.out.println(Test4.test(str1,str2));
        System.out.println(Test4.test2(str1,str2));
    }

    }

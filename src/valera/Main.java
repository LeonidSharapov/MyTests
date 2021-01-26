package valera;

import valera.ArraysAndString.test1;

import java.io.*;
import java.util.Arrays;


public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test1.test(reader.readLine()));

    }


    static void test2() throws IOException {
        char[] chek1=reader.readLine().toCharArray();
        char[] chek2=reader.readLine().toCharArray();
        Arrays.sort(chek1);
        Arrays.sort(chek2);
        System.out.println(String.valueOf(chek1).equals(String.valueOf(chek2)));

    }

    static void test3() throws IOException {
        String a = reader.readLine();
        char b[] = a.toCharArray();
        String c ="";
        for (int i = 0; i < a.length(); i++) {
            if (String.valueOf(b[i]).equals(" ")) {
                c+="%20";
            }else{
                c+=String.valueOf(b[i]);
            }

        }
        System.out.println(c);
    }
    static  void  test4() throws  IOException {
        String a = reader.readLine();
        String b = reader.readLine();
        String[] chek2;
        String[] chek1;
        int value=0;
        if (a.length() - 1 == b.length() || b.length() - 1 == a.length() || b.length()==a.length()) {
           chek1 =a.split("");
           chek2 =b.split("");

            for (int i = 0; i < chek1.length; i++) {
                for (int j = 0; j < chek2.length; j++) {
                    if (chek2[j].equals(chek1[i])) {
                        chek1[i] = "";
                        chek2[j] = "";
                        value++;
                        System.out.println(value);
                        break;
                    }
                }
                }
            if(a.length()-value <2 && b.length()-value<2){
                System.out.println(a + "  " + b +"=true");
            }else{
                System.out.println(a + "  " + b +"= false ");
            }
            }else{
            System.out.println(a + "  " + b +"= false ");
        }
        }
    }

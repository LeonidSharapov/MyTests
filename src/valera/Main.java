package valera;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //int select  = Integer.parseInt(reader.readLine());
        test4();
    }

    static void test1() throws IOException {
        String a = reader.readLine();
        String[] b = a.split("");

        boolean chek = false;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (j == i) {
                    if (j + 1 == b.length) {
                        break;
                    } else {
                        j++;
                    }
                }
                if (!b[j].equals(b[i])) {
                    chek = true;
                }
            }
        }
        System.out.println("all characters are unique = " + chek);
    }

    static void test2() throws IOException {
        String a = reader.readLine();
        String b = reader.readLine();
        String chek1[] = a.split("");
        String chek2[] = b.split("");
        int value = 0;

        for (int i = 0; i < chek1.length; i++) {
            for (int j = 0; j < chek2.length; j++) {
                if (chek2[j].equals(chek1[i])) {
                    chek1[i] = "";
                    chek2[j] = "";
                    value++;
                    break;
                }
            }
        }
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(value);
        if (value == a.length() && value == b.length()) {
            System.out.println("permutation = true");
        } else {
            System.out.println("permutation = false");
        }

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
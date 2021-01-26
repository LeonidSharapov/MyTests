package valera.ArraysAndString;

import java.io.IOException;
import java.util.Arrays;

public class Test2 {
  public   static boolean test(String a, String b) {

        char[] chek1=a.toCharArray();
        char[] chek2=b.toCharArray();
        Arrays.sort(chek1);
        Arrays.sort(chek2);
        return String.valueOf(chek1).equals(String.valueOf(chek2));

    }

        static void Test2 () {
        }
    }

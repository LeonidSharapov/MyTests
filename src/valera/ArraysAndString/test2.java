package valera.ArraysAndString;

import java.util.Arrays;


public class test2 {
    public static boolean test(String str1, String str2) {
        char[] chek1=str1.toCharArray();
        char[] chek2=str2.toCharArray();
        Arrays.sort(chek1);
        Arrays.sort(chek2);

        return String.valueOf(chek1).equals(String.valueOf(chek2));
    }
}

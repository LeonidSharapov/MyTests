package valera.ArraysAndString;


import java.util.HashSet;
//проверка уникальности символа в слове
public class test1 {
    public static boolean test(String str) {
        char[] b =str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (Character c : b) {
            set.add(c);
        }
        boolean chek = set.size()==b.length;
        System.out.println("From method: all characters are unique = " + chek);
        return chek;
    }
}

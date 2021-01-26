package valera.ArraysAndString;

public class Test4 {
    public static boolean test(String a, String b) {
        String[] chek2;
        String[] chek1;
        int value = 0;
        if (a.length() - 1 == b.length() || b.length() - 1 == a.length() || b.length() == a.length()) {
            chek1 = a.split("");
            chek2 = b.split("");

            for (int i = 0; i < chek1.length; i++) {
                for (int j = 0; j < chek2.length; j++) { //вложенный цикл увеличивает время работы в chek2.length раз
                    if (chek2[j].equals(chek1[i])) {
                        chek1[i] = "";
                        chek2[j] = "";
                        value++;
                        System.out.println(value);
                        break;
                    }
                }
            }
            if (a.length() - value < 2 && b.length() - value < 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean test2(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;

        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;
                if (s1.length() == s2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}

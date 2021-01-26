package valera.ArraysAndString;

public class Test4 {
    static boolean test(String a, String b) {
        String[] chek2;
        String[] chek1;
        int value = 0;
        if (a.length() - 1 == b.length() || b.length() - 1 == a.length() || b.length() == a.length()) {
            chek1 = a.split("");
            chek2 = b.split("");

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
            if (a.length() - value < 2 && b.length() - value < 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

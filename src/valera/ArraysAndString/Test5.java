package valera.ArraysAndString;
/*Метод принимает строку и сжимает её используя счётчики повторяющихся символов.
Если сжатая строка длинее обычной то возращает обыную строку*/
public class Test5 {
   public static String test(String a){
        String[] b = a.split("");
        String t=b[0];
        int count=1;
        for(int i =1; i<b.length;i++){
            if(b[i].equals(b[i-1])){
                count++;
            }
            else{
                t+=count+b[i];
                count=1;
            }
        }
        t+=count;
        return a.length()<=t.length() ? a:t;
    }
}

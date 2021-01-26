package valera.ArraysAndString;

public class Test3 {
  public static String test(String a){
      char [] b=a.replace(" ","%20").toCharArray();
      return new String(b);
  }

  public static String test2(String a, int strLen) {
      char[] str = a.toCharArray();
      int spaceCount = 0, index, i = 0;
      for (i = 0; i < strLen; i++) {
          if (str[i] == ' ') {
              spaceCount++;
          }
      }
      index = strLen + spaceCount * 2;
      if (strLen < str.length) str[strLen] = '\0';
      for (i = strLen-1; i >= 0; i--){
          if (str[i] == ' ') {
              str[index - 1] = '0';
              str[index - 2] = '2';
              str[index - 3] = '%';
              index = index - 3;
          } else {
              str[index - 1] = str[i];
              index--;
          }
      }
      return new String(str);
    }
}

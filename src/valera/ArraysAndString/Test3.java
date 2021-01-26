package valera.ArraysAndString;

public class Test3 {
  public static String test(String a){
      char [] b=a.replace(" ","%20").toCharArray();
      return new String(b);
  }
}

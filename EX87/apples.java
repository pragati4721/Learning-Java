import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    String a = "apples";
    String b = "bowl";
    String c = "BOWL";
    System.out.println(a.length());
    if(a.equals("apples")){
      System.out.println("it equals apples!");
    }
    if(b.equalsIgnoreCase(c)){
      System.out.println("buckys match");
    }
  }
}

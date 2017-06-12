import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    tuna tunaObj = new tuna (10);
    for (int i=0;i<5 ;i++ ) {
      tunaObj.add();
      System.out.printf("%s",tunaObj);
    }
  }
}

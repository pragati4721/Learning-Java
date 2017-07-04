import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    tuna tObj = new tuna();
    tuna tObj2 = new tuna(5);
    tuna tObj3 = new tuna(5,13);
    tuna tObj4 = new tuna(5,13,43);
    System.out.printf("%s\n",tObj.toMilitary());
    System.out.printf("%s\n",tObj2.toMilitary());
    System.out.printf("%s\n",tObj3.toMilitary());
    System.out.printf("%s\n",tObj4.toMilitary());
  }
}

import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;
class apples{
  public static void main(String[] args) {
    for(tuna people:tuna.values())
      System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
    System.out.println("\nAnd now for the range of constants!!!\n");
    for (tuna people: EnumSet.range(tuna.sad,tuna.tan))
      System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
  }
}

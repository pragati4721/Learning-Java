import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    int prag[]={21,16,86,21,3};
    int sum = 0;
    for (int i =0;i<prag.length ;i++ ) {
      sum+=prag[i];
    }
    System.out.println("The sum of tese numbers is: "+sum);
  }
}

import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    System.out.println(average(43,56,76,8,65,76,2,31));
  }
  public static int average(int...num){
    int total =0;
    for (int x :num ) {
      total+=x;
    }
    return total/num.length;
  }
}
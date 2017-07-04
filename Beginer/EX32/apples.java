import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    int prag[]={3,4,5,6,7};
    change(prag);
    for (int j :prag ) {
      System.out.println(j);
    }

  }
  public static void change(int x[]) {
    for (int i= 0;i<x.length ;i++ ) {
      x[i]+=5;
    }
  }

}

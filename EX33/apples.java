import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    int prag[][]={{8,9,10,11},{12,13,14,15}};
    int pra[][] ={{30,31,32,33},{43},{4,5,6}};
    System.out.println("This is the first array");
    display(prag);
    System.out.println("This is the second array");
    display(pra);
  }
  public static void display(int x[][]){
    for (int i = 0;i<x.length ;i++ ) {
      for (int j =0;j<x[i].length ;j++ ) {
        System.out.print(x[i][j]+"\t");
      }
      System.out.println();
    }
  }
}

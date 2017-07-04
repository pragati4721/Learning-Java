import java.util.Scanner;
import java.util.Random;
import java.io.File;
class apples{
  public static void main(String[] args) {
    File x = new File("tuna.java");
    if(x.exists()){
      System.out.println(x.getName() + " exist!");
    }
    else {
      System.out.println("that doesn't exist");
    }
  }
}

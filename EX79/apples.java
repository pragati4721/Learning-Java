import java.util.*;
import java.util.Random;
import java.io.File;

class apples{
  public static void main(String[] args) {
    final Formatter x;
    try {
      x = new Formatter("fred.txt");
      System.out.println("You created a file");
    }
    catch(Exception e){
      System.out.println("you got an error");
    }
  }
}

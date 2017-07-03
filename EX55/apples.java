import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    food prag[] = new food[2];
    prag[0] = new potpie();
    prag[1] = new tuna();
    for (int i = 0;i<2;i++){
      prag[i].eat();
    }
  }
}

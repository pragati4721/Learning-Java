import java.util.Random;
class apples{
  public static void main(String[] args) {
    Random dice =new Random();
    int num;
    for (int coun = 1;coun<=10 ;coun++ ) {
      num = 1+dice.nextInt(6);
      System.out.println(num + " ");
    }
  }
}

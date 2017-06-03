import java.util.Scanner;
class apples{
  public static void main(String[] args) {
    Scanner prag = new Scanner(System.in);
    double fn , sn, ans;
    System.out.println("Enter first num: ");
    fn = prag.nextDouble();
    System.out.println("Enter second num: ");
    sn = prag.nextDouble();
    ans = fn +sn;
    System.out.println(ans);
  }
}

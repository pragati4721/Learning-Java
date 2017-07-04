import java.util.*;
public class sample{
    public static void main(String[] args) {
      Scanner i = new Scanner(System.in);
      int x = 1;
      do{
        try{
          System.out.println("Enter First Num: ");
          int n1 = i.nextInt();
          System.out.println("Enter Second Num: ");
          int n2 = i.nextInt();
          int sum = n1/n2;
          System.out.println(sum);
          x = 2;
        }
        catch(Exception e){
          System.out.println("You can't do that!");
        }
      }while(x==1);
    }
}

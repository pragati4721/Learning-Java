import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
class apples{
  public static void main(String[] args) {
    String fn = JOptionPane.showInputDialog("Enter first number");
    String sn = JOptionPane.showInputDialog("Enter second number");
    int n1 = Integer.parseInt(fn);
    int n2 = Integer.parseInt(sn);
    int sum = n1+n2;
    JOptionPane.showMessageDialog(null,"The answer is "+sum,"the title",JOptionPane.PLAIN_MESSAGE);
  }
}

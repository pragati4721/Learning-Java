import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
class apples{
  public static void main(String[] args) {
    JFrame f = new JFrame("Pragati");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Peach p = new Peach();
    f.add(p);
    f.setSize(500,270);
    f.setVisible(true);
  }
}

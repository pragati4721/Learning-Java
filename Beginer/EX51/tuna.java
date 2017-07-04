import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class tuna extends JFrame{
  private JLabel i1;
  public tuna(){
    super("The title Bar");
    setLayout(new FlowLayout());
    i1 = new JLabel("this is a sentence");
    i1.setToolTipText("This is gonna show on hover");
    add(i1);
  }
}

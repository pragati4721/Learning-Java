import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class tuna extends JFrame{
  private JTextField i1;
  private JTextField i2;
  private JTextField i3;
  private JPasswordField pass;
  public tuna(){
    super("Pragati Kumar Singh");
    setLayout(new FlowLayout());
    i1 = new JTextField(10);
    add (i1);
    i2 = new JTextField("Enter Text Here");
    add(i2);
    i3 = new JTextField("uneditable",20);
    i3.setEditable(false);
    add(i3);
  }
}

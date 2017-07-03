import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame{
  private JComboBox b;
  private JLabel p;
  private static String[] fn = {"f.png","pra.png"};
  private Icon[] pics = {new ImageIcon(getClass().getResource(fn[0])),new ImageIcon(getClass().getResource(fn[1]))};
  public Gui(){
    super("Pragati Kumar Singh");
    setLayout(new FlowLayout());
    b = new JComboBox(fn);
    b.addItemListener(
      new ItemListener(){
        public void itemStateChanged(ItemEvent event ){
          if (event.getStateChange()==ItemEvent.SELECTED){
            p.setIcon(pics[b.getSelectedIndex()]);
          }
        }
      }
    );
    add (b);
    p = new JLabel(pics[0]);
    add(p);
  }
}

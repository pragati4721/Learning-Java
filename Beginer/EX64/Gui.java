import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame{
  private JTextField tf;
  private JCheckBox bb;
  private JCheckBox itb;
  public  Gui(){
    super("Pragati");
    setLayout(new FlowLayout());
    tf = new JTextField("This is a sentence",14);
    tf.setFont(new Font("serif",Font.PLAIN,14));
    add(tf);
    bb = new JCheckBox("bold");
    itb = new JCheckBox("italic");
    HandlerClass handler = new HandlerClass();
    bb.addItemListener(handler);
    itb.addItemListener(handler);
    add(bb);
    add(itb);

  }
  private class HandlerClass implements ItemListener{
    public void itemStateChanged(ItemEvent event){
      Font font = null;
      if (bb.isSelected() && itb.isSelected()){
        font = new Font("Serif",Font.BOLD+Font.ITALIC,14);
      }
      else if (bb.isSelected()){
        font = new Font("Serif",Font.BOLD,14);
      }
      else if (itb.isSelected()){
        font = new Font("Serif",Font.ITALIC,14);
      }
      else {
        font = new Font("Serif",Font.PLAIN,14);
      }
      tf.setFont(font);
    }
  }
}

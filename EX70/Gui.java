import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Gui extends JFrame{
    private JList list;
    private static String[] cn = {"black","blue","red","white"};
    private static Color[] clr = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};
    public Gui(){
      super("Pragati");
      setLayout(new FlowLayout());
      list = new JList(cn);
      list.setVisibleRowCount(4);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      add (new JScrollPane(list));
      list.addListSelectionListener(
        new ListSelectionListener(){
          public void valueChanged(ListSelectionEvent event){
            getContentPane().setBackground(clr[list.getSelectedIndex()]);
          }
        }
      );
    }
}

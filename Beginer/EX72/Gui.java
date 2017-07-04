import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Gui extends JFrame{
  private JList ll;
  private JList rl;
  private JButton mb;
  private static String[] f = {"bacon","wings","ham","beef","cheese"};
  public Gui(){
    super("pragathkjd");
    setLayout(new FlowLayout());
    ll = new JList(f);
    ll.setVisibleRowCount(3);
    ll.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(ll));
    mb = new JButton("Move-->");
    mb.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          rl.setListData(ll.getSelectedValues());
        }
      }
    );
    add(mb);
    rl = new JList();
    rl.setVisibleRowCount(3);
    rl.setFixedCellWidth(100);
    rl.setFixedCellHeight(15);
    rl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(rl));
  }
}

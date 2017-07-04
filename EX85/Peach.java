import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Peach extends JFrame{
    private JButton b;
    private Color c = (Color.WHITE);
    private JPanel p;
    public Peach(){
      super("Pragati");
      p = new JPanel();
      p.setBackground(c);
      b = new JButton("Choose a color");
      b.addActionListener(
        new ActionListener(){
          public void actionPerformed(ActionEvent event){
            c = JColorChooser.showDialog(null,"Pick a color",c);
            if(c == null){
              c = (Color.WHITE);
            }
            p.setBackground(c);
          }
        }
      );
      add(p,BorderLayout.CENTER);
      add(b,BorderLayout.SOUTH);
      setSize(425,150);
      setVisible(true);
    }
}

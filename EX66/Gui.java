import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
  private JTextField tf;
  private Font pf;
  private Font bf;
  private Font itf;
  private Font bif;
  private JRadioButton pb;
  private JRadioButton bb;
  private JRadioButton ib;
  private JRadioButton bib;
  private ButtonGroup gp;
  public Gui(){
    super("Pragati");
    setLayout(new FlowLayout());
    tf = new JTextField("Pragati is Handsome",25);
    add(tf);
    pb = new JRadioButton("Plain",true);
    bb = new JRadioButton("Bold",false);
    ib = new JRadioButton("Italic",false);
    bib = new JRadioButton("Bold Italic",false);
    add(pb);
    add(bb);
    add(ib);
    add(bib);
    gp = new ButtonGroup();
    gp.add(pb);
    gp.add(bb);
    gp.add(ib);
    gp.add(bib);
    pf = new Font ("Serif",Font.PLAIN,14);
    bf = new Font ("Serif",Font.BOLD,14);
    itf = new Font ("Serif",Font.ITALIC,14);
    bif = new Font ("Serif",Font.BOLD+Font.ITALIC,14);
    tf.setFont(pf);
    pb.addItemListener(new HC(pf));
    bb.addItemListener(new HC(bf));
    ib.addItemListener(new HC(itf));
    bib.addItemListener(new HC(bif));
  }
  private class HC implements ItemListener{
    private Font font;
    public HC(Font f){
      font = f;
    }
    public void itemStateChanged(ItemEvent event){
      tf.setFont(font);
    }
  }
}

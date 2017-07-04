import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame{
    private String d;
    private JLabel sb;
    public Gui(){
      super("hkfjhkjr");
      sb = new JLabel("this is default");
      add(sb,BorderLayout.SOUTH);
      addMouseListener(new MC());
    }
    private class MC extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
        d = String.format("You clicked %d ",event.getClickCount());
        if(event.isMetaDown()){
          d += "with right mouse button";
        }
        else if(event.isAltDown()){
          d+="with center mouse button";
        }
        else{
          d+="with left mouse button";
        }
        sb.setText(d);
      }
    }
}

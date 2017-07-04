import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame{
  private JPanel mp;
  private JLabel sb;
  public Gui(){
    super("Pragati");
    mp = new JPanel();
    mp.setBackground(Color.WHITE);
    add(mp,BorderLayout.CENTER);
    sb = new JLabel("Default");
    add(sb,BorderLayout.SOUTH);
    HC hlr = new HC();
    mp.addMouseListener(hlr);
    mp.addMouseMotionListener(hlr);
  }
  private class HC implements MouseListener,MouseMotionListener{
    public void mouseClicked(MouseEvent event){
      sb.setText(String.format("Clicked at %d,%d",event.getX(),event.getY()));
    }
    public void mousePressed(MouseEvent event){
      sb.setText("You Pressed the mouse");
    }
    public void mouseReleased(MouseEvent event){
      sb.setText("You released the mouse");
    }
    public void mouseEntered(MouseEvent event){
      sb.setText("You entered the area");
      mp.setBackground(Color.RED);
    }
    public void mouseExited(MouseEvent event){
      sb.setText("the mouse had left the window");
      mp.setBackground(Color.WHITE);
    }
    public void mouseDragged(MouseEvent event){
      sb.setText("You are dragging the mouse");
    }
    public void mouseMoved(MouseEvent event){
      sb.setText("You moved the mouse");
    }
  }
}

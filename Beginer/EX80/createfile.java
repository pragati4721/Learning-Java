import java.io.*;
import java.lang.*;
import java.util.*;
public class createfile{
    private Formatter x;
    public void oF(){
      try{
        x = new Formatter("chinese.txt");
      }
      catch(Exception e){
        System.out.println("You have an eroor!");
      }
    }
    public void aR(){
      x.format("%s%s%s","21 ","Pragati ","Singh");
    }
    public void cF(){
      x.close();
    }
}

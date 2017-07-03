import java.util.Scanner;
import java.util.Random;
class apples{
  public static void main(String[] args) {
    Animal[] tl = new Animal[2];
    Dog d = new Dog();
    Fish f = new Fish();
    tl[0]=d;
    tl[1]=f;
    for (Animal x: tl){
      x.noise();
    }
  }
}

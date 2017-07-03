public class AnimalList{
  private Animal[] tl = new Animal[5];
  private  int i = 0;
  public  void add(Animal a){
    if(i<tl.length){
      tl[i] = a;
      System.out.println("Animal added at index "+i);
      i++;
    }
  }
}

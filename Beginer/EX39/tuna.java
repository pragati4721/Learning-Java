public class tuna{
      private int hour;
      private int min;
      private int sec;
      public tuna(){
        this(0,0,0);
      }
      public tuna(int h){
        this(h,0,0);
      }
      public tuna(int h,int m){
        this(h,m,0);
      }
      public tuna(int h,int m,int s){
        setTime(h,m,s);
      }
      public void setTime(int h,int m,int s){
        setH(h);
        setM(m);
        setS(s);
      }
      public void setH(int h){
        hour = ((h>=0&&h<24)?h:0);
      }
      public void setM(int m){
        min = ((m>=0&&m<60)?m:0);
      }
      public void setS(int s){
        sec = ((s>=0&&s<60)?s:0);
      }
      public int getH(){
        return hour;
      }
      public int getM(){
        return min;
      }
      public int getS(){
        return sec;
      }
      public String toMilitary(){
        return String.format("%02d:%02d:%02d",getH(),getM(),getS());
      }
}

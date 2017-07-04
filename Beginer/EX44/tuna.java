public enum tuna{
  prag("nice","22"),
  sad("good","9"),
  dis("awesome","17"),
  tan("italian","14"),
  can("gshja","13"),
  pere("fcnkl","1");

  private final String desc;
  private final String year;
  tuna (String des,String bday){
    desc = des;
    year = bday;
  }
  public String getDesc(){
    return desc;
  }
  public String getYear(){
    return year;
  }
}

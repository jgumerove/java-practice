class BiNumber {
  private int number1;
  private int number2;

  BiNumber(int first, int second){
      this.number1 = first;
      this.number2 = second;
  };

  int add(){
    return number1 + number2;
  };

  void doubleIt(){
    System.out.printf("%d and %d", this.number1 * 2, this.number2 * 2).println();
  };

  int getNumber1(){
    return number1;
  };

  int getNumber2(){
    return number2;
  };

  void doubleValue(){
    number1 *=2;
    number2 *=2;
  };

  public static void main(String[] args){
      BiNumber josh = new BiNumber(3, 4);
      System.out.println(josh.add());
      System.out.println(josh.getNumber1());
      josh.doubleIt();
      josh.doubleValue();
      System.out.println(josh.getNumber1());
      System.out.println(josh.getNumber2());
  }
}
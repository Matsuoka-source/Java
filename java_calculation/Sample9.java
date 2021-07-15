class Sample9 {
  public static void main(String[] args) {
    double dnum = 160.5;

    System.out.println("身長は" + dnum + "です。");

    System.out.println("int型に代入します。");
    int inum = (int) dnum;

    System.out.println("身長は" + inum + "です。");
  }
}
// 大きい型から小さい方に変換する際には(int)を代入する側に記述する必要がある
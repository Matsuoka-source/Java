class Sample4 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    System.out.println("num1+num2は" + (num1 + num2) + "です。");
    System.out.println("num1-num2は" + (num1 - num2) + "です。");
    System.out.println("num1*num2は" + (num1 * num2) + "です。");
    System.out.println("num1/num2は" + (num1 / num2) + "です。");
    System.out.println("num1%num2は" + (num1 % num2) + "です。");

    num1++;
    // 上記の記述で+1される
    System.out.println("num1は" + num1 + "です。");
    num1--;
    // 上記の記述で-1される
    System.out.println("num1は" + num1 + "です。");
  }
}
// 色々な演算子を使う
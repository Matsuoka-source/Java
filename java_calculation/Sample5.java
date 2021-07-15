class Sample5 {
  public static void main(String[] args) {
    int a = 0;
    int b = 0;

    b = a++;
    System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
    System.out.println("代入後にインクリメントしたのでaの値は" + a + "です。");

    int c = 0;
    int d = 0;

    c = ++d;
    System.out.println("代入前にインクリメントしたのでcの値は" + c + "です。");
    System.out.println("代入前にインクリメントしたのでdの値は" + d + "です。");

  }
}
// 前置インクリメントと後置インクリメントについて
class practice1 {
  public static void main(String[] args) {
    // 自分で考えた
    System.out.println("0-4は" + (0 - 4) + "です。");
    System.out.println("3.14*2は" + (double) 3.14 * (double) 2 + "です。");
    System.out.println("5/3は" + (double) 5 / 3 + "です。");
    System.out.println("30/7の余りの数は" + (30 % 7) + "です。");
    System.out.println("(7+32)/5は" + (double) (7 + 32) / 5 + "です。");

    // 模範解答
    int ans1 = 0 - 4;
    double ans2 = 3.14 * 2;
    double ans3 = (double) 5 / 3;
    int ans4 = 30 % 7;
    double ans5 = (7 + 32) / (double) 5;

    System.out.println("0-4は" + ans1 + "です。");
    System.out.println("3.14*2は" + ans2 + "です。");
    System.out.println("5/3は" + ans3 + "です。");
    System.out.println("30/7の余りの数は" + ans4 + "です。");
    System.out.println("(7+32)/5は" + ans5 + "です。");

    // ターミナルの結果
    // 自分の考えた結果
    // 0-4は-4です。
    // 3.14*2は6.28です。
    // 5/3は1.6666666666666667です。
    // 30/7の余りの数は2です。
    // (7+32)/5は7.8です。

    // 模範解答の結果
    // 0-4は-4です。
    // 3.14*2は6.28です。
    // 5/3は1.6666666666666667です。
    // 30/7の余りの数は2です。
    // (7+32)/5は7.8です。
  }
}

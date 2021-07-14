class Sample3 {
  public static void main(String[] args) {
    int num1, num2;

    num1 = 3;

    System.out.println("変数num1の値は" + num1 + "です。");

    num2 = num1;

    System.out.println("変数num1の値をnum2に代入しました。");
    System.out.println("変数num1の値は" + num1 + "です。");
    System.out.println("変数num2の値は" + num2 + "です。");

    num2 = 5;

    System.out.println("変数num2の値を変更しました。");
    System.out.println("変数num2の値は" + num2 + "です。");

    num1 = 10;

    System.out.println("変数num1の値を変更しました。");
    System.out.println("変数num1の値は" + num1 + "です。");
    System.out.println("変数num2の値は" + num2 + "です。");
    // 再度num1に代入してもnum2に変化なし もう一度num2にnum1の値を入れる際には宣言が必要
  }
}
// 他の変数の値を代入する
// 変数の値を他の変数に代入することは可能！(int型の変数に小数点のついたものは代入できません。)
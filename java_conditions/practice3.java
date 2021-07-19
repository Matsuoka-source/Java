import java.io.*;

class practice3 {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を2つ入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    if (num1 == num2) {
      System.out.println("2つの数は同じ値です。");
    } else if (num1 < num2) {
      System.out.println(num1 + "より" + num2 + "の方が大きいです。");
    } else if (num2 < num1) {
      System.out.println(num2 + "より" + num1 + "の方が大きいです。");
    } else {
      System.out.println("正しい整数を2つ入力してください。");
    }
  }
}

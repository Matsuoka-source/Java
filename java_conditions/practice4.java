import java.io.*;

class practice4 {
  public static void main(String[] args) throws IOException {
    System.out.println("0～10までの整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    if (num >= 0 && num <= 10) {
      System.out.println("正解です。");
    } else {
      System.out.println("間違いです。");
    }
  }
}

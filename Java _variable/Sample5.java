import java.io.*;

class Sample5 {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);
    // 文字列を変換してint型の変数に読み込みます。

    // double num = Double.parseDouble(str);
    // 文字列を変換してdouble型の整数に読み込みます。

    System.out.println(num + "が入力されました。");

  }

}

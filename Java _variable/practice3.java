import java.io.*;

class practice3 {
  public static void main(String[] args) throws IOException {
    System.out.println("円周率の値はいくつですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    double num = Double.parseDouble(str);

    System.out.println("円周率の値は" + num + "です。");
  }

}
// 問題は小数点が表示されるようにするという問題
// 回答の方ではnumではなくpiを使用していました。
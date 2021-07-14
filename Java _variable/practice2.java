import java.io.*;

class practice2 {
  public static void main(String[] args) throws IOException {
    System.out.println("あなたは何歳ですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    System.out.println("あなたは" + num + "歳です。");
  }
}
// 問題文はあなたは何歳ですか？というものに対して自分で入力することで「あなたは～歳です。」という表示をする。
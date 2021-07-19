import java.io.*;

class practice5 {
  public static void main(String[] args) throws IOException {
    System.out.println("成績を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    if (num == 1) {
      System.out.println("もっとがんばりましょう。");
    } else if (num == 2) {
      System.out.println("もう少しがんばりましょう。");
    } else if (num == 3) {
      System.out.println("さらに上をめざしましょう。");
    } else if (num == 4) {
      System.out.println("たいへんよくできました。");
    } else if (num == 5) {
      System.out.println("たいへん優秀です。");
    } else {
      System.out.println("1～5で入力してください。");
    }

  }
}
// 回答ではswitch構文を使用
// switch(num){
// case 1:System.out.println("もっとがんばりましょう。");break;

// case 2:System.out.println("もう少しがんばりましょう。");break;

// case 3:System.out.println("さらに上をめざしましょう。");break;

// case 4:System.out.println("たいへんよくできました。");break;

// case 5:System.out.println("たいへん優秀です。");break;

// }
import java.io.*;

class practice1 {
  public static void main(String[] args) throws IOException {
    double num = 3.14;

    System.out.println("変数doubleの値は" + num + "です。");
  }
}

// 元の文章は中身が
// char ch;
// ch = 3.14;
// だったのですが、char型では小数点を表示することはできないので
// 小数点を表示することができるdouble型を使用
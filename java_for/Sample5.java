class Sample5 {
  public static void main(String[] args) {
    int i = 1;

    while (i <= 5) {
      System.out.println(i + "番目の繰り返しです。");
      i++;
      // i++を忘れると無限ループになるので注意が必要
    }

    System.out.println("繰り返しが終了しました。");
  }
}

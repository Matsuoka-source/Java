class practice1 {
  public static void main(String[] args) {
    System.out.println("1～10までの偶数を表示します。");

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
// i=0にしてしまうと0も表示されてしまうので注意が必要
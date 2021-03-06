import java.io.*;

class practice1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println(test.length + "人の点数を入力してください。");

    for (int i = 0; i < test.length; i++) {
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    for (int s = 0; s < test.length; s++) {
      for (int t = s + 1; t < test.length; t++) {
        if (test[t] > test[s]) {
          int tmp = test[t];
          test[t] = test[s];
          test[s] = tmp;
        }
      }
    }
    for (int j = 0; j < test.length; j++) {
      System.out.println((j + 1) + "番目の人の点数は" + test[j] + "です。");
    }
    System.out.println("最高点は" + test[0] + "点です。");
  }

}

// 模範解答
// import java.io.*;

// class practice1 {
// public static void main(String[] args) throws IOException {
// System.out.println("5人のテストの点数を入力してください。");

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// int[] test = new int[5];

// for (int i = 0; i < test.length; i++) {
// String str = br.readLine();
// int tmp = Integer.parseInt(str);
// test[i] = tmp;
// }

// int max = 0;

// for (int i = 0; i < test.length; i++) {
// if (max < test[i]) {
// max = test[i];
// }
// }

// for (int i = 0; i < test.length; i++) {
// System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
// }
// System.out.println("最高得点は" + max + "点です。");
// }
// }
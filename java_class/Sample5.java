class Car {
  int num;
  double gas;

  void setNumGas(int n, double g) {
    num = n;
    gas = g;
    System.out.println("車のナンバーを" + num + "にガソリンを" + gas + "にしました。");
  }

  void show() {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

class Sample5 {
  public static void main(String[] args) {
    Car car1 = new Car();

    int number = 1234;
    double gasoline = 20.5;

    car1.setNumGas(number, gasoline);
  }
}

class Car {
  int num;
  double gas;
}

class Sample1 {
  public static void main(String[] args) {
    Car car1;
    car1 = new Car();
    car1.num = 1234;
    car1.gas = 20.5;

    Car car2;
    car2 = new Car();
    car2.num = 2345;
    car2.gas = 30.5;

    System.out.println("車のナンバーは" + car1.num + "です。");
    System.out.println("ガソリン量は" + car1.gas + "です。");

    System.out.println("車のナンバーは" + car2.num + "です。");
    System.out.println("ガソリン量は" + car2.gas + "です。");
  }
}

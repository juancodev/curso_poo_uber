class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  public Car(String license, Account driver) {
    this.license = license; // con This le indicamos que va a obtener todos los atributtos
    this.driver = driver;
  }

  void printDataCar() {
    System.out.println("license: " + license + " Driver: " + driver.name);
  }
}
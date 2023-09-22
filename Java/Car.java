class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passenger; // encapsulamiento

  public Car(String license, Account driver) {
    this.license = license; // con This le indicamos que va a obtener todos los atributtos
    this.driver = driver;
  }

  passenger = 4;
  System.out.println("passenger: " + passenger);

  void printDataCar() {
    if (passenger != null) {
      System.out.println("license: " + license + " Driver: " + driver.name);
    }
  }

  // métodos que me permiten alteral el atributo privado
  public Integer getPassenger() {
    return passenger;
  }

  public void setPassenger(Integer passenger) {
    if (passenger == 4) {
      this.passenger = passenger;
    } else {
      System.out.println("Necesitas asignar 4 pasajeros");
    }
  }
}
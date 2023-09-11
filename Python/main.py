from car import Car

if __name__ == "__main__":
    print("Hello World")

    car1 = Car()
    car1.license = "DEF456"
    car1.driver = "Carlos Sanchez"
    car1.passenger = 2
    print(vars(car1))

    car2 = Car()
    car2.license = "TVW654"
    car2.driver = "Carolina Queen"
    car2.passenger = 3
    print(
        f"license: {car2.license} driver: {car2.driver} and she has {car2.passenger} passenger"
    )

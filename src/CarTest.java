public class CarTest {
    public static void main(String[] args) {
        Car car=CarFactory.createCar();
        Car car2=CarFactory.createCar();

        car.showInfo();
        car2.showInfo();
        System.out.println("Liczba wyprodukowanych samochodów: " + Car.getCarsNumber());

    }
}

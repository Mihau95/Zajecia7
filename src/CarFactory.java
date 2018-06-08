import java.util.Scanner;

public class CarFactory {
    static Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe wozu: ");
        String name = scanner.nextLine();
        System.out.println("Ile pali paliwa na 100 km?");
        double fuelConsumption = scanner.nextLine();
        System.out.println("Jakie ograniczenie predkosci?");
        double speedLimit = scanner.nextLine();

        return new Car(name, fuelConsumption, speedLimit);

    }
}

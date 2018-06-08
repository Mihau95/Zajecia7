public class Car {

    private String name;
    private double fuelConsumption;
    private int speedLimit;
    private static int carsNumber;

    Car(String name, double fuelConsumption, int speedLimit){
        this.name=name;
        this.fuelConsumption=fuelConsumption;
        this.speedLimit=speedLimit;
        carsNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public static int getCarsNumber() {
        return carsNumber;
    }

    public void showInfo(){
        System.out.println(name + " " + fuelConsumption + " " + speedLimit );
    }
}

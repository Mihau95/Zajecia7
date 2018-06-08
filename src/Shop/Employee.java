package Shop;

public class Employee extends Osoba {
    private double wyplata;

    public Employee (String imie, String nazwisko, String ulica, int numerDomu, double wyplata){
        super(imie, nazwisko, ulica, numerDomu);
        this.wyplata = wyplata;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Wyplata: " + this.getWyplata());
    }
}

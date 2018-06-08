package Shop;

public class Customer extends Osoba {
    private double wydatki;

    public Customer(String imie, String nazwisko, String ulica, int numerDomu, double wydatki){
        super(imie, nazwisko, ulica, numerDomu);
//        setImie(imie);
//        setNazwisko(nazwisko);
//        setUlica(ulica);
//        setNumerDomu(numerDomu);
        this.wydatki = wydatki;
    }

    public double getWydatki() {
        return wydatki;
    }

    public void setWydatki(double wydatki) {
        this.wydatki = wydatki;
    }

    @Override
    public void showInfo() {
        super.showInfo();
     System.out.println("Wydatki: " +  this.getWydatki());
    }

}

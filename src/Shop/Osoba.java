package Shop;

public class Osoba {

   private String imie;
    private String nazwisko;
    private String ulica;
    private int numerDomu;

    public Osoba(String imie, String nazwisko, String ulica, int numerDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }
    public void showInfo(){
        System.out.println(imie + " " + nazwisko + " " + ulica + " " +  numerDomu);
    }
}

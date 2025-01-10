import java.time.LocalDate;

public class Zakaznik {
    String jmeno;
    LocalDate datum;
    String mesto;
    int pocetProdeju;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public Zakaznik(String jmeno, LocalDate datum, String mesto, int pocetProdeju) {
        this.jmeno = jmeno;
        this.datum = datum;
        this.mesto = mesto;
        this.pocetProdeju = pocetProdeju;
    }

}
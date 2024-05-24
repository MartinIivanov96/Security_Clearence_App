package unidue.de;

public class Adress {
    private int hausnummer,plz;
    private String stadt,strasse;

    Adress(int hausnummer, int plz, String stadt, String strasse) {
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public int getPlz() {
        return plz;
    }

    public String getStadt() {
        return stadt;
    }

    public String getStrasse() {
        return strasse;
    }
}

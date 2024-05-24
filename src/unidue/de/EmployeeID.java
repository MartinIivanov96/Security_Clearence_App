package unidue.de;

public class EmployeeID {
    private static int uid=0;
    private String vorname, nachname;
    private Adress adress;
    final private Birthday birthday;
    EmployeeID(){ this.birthday=null;}
    EmployeeID(String vorname, String nachname, Adress adress, Birthday birthday) {
        uid = uid++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.adress = adress;
        this.birthday = birthday;

    }


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Adress getAdress() {
        return adress;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public int getUid() {
        return uid;
    }
}

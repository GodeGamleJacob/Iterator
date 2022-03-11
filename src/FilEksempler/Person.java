package FilEksempler;

public class Person {

    private String forNavn;
    private String efterNavn;
    private String stdnr;

    public Person(String forNavn, String efterNavn, String stdnr) {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.stdnr = stdnr;
    }

    public String getForNavn() {
        return forNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public String getStdnr() {
        return stdnr;
    }
}

package encaptulation;

public class House {
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber_of_bedroom() {
        return number_of_bedroom;
    }

    public void setNumber_of_bedroom(int number_of_bedroom) {
        this.number_of_bedroom = number_of_bedroom;
    }

    private String adress;
    private String owner;
    private int number_of_bedroom;
}

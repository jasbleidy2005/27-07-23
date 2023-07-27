package encaptulation;

public class MainHouse {
    public static void main(String[] args) {
        House house = new House();
        house.setAdress("M 5 C5");
        house.setNumber_of_bedroom(2);
        house.setOwner("jas");
        System.out.println(house.getAdress());
        System.out.println(house.getNumber_of_bedroom());
        System.out.println(house.getOwner());
    }
}

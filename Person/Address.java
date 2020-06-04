package Person;

public class Address {

    private String postalCode;
    private String villageName;
    private String streetName;
    private int number;

    public Address(String postalCode, String villageName, String streetName, int number) {
        this.postalCode = postalCode;
        this.villageName = villageName;
        this.streetName = streetName;
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

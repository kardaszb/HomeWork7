package shop;

public class Address {
    private String city;
    private String street;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String showInfo() {
        return "Address{" +
                "city='" + getCity() + '\'' +
                ", street='" + getStreet() + '\'' +
                ", homeNo='" + getHomeNo() + '\'' +
                ", flatNo='" + getFlatNo() + '\'' +
                '}';
    }
}

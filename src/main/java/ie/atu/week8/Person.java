package ie.atu.week8;

public class Person {
    private String name;
    private String address;
    private String telephone;

    public Person() {
        this.name = "";
        this.address = "";
        this.telephone = "";
    }

    public Person(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Telephone='" + telephone;
    }
}



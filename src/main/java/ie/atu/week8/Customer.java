package ie.atu.week8;

public class Customer extends Person {
    private String cust_num;
    private boolean mailingList;

    public Customer() {
        super();
    }
    public Customer(String name, String address, String telephone, String cust_num, boolean mailingList) {
        super(name, address, telephone);
        this.cust_num = cust_num;
        this.mailingList = mailingList;
    }

    public String getCust_num() {
        return cust_num;
    }

    public void setCust_num(String cust_num) {
        this.cust_num = cust_num;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer Details " + super.toString() + " " +
                "Customer ID='" + cust_num + '\'' +
                ", Mailing List=" + mailingList;
    }
}

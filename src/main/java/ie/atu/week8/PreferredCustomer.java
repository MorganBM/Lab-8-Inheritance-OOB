package ie.atu.week8;

public class PreferredCustomer extends Customer {
 private int loyaltyPoints;
 private int discount;

    public PreferredCustomer() {
      super();
    }


    public PreferredCustomer(String name, String address, String telephone, String cust_num, boolean mailingList, int loyaltyPoints, int discount) {
        super(name, address, telephone, cust_num, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discount = discount;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints;
        if(this.loyaltyPoints>=500 && this.loyaltyPoints<1000){
           this.discount = 5;
        }
        else if(this.loyaltyPoints>=1000 && this.loyaltyPoints<1500){
            this.discount = 6;
        }
        else if(this.loyaltyPoints>=1500 && this.loyaltyPoints<2000){
            this.discount = 7;
        }
        else if(this.loyaltyPoints>=2000){
            this.discount = 10;
        }
        else{
            this.discount = 0;
        }

    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() +", Loyalty Points=" + loyaltyPoints +
                ", Discount=" + discount;
    }
}

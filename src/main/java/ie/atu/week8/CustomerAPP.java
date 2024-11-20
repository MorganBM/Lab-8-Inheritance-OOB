package ie.atu.week8;

public class CustomerAPP {
    public static void main(String[] args) {
        int Points;

        Customer newCust = new Customer("Paul", "ATU", "34567", "ATU123", false);
        System.out.println(newCust);

        PreferredCustomer newCust1 = new PreferredCustomer();
        newCust1.setName("John");
        newCust1.setAddress("ATU");
        newCust1.setTelephone("091 775678");
        newCust1.setCust_num("4312");
        newCust1.setMailingList(false);
        newCust1.setLoyaltyPoints(500); // Accumulate points
        System.out.println(newCust1);
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1);
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1);
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1);




    }
}

package DAY12.Step2;

import DAY12.Step1.Customer;
import DAY12.Step1.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.setBonusPoint(1000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

    }
}

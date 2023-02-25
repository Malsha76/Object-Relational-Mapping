package lk.ijse.hibernate;

/*
    @author THINUX
    @created 18-Feb-23
*/

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Tharu");
        customer.setAddress("Galle");
        customer.setSalary(50000.00);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        session.save(customer);

        session.close();
    }
}

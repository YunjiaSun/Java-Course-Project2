/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import Personnel.*;
import java.util.ArrayList;
import Business.*;

/**
 *
 * @author kal bugrara
 */
public class CustomerDirectory {

    Business business;
    ArrayList<CustomerProfile> customerlist;

    public CustomerDirectory(Business d) {
        business = d;
        customerlist = new ArrayList<CustomerProfile>();
    }

    public CustomerProfile newCustomerProfile(Person p) {
        CustomerProfile sp = new CustomerProfile(p);
        customerlist.add(sp);
        return sp;
    }

    public CustomerProfile findCustomer(String id) {
        for (CustomerProfile sp : customerlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; // not found after going through the whole list
    }

    public CustomersReport generateCustomerPerformanceReport() {
        CustomersReport customersreport = new CustomersReport();
        for (CustomerProfile cp : customerlist) {
            CustomerSummary cs = new CustomerSummary(cp);
            customersreport.addCustomerSummary(cs);
        }
        return customersreport;
    }
}

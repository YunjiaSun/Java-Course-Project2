/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> customerlist;

    public CustomersReport() {
        customerlist = new ArrayList<>();
    }

    public void addCustomerSummary(CustomerSummary cs) {
        customerlist.add(cs);
    }

    public void printReport() {

        System.out.println("---------------- Total sale volumne: ----------------");
        for (CustomerSummary cs: customerlist) {
            System.out.print(cs.getCustomerName() + ": " + cs.getOrderTotal() + "\n");
        }

        System.out.println("\nSorted customer price performance report: ");
        Collections.sort(customerlist, (cs1, cs2) -> cs2.totalPricePerformance - cs1.totalPricePerformance);
        for (CustomerSummary cs: customerlist) {
            System.out.print(cs.getCustomerName() + ": " + cs.getTotalPricePerformance() + "\n");
        }
    }
}

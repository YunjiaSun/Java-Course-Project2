/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {
    Order subjectorder;
    int ordertotal;
    int totalPricePerformance;
    String customerName;
    
    public CustomerSummary(CustomerProfile cp) {
        customerName = cp.getName();
        ordertotal = cp.getSalesVolume();
        totalPricePerformance = cp.getTotalPricePerformance();
    }
    
    public int getOrderTotal() {
        return ordertotal;
    }

    public int getTotalPricePerformance() {
        return totalPricePerformance;
    }

    public String getCustomerName() {
        return customerName;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderManagement;

import java.util.ArrayList;

import Business.Business;
import CustomerManagement.CustomerProfile;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderList {

    Business business;
    ArrayList<Order> orders;
    MasterOrderReport masterorderreport;

    public MasterOrderList(Business b) {
        business = b;
        orders = new ArrayList<Order>();

    }

    public Order newOrder(CustomerProfile cp) {
        Order o = new Order(cp);
        orders.add(o);
        return o;

    }

    public MasterOrderReport generateMasterOrderReport() {
        masterorderreport = new MasterOrderReport();

        return masterorderreport;

    }

    public int getSalesVolume() {

        int sum = 0;
        for (Order order : orders) {
            sum = sum + order.getOrderTotal();
        }
        return sum;
    }

    public void printAllSales(){
        System.out.println("---------------- Master of Order ----------------");

        for(Order o : orders){
            o.printSaleInfo();
        }
    }

}

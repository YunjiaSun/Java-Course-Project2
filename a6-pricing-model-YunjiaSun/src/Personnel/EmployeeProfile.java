/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import java.util.ArrayList;
import OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile {
    ArrayList<Order> salesorders;

    Person person;
    public EmployeeProfile(){
        
    }

    public void addSalesOrder(Order o){
        salesorders.add(o);
        
    }
    

    public EmployeeProfile(Person p) {

        person = p;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }




}

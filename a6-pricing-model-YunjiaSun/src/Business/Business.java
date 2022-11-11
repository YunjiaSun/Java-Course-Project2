/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

import CustomerManagement.CustomerDirectory;
import OrderManagement.MasterOrderList;
import Personnel.EmployeeDirectory;
import ProductManagement.ProductSummary;
import ProductManagement.ProductsReport;
import Supplier.Supplier;
import Supplier.SupplierDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    MasterOrderList masterorderlist;
    SupplierDirectory suppliers;
    CustomerDirectory customers;
    EmployeeDirectory employeeDirectory;

    public Business(String n) {
        name = n;
        masterorderlist = new MasterOrderList(this);
        suppliers = new SupplierDirectory(this);
        customers = new CustomerDirectory(this);
        employeeDirectory = new EmployeeDirectory(this);
    }

    public int getSalesVolume() {
        return masterorderlist.getSalesVolume();

    }
    public SupplierDirectory getSupplierDirectory(){
        return suppliers;
    }

    public CustomerDirectory getCustomerDirector(){
        return customers;
    }


    public ProductsReport getSupplierPerformanceReport(String n) {
        Supplier supplier = suppliers.findSupplier(n);
        if (supplier == null) {
            return null;
        }
        return supplier.prepareProductsReport();

    }

    public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String n) {
        
        ProductsReport  productsreport = getSupplierPerformanceReport(n);
        return productsreport.getProductsAlwaysAboveTarget();

    }

    public int getHowManySupplierProductsAlwaysAboveTarget(String n) {
        ProductsReport  productsreport = getSupplierPerformanceReport(n); // see above
        int i = productsreport.getProductsAlwaysAboveTarget().size(); //return size of the arraylist
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MasterOrderList getMasterorderlist() {
        return masterorderlist;
    }

    public void setMasterorderlist(MasterOrderList masterorderlist) {
        this.masterorderlist = masterorderlist;
    }

    public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SupplierDirectory suppliers) {
        this.suppliers = suppliers;
    }

    public CustomerDirectory getCustomers() {
        return customers;
    }

    public void setCustomers(CustomerDirectory customers) {
        this.customers = customers;
    }

    public void printAllSales(){
        System.out.println("---------------- All Sales ----------------");
        masterorderlist.printAllSales();
    }
    
}
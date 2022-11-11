/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import java.util.ArrayList;

import Business.Business;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {

    Business business;
    ArrayList<Supplier> suppliers;

    public SupplierDirectory(Business b){
        this.business = b;
        suppliers = new ArrayList<Supplier>();
    }
    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n,this);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import java.util.ArrayList;
import ProductManagement.ProductCatalog;
import ProductManagement.ProductSummary;
import ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    SupplierDirectory supplierDirectory;

    public Supplier(String n,SupplierDirectory sd){
        supplierDirectory = sd;
        name = n;
        productcatalog = new ProductCatalog(this);
        
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
    //add supplier product ..
    //update supplier product ...

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }

    public ProductsReport getProductsreport() {
        return productsreport;
    }

    public void setProductsreport(ProductsReport productsreport) {
        this.productsreport = productsreport;
    }
    
    

    
      
}

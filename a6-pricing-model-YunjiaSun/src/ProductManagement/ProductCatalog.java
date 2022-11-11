/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductManagement;

import java.util.ArrayList;

import Supplier.Supplier;

/**
 *
 * @author kal bugrara
 */
public class ProductCatalog {
    Supplier supplier;
    String type;
    ArrayList<Product> products;

    public ProductCatalog(Supplier s) {
        supplier = s;
        products = new ArrayList<Product>();
    }

    public ProductCatalog() {
        type = "noname";
        products = new ArrayList<Product>();
    }

    public Product newProduct(String name,int fp, int cp, int tp) {
        Product p = new Product(name,fp, cp, tp);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();

        for (Product p : products) {

            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void printProductList(){
        System.out.println("---------------- Product Catalog ----------------");

        for (Product eachProductFromLoop: products){
            eachProductFromLoop.printProductInfo();
        }
    }

    

}

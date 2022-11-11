/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductManagement;

/**
 *
 * @author kal bugrara
 */
// this class will extract summary data from the product
public class ProductSummary {

    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int salesvalume; // total profit above target --could be negative too
    int acutalsalesvolume;
    int rank; // will be done later

    public ProductSummary(Product p) {

        subjectproduct = p; // keeps track of the product itself not as well;
        numberofsalesabovetarget = 0; // to be implemented
        salesvalume = 0; // to be implemented
        acutalsalesvolume = p.getSalesVolume();
    }

    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }

}

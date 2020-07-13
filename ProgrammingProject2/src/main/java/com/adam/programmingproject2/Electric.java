
package com.adam.programmingproject2;

public class Electric extends Automobile {
    private int weightInPounds;
    private final int WEIGHT_DISCOUNT = 300;
    private final int MIN_DISCOUNT = 150;
    private final int MAX_DISCOUNT = 200;
    
    public Electric(String make, int price, int weight) {
        super(make, price);
        weightInPounds = weight;
        
    }
    
    @Override
    public double salesTax(){
        double totalSalesTax = super.salesTax();
        if(this.weightInPounds < WEIGHT_DISCOUNT){
            totalSalesTax -= MAX_DISCOUNT;
        } else {
            totalSalesTax -= MIN_DISCOUNT;
        }
        return totalSalesTax;
    }

    @Override
    public String toString() {
        return "Make and Model: " + makeAndModel + " Sales price: " + price + " Sales tax: " + salesTax() + " weight: " + weightInPounds;
    }
    
    
    
    
}

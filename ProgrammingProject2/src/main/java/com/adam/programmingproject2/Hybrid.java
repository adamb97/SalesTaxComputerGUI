
package com.adam.programmingproject2;


public class Hybrid extends Automobile {
   private int milesPerGal;
  private final int MPG_DISCOUNT = 40;
  private final int DISCOUNT = 100;
  private final int MILE_DISCOUNT = 2;
  
  
    public Hybrid(int milesPerGal, String make, int price) {
        super(make, price);
        milesPerGal = milesPerGal;
    }

    @Override
    public double salesTax() {
        double totalSalesTax = super.salesTax();
        if(milesPerGal < MPG_DISCOUNT){
            totalSalesTax-=DISCOUNT;
        } else {
           double discount = (milesPerGal - MPG_DISCOUNT)*MILE_DISCOUNT;
           if(discount > totalSalesTax){
               discount = totalSalesTax;
           }
           totalSalesTax-=discount;
        }
        return totalSalesTax;
    }

    @Override
    public String toString() {
        return "makeAndModle: " + makeAndModel + " sales price: " + price + " sales tax: " + salesTax() + " miles per gallon: " + milesPerGal;
    }
    
    
    
    
   
    
}

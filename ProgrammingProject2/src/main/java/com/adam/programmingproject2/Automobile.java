
package com.adam.programmingproject2;

public class Automobile {
   protected String makeAndModel;
   protected int price;
  private final double  SALES_TAX_PERCENT = 0.05;

    public Automobile(String make, int price) {
        this.makeAndModel = make;
        this.price = price;
    }
   
    public double salesTax(){
        double baseSalesTax = SALES_TAX_PERCENT * price;
        return baseSalesTax;
    }

    @Override
    public String toString() {
        return "makeAndModel=" + makeAndModel +  ", price=" + price + ", sales tax=" + salesTax();
    }
    
    
    
    
    
}

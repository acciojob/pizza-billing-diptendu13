package com.driver;

public class Pizza {
    private int price;
    private int toppings;
    private Boolean isVeg;
    private String bill;
    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean isTakeaway;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isTakeaway = false;
        this.isBillGenerated = false;

        if (this.isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.isExtraCheese){
            this.price += 80;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.isExtraToppings){
            this.price += this.toppings;
            this.isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeaway){
            this.price += 20;
            this.isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated) {
            if (this.isExtraCheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (this.isExtraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (this.isTakeaway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            isBillGenerated = true;
            return this.bill;
        }
        return "";
    }
}

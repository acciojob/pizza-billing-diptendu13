package com.driver;

public class Pizza {

    private int price;
    private int total;
    private Boolean isVeg;
    private String bill;
    boolean flagCheese;
    boolean flagTop;
    boolean flagTake;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.flagCheese = false;
        this.flagTop = false;
        this.flagTake = false;
        this.total = 0;
        // your code goes here
        if (this.isVeg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.total += this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.flagCheese){
            this.total += 80;
        }
        this.flagCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.flagTop){
            if (this.isVeg){
                this.total += 70;
            }
            else {
                this.total += 120;
            }
        }
        this.flagTop = true;
    }

    public void addTakeaway(){
        // your code goes here
        if (!flagTake){
            this.total += 20;
        }
        this.flagTake = true;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        if (this.flagCheese) this.bill += "Extra Cheese Added: 80" + "\n";
        if (this.flagTop){
            if (this.isVeg){
                this.bill += "Extra Toppings Added: 70" + "\n";
            }
            else{
                this.bill += "Extra Toppings Added: 120" + "\n";
            }
        }
        if (flagTake){
            this.bill += "Paperbag Added: 20" + "\n";
        }
        this.bill += "Total Price: " + this.total;
        return this.bill;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abuelela
 */
public class Product {

    private double price;
    private int quantity;
    private String name;

//    constructor function
    public Product(String initializeName, double initializePrice, int initializeQuantity) {
        this.name = initializeName;
        this.price = initializePrice;
        this.quantity = initializeQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

}

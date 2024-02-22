/**
 * PROJECT TITLE: ASSIGNMENT 1
 * PURPOSE OF PROJECT : TO DEMONSTRATE REPRESENTING DIFFERENT TYPES OF FLOWERS AND FUNCTIONALITIES TO MANAGE THEIR INVENTORY
 * DATE: 22/2/2024
 * PROGRAMMER: AQIEF SYAHMIE BIN MOHAMAD AMIN
 **/

public class Flower {
    private String name;
    private String color;
    private double price;
    private int quantity;

    public Flower() {
        this.name = "";
        this.color = "";
        this.price = 0;
        this.quantity = 0;
    }

    public Flower(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method that will display all the information about the flower
    public String toString() {
        return "Name: " + name + "\nColor: " + color + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}

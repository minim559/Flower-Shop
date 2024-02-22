import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfFlower = 10;
        Flower[] flowerArray = new Flower[numberOfFlower];

        System.out.print("--------------------------------------------------------------\n");
        System.out.print("  WELCOME TO FLORAL BLISS MANAGEMENT SYSTEM \n");
        System.out.print("--------------------------------------------------------------\n\n");

        for (int i = 0; i < numberOfFlower; i++) {
            System.out.print("Enter flower" + (i + 1) + "'s name: ");
            String name = input.nextLine();

            System.out.print("Enter flower " + (i + 1) + "'s color: ");
            String color = input.nextLine();

            System.out.print("Enter flower" + (i + 1) + "'s price(RM)/pc: ");
            double price = input.nextDouble();

            System.out.print("Enter flower" + (i + 1) + "'s quantity: ");
            int quantity = input.nextInt();
            System.out.print("\n");

            input.nextLine(); // Consume the newline character

            flowerArray[i] = new Flower(name, color, price, quantity);
        }

        System.out.println("\n\n==========Flower Details==========\n");
        for (int i = 0; i < numberOfFlower; i++) {
            System.out.println("\t  " + flowerArray[i].toString() + "\n");
        }
        System.out.println("====================================\n");

        double totalValue = 0.00;
        for (int i = 0; i < numberOfFlower; i++) {
            double price = flowerArray[i].getPrice();
            int quantity = flowerArray[i].getQuantity();
            totalValue += (price * quantity);
        }

        System.out.println("\n The total value of flowers is RM" + totalValue + "0");

        System.out.print("\nPlease enter the flower's name you want to search: ");
        String searchName = input.nextLine();
        System.out.print("\n");

        int foundIndex = -1;
        for (int i = 0; i < numberOfFlower; i++) {
            if (flowerArray[i].getName().equalsIgnoreCase(searchName)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("\n-----Flower Details-----\n");
            System.out.println(flowerArray[foundIndex].toString());
            System.out.println("\n------------------------\n");
            System.out.println("\n");
        } else {
            System.out.println("\nThe flower you searched for is not in the inventory");
        }

        System.out.print("\nPlease enter the flower's name you want to restock: ");
        String flowerName = input.nextLine();

        for (int i = 0; i < numberOfFlower; i++) {
            if (flowerArray[i].getName().equalsIgnoreCase(flowerName)) {
                System.out.print("Enter the additional quantity: ");
                int newQuantity = input.nextInt();
                input.nextLine();

                int currentQuantity = flowerArray[i].getQuantity();
                flowerArray[i].setQuantity(currentQuantity + newQuantity);

                System.out.println("\nFlower inventory has been restocked!, THANK YOU :) \n");
                System.out.println("\n-----Flower Details-----\n");
                System.out.println(flowerArray[i].toString());
                System.out.println("\n-------------------------\n");
                break;
            }
        }

        System.out.print("\n\n---------------------------------------\n");
        System.out.print(" THANK YOU FOR USING FLORAL BLISS MANAGEMENT SYSTEM \n");
        System.out.print("----------------------------------------------\n");

        input.close();
    }
}

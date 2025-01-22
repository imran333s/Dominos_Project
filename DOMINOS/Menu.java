package DOMINOS;

import java.util.*;

public class Menu {
    private Pizza p1;
    private Beverages b1;
    private double totalPrice;;
    Scanner sc = new Scanner(System.in);

    Menu() {
        System.out.println("=== Welcome to Domino's!! ===");
    }

    public void selectMenu() {
        System.out.println("Enter 1 ===> Pizza ");
        System.out.println("Enter 2 ===> Beverages");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("you have selected Pizza!");
            p1 = selectPizza();
            p1.getDetails();
            p1.getPrice();
        } else if (choice == 2) {
            b1=selectBeverages();
            b1.getDetails();
            b1.getPrice();

        } else {
            System.out.println("it is invalid choice!!");
            selectMenu();
        }
    }

    public Pizza selectPizza() {
        System.out.println("enter 1 Peppy");
        System.out.println("enter 2 Mexican");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You have selected Peppy!");
            System.out.println("Enter the Size of Pizza");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            String size = sc.next();
            return new Peppy(size);

        } else if (choice == 2) {
            System.out.println("You have selected Mexican!");
            System.out.println("Enter the Size of Pizza");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            String size = sc.next();
            return new Mexican(size);

        } else {
            System.out.println("Invalid choice Entered");
            return selectPizza();
        }

    }

    public Beverages selectBeverages() {
        System.out.println("enter 1 for  Pepsi");
        System.out.println("enter 2  for Coke");
        System.out.println("enter 3  for Sprite");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("You have selected Pepsi!");
            return new Pepsi(choice);

        } else if (choice == 2) {
            System.out.println("You have selected Coke!");
            return new Coke(choice);
        } else {
            System.out.println("Invalid choice Entered");
            return selectBeverages();
        }
    }

    public void calculateTotal() {
        totalPrice =0;
        if(p1 != null){
            totalPrice += p1.getPrice() ;
        }
        if(b1 != null)
        {
            totalPrice+=b1.getPrice();
        }
        System.out.println("The total price is : " + totalPrice);
    }

    public void estimateDeliveryTime() {
        int deliveryTime = 0;
        if (p1 instanceof Peppy || b1 instanceof Pepsi) {
            deliveryTime = 15;
        } else if (p1 instanceof Mexican || b1 instanceof Coke) {
            deliveryTime = 20;
        }

        System.out.println("Congratulations! Your order has successfully placed.");
        System.out.println("Estimated Delivery time is: " + deliveryTime + " minutes");
    }

    public void payAmount()
    {
        System.out.println("Kindly pay the total amount: "+ totalPrice);
        System.out.println("Kindly select  the payment option");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Credit card");
        System.out.println("4. Debit card");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Kindly give the money to delivery person.");
            break;
            case 2:
            System.out.println("Enter the Upi id: ");
            String upi_id=sc.next();
            System.out.println("Order Processing...");
            break;
            case 3:
            System.out.println("Enter the credit card number: ");
            String  credidCardNum=sc.next();
            System.out.println("Order Processing...");
            break;
            case 4:
            System.out.println("Enter the Debit card number: ");
            String  debitCardNum=sc.next();
            System.out.println("Order Processing...");
            break;
            default:
            System.out.println("Invalid payment option selected.");


            System.out.println("Order Successfull!!!");

        }
       
    }

}

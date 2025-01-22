package DOMINOS;
import java.util.*;
public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        Menu m1 = new Menu();

        do {
            m1.selectMenu();
            System.out.println("Would you like to continue ordering? (Press C/c for Continue or any other key to checkout)");
             c=sc.next().charAt(0);
        } while (c=='C' || c=='c');
        m1.calculateTotal();
        m1.payAmount();
        m1.estimateDeliveryTime();
        System.out.println("Thank you for visting us!");
        sc.close();
        
        
    }
}

package Day2;

import java.util.Scanner;


// Whenever execution starts it will check for static block if static block is present, before execution static block is executed and then the execution will continue.
// The super keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the superclass constructor.

public class OrderDelivered extends TShirtOrders{


    OrderDelivered(int counts) {
        super(counts);
    }


    static {
        System.out.println("I have to deliver 100 T-shirts of different colours and different sizes");
    }


    public static void main(String[] args) {

        TShirtOrders.bulkOrder(50,'M',"Blue");
        TShirtOrders orders = new TShirtOrders(50);
        orders.totalAmount();

    }
}

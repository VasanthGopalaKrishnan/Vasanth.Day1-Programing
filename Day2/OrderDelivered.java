package Day2;

import java.util.Scanner;

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

package Day2;

import java.util.Scanner;

public class TShirtOrders {


    int count;
    char size;
    String colour;

    static int totalcount;

    Scanner sc = new Scanner(System.in);

    TShirtOrders(int counts) {
        int add =0;
        for (int i=0;i<counts;){

            int particularcount = sc.nextInt();
            char particularsize = sc.next().charAt(0);
            String particularcolour = sc.next();

            add = i+particularcount;
            i = add;


            this.size = particularsize;
            this.colour = particularcolour;

            System.out.println("I need " + particularcount + " T-Shirts with " + particularsize + " sizes in " + particularcolour + " colour");
        }
        this.count =add;
    }

    public static void bulkOrder(int totalcounts,char totalsizes,String totalcolours){
        System.out.print("I need " + totalcounts +" "+ "T-Shirts with " + totalsizes +" "+ "sizes in "+ totalcolours + " colour" );
        totalcount=totalcounts;
    }


    public void totalAmount(){

        int TotalAmount = totalcount+count;
        System.out.println(count);
        System.out.println(totalcount);
        System.out.println("Total amount of T-shirts delivered to a company " + TotalAmount);
    }


}

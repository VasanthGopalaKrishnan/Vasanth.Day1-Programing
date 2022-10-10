package Day20;

import java.util.Scanner;

public class HeteromecicNumber {

//HetromecicNumber = number multiply with the next number (2*3=6,3*4=12,4*5=20,5*6=30,6*7=42,.........n)


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;

        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }

        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");
    }

}

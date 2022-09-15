package Day3;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner getprime = new Scanner(System.in);

        System.out.println("Find the given number is prime number");

        int primeNumber = getprime.nextInt();

        int count = 0;

        for (int i=2;i<=primeNumber/2;i++){
            if(primeNumber%i==0){
                count =1;
            }
        }

        if (count==0){
            System.out.println("The given number is prime number");
        }else {
            System.out.println("The given number is not a prime number");
        }

    }

}

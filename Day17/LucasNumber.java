package Day17;

import java.util.Scanner;

public class LucasNumber {

    public static void main(String[] args) {
        int a=2,b=1,c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of lucas series:");
        int len=sc.nextInt();
        for(i=1;i<=len;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }


}

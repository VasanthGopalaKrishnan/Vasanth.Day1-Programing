package ProgramFiles;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {

        int a=153,i,j=0,b;
            b=a;
        while (a>0) {
            i=a%10;
            j=j+(i*i*i);
            a=a/10;
        }if (b==j) { System.out.println("ams no");

        } else {System.out.println("not an ams no");

        }

    }

}

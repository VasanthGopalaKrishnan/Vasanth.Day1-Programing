package Day11;

import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while(sc.hasNext()){

            String text = sc.nextLine();
            System.out.println( i + " " + text);
            i++;

        }
    }
}

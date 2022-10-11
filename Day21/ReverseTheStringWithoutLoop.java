package Day21;

import java.util.Scanner;

public class ReverseTheStringWithoutLoop {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int l=str.length();
        String reverse="";

        StringBuilder sb= new StringBuilder(str);
		reverse = sb.reverse().toString();
		System.out.println(reverse);

}
}
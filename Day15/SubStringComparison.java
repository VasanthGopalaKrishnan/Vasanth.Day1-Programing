package Day15;

import java.util.Scanner;

public class SubStringComparison {

    public static String getSmallestAndLargest(String s, int j) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, j);

        for (int i=1; i<s.length()-j+1; i++) {
            String substr = s.substring(i, i+j);
            if (smallest.compareTo(substr) > 0)
                smallest = substr;
            if (largest.compareTo(substr) < 0)
                largest = substr;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }


}

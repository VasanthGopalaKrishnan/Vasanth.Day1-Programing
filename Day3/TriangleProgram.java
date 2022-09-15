package Day3;

public class TriangleProgram {

    public static void main(String[] args) {

        int num = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < num; j++) {
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
        }
    }


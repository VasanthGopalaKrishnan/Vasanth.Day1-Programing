package Day3;

public class OverLoadingClass {

    public static void addValues(int a,int b,int c){
        System.out.println("Adding the values of " + (a + b + c));
    }

    public static void addValues(int a,int b){
        System.out.println("Adding the values of " + (a + b));
    }

    public static void main(String[] args) {

        addValues(10,20,30);
        addValues(10,30);
        addValues(30,20,40);

    }


}

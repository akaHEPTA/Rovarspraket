import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.print("Input original word: ");
        String temp = myScan.nextLine();
        System.out.println("Rovarspraket: " + Rovarspraket.getRovarspraket(temp));

    }
}

package app.views;

import java.util.Scanner;

public class OrderView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order code: ");
        String code = scanner.nextLine();
        System.out.println("Enter product quantity, psc.: ");
        String quantity = scanner.nextLine();
        System.out.println("Enter product price, USD: ");
        String price = scanner.nextLine();

        return new String[] {code, quantity, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

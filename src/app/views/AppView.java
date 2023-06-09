package app.views;

import java.util.Scanner;

public class AppView {

    public int getOption() {
        System.out.println("""
                Choose an option:
                1 - order without delivery
                2 - order with delivery
                0 - close app 
                """);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

}

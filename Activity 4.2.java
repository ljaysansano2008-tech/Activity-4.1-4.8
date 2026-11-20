 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String chosenLang;
        int optionType;

        System.out.println("Which programming language do you prefer?");
        System.out.println("Enter 1 for Java or 2 for C++");

        System.out.print("Your choice: ");
        optionType = input.nextInt();

        while (optionType != 1 && optionType != 2) {

            System.out.println("Invalid entry.");
            System.out.println("You must choose 1 or 2.");
            System.out.print("Enter 1 for Java or 2 for C++: ");

            optionType = input.nextInt();
        }

        if (optionType == 1) {
            chosenLang = "Java";
        } else {
            chosenLang = "C++";
        }

        System.out.println("Programming language chosen is " + chosenLang);

        input.close();
    }
}

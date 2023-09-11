import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number one through twelve.");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Month 1 is January.");
        }
        else if (num == 2) {
            System.out.println("Month 2 is February.");
        }
        else if (num == 3) {
            System.out.println("Month 3 is March.");
        }
        else if (num == 4) {
            System.out.println("Month 4 is April.");
        }
        else if (num == 5) {
            System.out.println("Month 5 is May.");
        }
        else if (num == 6) {
            System.out.println("Month 6 is June.");
        }
        else if (num == 7) {
            System.out.println("Month 7 is July.");
        }
        else if (num == 8) {
            System.out.println("Month 8 is August.");
        }
        else if (num == 9) {
            System.out.println("Month 9 is September.");
        }
        else if (num == 10) {
            System.out.println("Month 10 is October.");
        }
        else if (num == 11) {
            System.out.println("Month 11 is November.");
        }
        else if (num == 12) {
            System.out.println("Month 12 is December.");
        }
        else {
            System.out.println("Not within given range.");
        }
    }
}
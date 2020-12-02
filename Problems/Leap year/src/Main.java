import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        boolean res = (((year % 4) == 0) && ((year % 100 ) != 0));
        boolean res2 = (year % 400) == 0;
        boolean fin = res || res2;

        if (fin) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
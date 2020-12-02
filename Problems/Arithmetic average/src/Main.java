import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int num = 0;

        int i;

        for (i = a; i <=b; i++) {

            if (i % 3 == 0) {

                sum += i;
                num++;

            }
        }
        double average;
        average = (double)sum / num ;
        System.out.println(average);
    }
}
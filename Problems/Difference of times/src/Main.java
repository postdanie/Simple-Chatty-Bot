import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();
        hour1 = hour1 * 3600;
        hour2 = hour2 * 3600;
        minute1 = minute1 * 60;
        minute2 = minute2 * 60;
        int data2 = hour2 + minute2 + second2;
        int data1 = hour1 + minute1 + second1;
        int result = data2 - data1;
        System.out.println(result);


    }
}

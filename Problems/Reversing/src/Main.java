import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int c = number % 10;
        int b = (number / 10) % 10;
        int a = number / 100;
        if (c > 0)
    {
            System.out.println(c + "" + b + "" + a);
        } else {
            System.out.println(b + "" + a);
        }
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        System.out.println(word.substring(digit1, ++digit2));


    }
}
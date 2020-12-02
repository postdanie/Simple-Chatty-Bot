import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = word1.toLowerCase();
        String bobo = "j";
        boolean var1 = word2.startsWith("j");
        System.out.println(var1);

    }
}
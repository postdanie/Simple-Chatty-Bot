import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        boolean opt1 = K >= N;
        boolean opt2 = K >= M;

        int choc = N * M;

        boolean opt3 = K <= choc;
        boolean opt4 = K % N == 0;
        boolean opt5 = K % M == 0;

        boolean result = opt1 && opt2 && opt3 && (opt4 || opt5);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}
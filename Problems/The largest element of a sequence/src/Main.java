import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max  = 0;
        int cur  = 0;

        while( scanner.hasNextInt())
        {
            cur = scanner.nextInt();
            if(cur > max) max = cur;
        }
        System.out.println(max);
    }
    }
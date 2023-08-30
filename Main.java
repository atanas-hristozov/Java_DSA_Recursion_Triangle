import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(triangleRow(n));
    }

    private static int triangleRow(int number) {
        if (number == 0) {
        return 0;
        } else {
            return triangleRow(number-1) + number;
        }
    }
}
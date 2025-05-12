import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int sum = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if ( i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("홀수의 합: " + sum);


    }
}
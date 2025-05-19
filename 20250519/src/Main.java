import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            int score = scanner.nextInt();
            if (score < 0) break;
            sum += score;
            count++;
        }

        if (count == 0) {
            System.out.println("입력된 점수가 없습니다.");
        } else {
            System.out.println("점수의 총합은: " + sum);
        }

        scanner.close();
    }
}

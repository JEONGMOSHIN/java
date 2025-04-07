import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //음료 종류 출력
        System.out.println("음료 종류를 선택하세요.");
        System.out.println("1.아메리카노 (3,000원)");
        System.out.println("2.카페라떼   (4,000원)");
        System.out.println("3.카푸치노   (4,500원)");

        //음료 선택 받기
        int choice = sc.nextInt();
        int price = 0;
        if (choice == 1) price = 3000;
        else if (choice == 2) price = 4000;
        else if (choice == 3) price = 4500;
        else System.out.println("지원하지 않는 메뉴입니다.");;

        //음료 크기 출력
        System.out.println("음료 크기를 선택하세요.");
        System.out.println("1.Small  (기본가격)");
        System.out.println("2.Medium (기본가격 + 500원)");
        System.out.println("3.Large  (기본가격 + 1,000원)");

        //음료 크기 선택 받기
        int choice2 = sc.nextInt();
        int size = 0;
        if (choice2 == 1) size = 0;
        else if (choice2 == 2) size = 500;
        else if (choice2 == 3) size = 1000;
        else System.out.println("지원하지 않는 메뉴입니다.");

        //추가 옵션 출력
        System.out.println("추가 옵션을 선택하세요.");
        System.out.println("1.기본        (추가 비용 없음)");
        System.out.println("2.샷 추가     (500원)");
        System.out.println("3.시럽 추가    (300원)");
        System.out.println("4.샷/시럽 추가 (800원)");

        //추가 옵션 선택 받기
        int choice3 = sc.nextInt();
        int add = 0;
        if (choice3 == 1) add = 0;
        else if (choice3 == 2) add = 500;
        else if (choice3 == 3) add = 300;
        else if (choice3 == 4) add = 800;
        else System.out.println("지원하지 않는 메뉴입니다.");

        //최종 가격 출력
        int finalPrice = price + size + add;
        System.out.println("최종 가격은" + finalPrice + "원 입니다.");

    }
}
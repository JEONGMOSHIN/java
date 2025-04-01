public class Main {
    public static void main(String[] args) {
        int korean = 85;
        int english = 92;
        int math = 78;
        int science = 95;

        //1. 정수 나눗셈으로 평균 계산 (소수점 손실)
        int subjects = 4;
        int total = korean + english + math + science;
        int average = total / subjects;

        System.out.println("=== 형변환 없는 평균 계산 ===");
        System.out.println("총점: " + total);
        System.out.println("정수 나눗셈 평균: " + average);

        //2. 형변환을 사용한 평균 계산
        double doubleaverage = (double) total / subjects;

        System.out.println("\n== 형변환을 사용한 평균 계산 ===");
        System.out.println("실수 나눗셈 평균: " + doubleaverage);
        System.out.printf("소수점 둘째 자리까지: %.2f\n", doubleaverage);

        //3. 자료형 논리 비교
        System.out.println("\n=== 자료형 논리 비교 ===");

        // 정수형과 실수형 평균 비교
        System.out.println("정수 평균 == 실수 평균? " + (average == doubleaverage));

        //추가 비교
        boolean pass = doubleaverage >= 80;
        System.out.println("평균 80점 이상 합격 여부: " + (pass ? "pass" : "fail"));
    }
}
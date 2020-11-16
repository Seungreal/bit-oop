package day02;

import java.util.Scanner;

class Main {
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradebook = new GradeBook();

        System.out.printf("번호를 입력하세요: ");
        gradebook.setId(scanner.nextInt());
        
        System.out.printf("이름를 입력하세요: ");
        // scanner.nextLine();
        gradebook.setString(scanner.next());
        
        System.out.printf("국어점수를 입력하세요: ");
        gradebook.setKorean(scanner.nextInt());
        
        System.out.printf("영어점수를 입력하세요: ");
        gradebook.setEnglish(scanner.nextInt());
        
        System.out.printf("수학점수를 입력하세요: ");
        gradebook.setMath(scanner.nextInt());

        int total = gradebook.getKorean() + gradebook.getEnglish() + gradebook.getMath();
        // double average = sum / 3.0;
        // 매직 넘버(마술의 숫자)
        // 매직 넘버란 소스코드 중간에 갑자기 튀어나오는
        // 정수나 실수 혹은 문자열을 매직 넘버라고 부른다.
        // 이러한 매직 넘버는 간단한 프로그램을 짤 때에는 유용하지만
        // 해당 프로그램을 유지보수, 업그레이드 할 때에는 하드코딩이 되므로
        // 코드의 변경을 어렵게 만든다.

        // 하드코딩 vs 소프트코딩
        // 하드코딩이란 '경직된' 코딩으로써
        // 변경이 어려운 코드를 만드는 것을 하드코딩이라고 한다.
        // 하드코딩의 장점은 코드를 쉽게 만들수 있다 와 굳이 변수명이나 상수명을
        // 안만들어도 된다라는 장점이 있지만 경직되었기 때문에 코드 변경은 오히려 어렵다.

        // 소프트코딩은 '유연한' 코딩으로써
        // 변경이 쉬운 코드를 만드는것을 소프트 코딩이라고 한다.
        // 소프트코딩은 비록 처음 만들때는 어렵지만
        // 유지보수가 쉬워진다는 장점이 있다.

        // 그렇다면 위의
        // double average = sum / 3.0;
        // 을 소프트코딩하면 어떻게 될까?
        // 3을 가지고 있는 상수를 만들고
        // double average = sum / (double)과목수 요런식으로 만들어주어야 한다.
        double avr = (double) total / SUBJECT_SIZE;

        System.out.printf("번호:%d번 이름:%s\n", gradebook.getId(), gradebook.getName());
        System.out.printf("국어:%03d점 영어:%03d점 수학:%03d점\n", gradebook.getKorean(), gradebook.getEnglish(),
                gradebook.getMath());
        System.out.printf("총점:%3d점 평균:%.2f점\n", total, avr);
        
        BMI bmi = new BMI();
        
        System.out.print("몸무게: ");
        bmi.setWeight(scanner.nextDouble());
        
        System.out.print("키: ");
        bmi.setHeight(scanner.nextDouble());
        
        double bmiValue = bmi.getWeight() / bmi.getHeight() /bmi.getHeight();
        System.out.printf("bmi 수치는: %.2f입니다.\n", bmiValue);

        scanner.close();
    }
}

package day04;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 우리가 메소드를 배우기 전이라면
        // 이 안에서 + - * / 같은 기능을 직접 매번 적어주었겠지만
        // 이제 우리가 메소드를 통해서 해당 기능을 분리해보자!

        calculator.setNumber1(3);
        calculator.setNumber2(4);

        System.out.println("add(3, 4): " + calculator.add(calculator.getNumber1(), calculator.getNumber2()));
        System.out.println("subtract(3, 4): " + calculator.subtract(calculator.getNumber1(), calculator.getNumber2()));
        System.out.println("multiply(3, 4): " + calculator.multiply(calculator.getNumber1(), calculator.getNumber2()));
        System.out.println("divide(3, 4): " + calculator.divide(calculator.getNumber1(), calculator.getNumber2()));

        scanner.close();
    }

}

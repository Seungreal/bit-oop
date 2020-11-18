package calculator;

import java.util.Scanner;

public class CalculatorViewer {
    public void starCalc(Scanner scan) {
        CalculatorDTO calc = new CalculatorDTO();
        CalculatorController controll = new CalculatorController();
        
        System.out.println("계산기 시작");
        System.out.print("첫번째 숫자 입력: ");
        calc.setNum1(scan.nextInt());
        System.out.print("연산자 입력(+,-,*,/,%): ");
        calc.setOpcode(scan.next());
        System.out.print("두번째 숫자 입력: ");
        calc.setNum2(scan.nextInt());
        
        System.out.println("결과는 "+controll.excute(calc)+"입니다.");
        
        scan.close();
    }
}

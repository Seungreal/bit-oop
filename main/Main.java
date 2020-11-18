package main;

import java.util.Scanner;

import bmi.BmiViewer;
import calculator.CalculatorViewer;
import lotto.LottoViewer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("0.종료 1.계산기 2.BMI 3.로또");
        switch(scan.next()) {
        case "1":         
            new CalculatorViewer().starCalc(scan);
            break;
        case "2":
            new BmiViewer().starBmi(scan);
            break;
        case "3":
            new LottoViewer().starLotto(scan);
            break;
        case "0":
            System.out.println("종료합니다.");
        }
        scan.close();
    }
}

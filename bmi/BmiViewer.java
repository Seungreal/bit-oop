package bmi;

import java.util.Scanner;

import user.UserDTO;

public class BmiViewer {
    public void starBmi(Scanner scan) {
        BmiDTO bmi = new BmiDTO();
        UserDTO user = new UserDTO();
        BmiController controller = new BmiController();

        System.out.println("BMI계산 시작");
        System.out.print("이름 입력: ");
        user.setName(scan.next());
        System.out.print("몸무게를 입력: ");
        bmi.setWeight(scan.nextDouble());
        System.out.print("키를 입력: ");
        bmi.setHeight(scan.nextDouble());
        System.out.println(controller.getBmi(user, bmi));
    }
}

package bmi;

import java.util.Scanner;

public class BMIUI {

    public void inputInfo() {
        System.out.println("키(m)를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();

        System.out.println("몸무게(kg)를 입력하세요");
        double weight = scanner.nextDouble();

        double bmi = BMICalculator.calculateBMI(height, weight);

        System.out.println("BMI는 " + bmi + " 입니다.");
    }
}

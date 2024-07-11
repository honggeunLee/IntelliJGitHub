package bmi;

import java.util.Scanner;

public class BMIUI {
    Scanner scanner;

    public BMIUI() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            // 1: 계산, 2: 종료
            System.out.println("1.계산, 2. 종료");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputInfo();
                    break;
                case 2:
                    System.out.println("종료되었습니다.");
                    return;
            }
        }
    }

    public void inputInfo() {
        System.out.println("키(m)를 입력하세요");
        double height = scanner.nextDouble();

        System.out.println("몸무게(kg)를 입력하세요");
        double weight = scanner.nextDouble();

        double bmi = BMICalculator.calculateBMI(height, weight);

        System.out.println("BMI는 " + bmi + " 입니다.");
    }
}

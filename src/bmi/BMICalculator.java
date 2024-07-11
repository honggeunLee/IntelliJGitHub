package bmi;

/**
 * 비만지수 계산기
 */
public class BMICalculator {

    /**
     *
     * @param height: 키
     * @param weight: 몸무게
     * @return BMI: BMI
     */
    // calculateBMI 메서드
    public static double calculateBMI(double height, double weight) {
        double BMI;
        BMI = weight / (height * height);
        return BMI;
    }

}

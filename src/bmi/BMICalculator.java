package bmi;

/**
 * 비만지수 계산기
 */
public class BMICalculator {

    /**
     *
     * @param height
     * @param weight
     * @return
     */
    // calculateBMI 메서드
    public static double calculateBMI(double height, double weight) {
        double BMI = 0.0;
        BMI = weight / (height * height);
        return BMI;
    }

}

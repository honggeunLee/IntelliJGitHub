import bmi.BMIUI;
import lotto.LottoBall;
import lotto.LottoMachine;
import lotto.LottoUI;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();
        LottoUI ui = new LottoUI();

        int numOfPlays = ui.getNumOfPlays();
        int money = ui.insertMoney();

        int change = ui.calculateChange(money, numOfPlays);
        if (change < 0) {
            System.out.println("투입된 금액이 부족합니다.");
        } else {
            System.out.println("거스름돈: " + change);
        }

        for (int i = 0; i < numOfPlays; i++) {
            Set<LottoBall> balls = machine.generateLottoBalls();
            ui.outputLottoPaper(balls);
        }

    }
}
import lotto.LottoBall;
import lotto.LottoMachine;
import lotto.LottoUI;

public class Main {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();
        LottoUI ui = new LottoUI();

        int numOfPlays = ui.getNumOfPlays();
        int money;
        int change;

        while (true) {
            money = ui.insertMoney();
            change = ui.calculateChange(money, numOfPlays);

            if (change < 0) {
                System.out.println("투입된 금액이 부족합니다.");
            } else {
                System.out.println("거스름돈: " + change);
                break;
            }
        }

        for (int i = 0; i < numOfPlays; i++) {
            LottoBall[] selectedBalls = machine.selectBalls();
            ui.lottoPaper(selectedBalls);
        }

    }
}
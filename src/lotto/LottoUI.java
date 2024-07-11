package lotto;

import java.util.Scanner;

public class LottoUI {
    private Scanner scanner;

    public LottoUI() {
        scanner = new Scanner(System.in);
    }

    public int getNumOfPlays() {
        System.out.println("1회에 천원입니다. 횟수를 입력하세요.");
        return scanner.nextInt();
    }

    public int insertMoney() {
        System.out.println("금액을 투입해주세요.");
        return scanner.nextInt();
    }

    public int calculateChange(int money, int numOfPlays) {
        int totalCost = numOfPlays * 1000;
        return money - totalCost;
    }

    public void lottoPaper(LottoBall[] balls) {
        System.out.print("로또 번호: ");
        for (LottoBall ball : balls) {
            System.out.print(ball.getNumber() + " ");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
}

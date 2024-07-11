package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoMachine {

    public Set<LottoBall> generateLottoBalls() {
        Set<LottoBall> balls = new HashSet<>();
        Random random = new Random();

        while (balls.size() < 6) {
            int number = random.nextInt(45) + 1;
            balls.add(new LottoBall(number));
        }
        return balls;
    }
}

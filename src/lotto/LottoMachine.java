package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoMachine {
    private ArrayList<LottoBall> balls;

    public LottoMachine() {
        balls = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            balls.add(new LottoBall(i));
        }
    }

    public LottoBall[] selectBalls() {
        Collections.shuffle(balls);
        List<LottoBall> selected = balls.subList(0, 6);
        Collections.sort(selected);
        return selected.toArray(new LottoBall[selected.size()]);
    }
}

package lotto;

public class LottoBall {

    private int num;

    // Constructor
    public LottoBall(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    public int getNum() {
        return num;
    }

}

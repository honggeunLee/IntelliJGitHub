package lotto;

public final class LottoBall implements Comparable<LottoBall> {
    private final int number;

    public LottoBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "number " + number;
    }

    @Override
    public int compareTo(LottoBall other) {
        return Integer.compare(this.number, other.number);
    }
}

package my.stream.utils;

public class LCG {

    private final long a = 252149;
    private final long c = 11;
    private final long m = 2 ^ 48;
    private long x;

    public LCG(long x) {
        this.x = x;
    }

    long next(){

        return x = (a * x + c) % m;
    }
}

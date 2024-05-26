import java.util.*;

public class Randoms implements Iterable<Integer> {
    public static int min, max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int range = max - min + 1;
                return random.nextInt(Math.abs(range)) + min;
            }
        };
    }
}
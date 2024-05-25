import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected int min, max;
    protected Iterator<Integer> randomIterator;

    public Randoms(int min, int max) {
        randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
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
                return randomIterator.next();
            }
        };
    }
}
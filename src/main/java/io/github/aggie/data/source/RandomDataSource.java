package io.github.aggie.data.source;

import java.util.Random;

public class RandomDataSource implements DataSource<Integer> {
    private Random random;

    public RandomDataSource() {
        this.random = new Random();
    }

    @Override
    public Integer dataGenerate() {
        return random.nextInt();
    }
}

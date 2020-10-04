package io.github.aggie.data.source;

import io.github.aggie.data.DataFacade;

import java.util.Random;

public class RandomNumberJava implements DataFacade<Integer> {
    private Random random;

    public RandomNumberJava() {
        this.random = new Random();
    }

    @Override
    public Integer dataGenerate() {
        return random.nextInt();
    }
}

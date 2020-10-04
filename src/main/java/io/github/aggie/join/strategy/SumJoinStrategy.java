package io.github.aggie.join.strategy;

import io.github.aggie.data.source.DataSource;

import java.util.Optional;

public class SumJoinStrategy implements JoinStrategy<Integer> {
    @Override
    public Integer doJoin(DataSource<Integer> data1, DataSource<Integer> data2) {
        Optional<DataSource<Integer>> number1 = Optional.ofNullable(data1);
        Optional<DataSource<Integer>> number2 = Optional.ofNullable(data2);
        Integer result = null;

        if (number1.isPresent() && number2.isPresent()) {
            result = number1.get().dataGenerate() + number2.get().dataGenerate();
        } else {
            throw new IllegalArgumentException("Data should not be empty");
        }
        return result;
    }
}

package io.github.aggie.join.strategy;

import io.github.aggie.data.source.DataSource;

import java.util.Optional;

public class SumJoinStrategy implements JoinStrategy<Integer> {
    @Override
    public Integer dataOperation(DataSource<Integer> data1, DataSource<Integer> data2) {
        Optional<Integer> number1 = Optional.ofNullable(data1.dataGenerate());
        Optional<Integer> number2 = Optional.ofNullable(data2.dataGenerate());
        Integer result = null;

        if (number1.isPresent() && number2.isPresent()) {
            result = number1.get() + number2.get();
        } else {
            throw new IllegalArgumentException("Data should not be empty");
        }
        return result;
    }
}

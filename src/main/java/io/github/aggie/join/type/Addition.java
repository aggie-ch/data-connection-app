package io.github.aggie.join.type;

import io.github.aggie.data.source.DataSource;
import io.github.aggie.join.JoinFacade;

import java.util.Optional;

public class Addition implements JoinFacade<Integer> {
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

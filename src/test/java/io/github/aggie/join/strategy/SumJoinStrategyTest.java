package io.github.aggie.join.strategy;

import io.github.aggie.data.source.ConstantDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumJoinStrategyTest {

    public static final int CONSTANT = 2;
    public static final int EXPECTED_RESULT = 4;

    @Test
    void shouldAddTwoNumbers() {
        // given
        ConstantDataSource<Integer> constantDataSource = new ConstantDataSource<>(CONSTANT);
        SumJoinStrategy sumJoinStrategy = new SumJoinStrategy();

        // when
        Integer result = sumJoinStrategy.doJoin(constantDataSource, constantDataSource);

        // then
        assertEquals(EXPECTED_RESULT, result);
    }

    @Test
    void shouldThrowExceptionWhenFirstDataSourceIsNull() {
        // given
        ConstantDataSource<Integer> constantDataSource = new ConstantDataSource<>(CONSTANT);
        SumJoinStrategy sumJoinStrategy = new SumJoinStrategy();

        // when
        Exception result = assertThrows(IllegalArgumentException.class, () ->
                sumJoinStrategy.doJoin(null, constantDataSource));

        // then
        assertEquals("Data should not be empty", result.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenSecondDataSourceIsNull() {
        // given
        ConstantDataSource<Integer> constantDataSource = new ConstantDataSource<>(CONSTANT);
        SumJoinStrategy sumJoinStrategy = new SumJoinStrategy();

        // when
        Exception result = assertThrows(IllegalArgumentException.class, () ->
                sumJoinStrategy.doJoin(constantDataSource, null));

        // then
        assertEquals("Data should not be empty", result.getMessage());
    }
}

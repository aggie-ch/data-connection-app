package io.github.aggie.join.facade;

import io.github.aggie.data.source.DataSource;
import io.github.aggie.join.strategy.JoinStrategy;

public class JoinDataFacade<T> implements JoinFacade<T> {

    private final DataSource<T> dataSource1;
    private final DataSource<T> dataSource2;
    private final JoinStrategy<T> joinStrategy;

    public JoinDataFacade(DataSource<T> dataSource1, DataSource<T> dataSource2, JoinStrategy<T> joinStrategy) {
        this.dataSource1 = dataSource1;
        this.dataSource2 = dataSource2;
        this.joinStrategy = joinStrategy;
    }

    @Override
    public T doJoin() {
        return joinStrategy.doJoin(dataSource1, dataSource2);
    }
}

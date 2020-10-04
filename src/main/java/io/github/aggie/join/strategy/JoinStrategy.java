package io.github.aggie.join.strategy;

import io.github.aggie.data.source.DataSource;

public interface JoinStrategy<T> {
    T dataOperation(DataSource<T> data1, DataSource<T> data2);
}

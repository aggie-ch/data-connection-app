package io.github.aggie.join;

import io.github.aggie.data.source.DataSource;

public interface JoinFacade<T> {
    T dataOperation(DataSource<T> data1, DataSource<T> data2);
}

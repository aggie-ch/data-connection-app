package io.github.aggie.join;

import io.github.aggie.data.DataFacade;

public interface JoinFacade<T> {
    T dataOperation(DataFacade<T> data1, DataFacade<T> data2);
}

package io.github.aggie.data.source;

public class ConstantDataSource<T> implements DataSource<T> {

    public final T returnValue;

    public ConstantDataSource(T returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public T dataGenerate() {
        return returnValue;
    }
}

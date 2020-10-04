package io.github.aggie;

import io.github.aggie.cfg.ConfigProperties;
import io.github.aggie.data.source.DataSource;
import io.github.aggie.data.source.ApiDataSource;
import io.github.aggie.data.source.RandomDataSource;
import io.github.aggie.join.strategy.JoinStrategy;
import io.github.aggie.join.strategy.SumJoinStrategy;

public class Main {
    public static void main(String[] args) {
        ConfigProperties configProperties = new ConfigProperties();
        JoinStrategy<Integer> joinStrategy = new SumJoinStrategy();
        DataSource<Integer> dataSource1 = new RandomDataSource();
        DataSource<Integer> dataSource2 = new ApiDataSource(configProperties);
        Integer result = joinStrategy.dataOperation(dataSource1, dataSource2);
        System.out.println(result);
    }
}

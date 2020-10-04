package io.github.aggie.join.facade;

import io.github.aggie.cfg.ConfigProperties;
import io.github.aggie.data.source.ApiDataSource;
import io.github.aggie.data.source.DataSource;
import io.github.aggie.data.source.RandomDataSource;
import io.github.aggie.join.strategy.JoinStrategy;
import io.github.aggie.join.strategy.SumJoinStrategy;

public class JoinDataFacadeFactory {

    public JoinDataFacade<Integer> createSumTwoRandomIntegersJoin() {
        ConfigProperties configProperties = new ConfigProperties();
        DataSource<Integer> dataSource1 = new RandomDataSource();
        DataSource<Integer> dataSource2 = new ApiDataSource(configProperties);
        JoinStrategy<Integer> joinStrategy = new SumJoinStrategy();

        return new JoinDataFacade<>(dataSource1, dataSource2, joinStrategy);
    }
}

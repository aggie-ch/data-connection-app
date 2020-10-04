package io.github.aggie;

import io.github.aggie.cfg.ConfigProperties;
import io.github.aggie.data.source.DataSource;
import io.github.aggie.data.source.ApiDataSource;
import io.github.aggie.data.source.RandomDataSource;
import io.github.aggie.join.JoinFacade;
import io.github.aggie.join.type.Addition;

public class Main {
    public static void main(String[] args) {
        ConfigProperties configProperties = new ConfigProperties();
        JoinFacade<Integer> joinFacade = new Addition();
        DataSource<Integer> dataSource1 = new RandomDataSource();
        DataSource<Integer> dataSource2 = new ApiDataSource(configProperties);
        Integer result = joinFacade.dataOperation(dataSource1, dataSource2);
        System.out.println(result);
    }
}

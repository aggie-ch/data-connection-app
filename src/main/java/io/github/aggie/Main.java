package io.github.aggie;

import io.github.aggie.cfg.ConfigProperties;
import io.github.aggie.data.DataFacade;
import io.github.aggie.data.source.RandomNumberAPI;
import io.github.aggie.data.source.RandomNumberJava;
import io.github.aggie.join.JoinFacade;
import io.github.aggie.join.type.Addition;

public class Main {
    public static void main(String[] args) {
        ConfigProperties configProperties = new ConfigProperties();
        JoinFacade<Integer> joinFacade = new Addition();
        DataFacade<Integer> dataSource1 = new RandomNumberJava();
        DataFacade<Integer> dataSource2 = new RandomNumberAPI(configProperties);
        Integer result = joinFacade.dataOperation(dataSource1, dataSource2);
        System.out.println(result);
    }
}

package io.github.aggie;

import io.github.aggie.join.facade.JoinDataFacade;
import io.github.aggie.join.facade.JoinDataFacadeFactory;

public class Main {
    public static void main(String[] args) {
        JoinDataFacadeFactory joinDataFacadeFactory = new JoinDataFacadeFactory();
        JoinDataFacade<Integer> joinDataFacade = joinDataFacadeFactory.createSumTwoRandomIntegersJoin();
        Integer result = joinDataFacade.doJoin();
        System.out.println(result);
    }
}

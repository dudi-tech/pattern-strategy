package tech.dudi.strategy.services.impl;

import org.springframework.stereotype.Component;
import tech.dudi.strategy.services.IRobotStrategy;
import tech.dudi.strategy.utils.RobotType;

@Component
public class RobotKangaroo implements IRobotStrategy {
    @Override
    public RobotType getType() {
        return RobotType.KANGAROO;
    }

    @Override
    public String getWayToMove() {
        return "Salta ...";
    }
}

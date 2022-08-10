package tech.dudi.strategy.services.impl;

import org.springframework.stereotype.Component;
import tech.dudi.strategy.services.IRobotStrategy;
import tech.dudi.strategy.utils.RobotType;

@Component
public class RobotRoomba implements IRobotStrategy {
    @Override
    public RobotType getType() {
        return RobotType.ROOMBA;
    }

    @Override
    public String getWayToMove() {
        return "Se desliza ...";
    }
}

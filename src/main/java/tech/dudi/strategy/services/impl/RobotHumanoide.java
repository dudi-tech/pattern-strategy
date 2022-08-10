package tech.dudi.strategy.services.impl;

import org.springframework.stereotype.Component;
import tech.dudi.strategy.services.IRobotStrategy;
import tech.dudi.strategy.utils.RobotType;

@Component
public class RobotHumanoide implements IRobotStrategy {
    @Override
    public RobotType getType() {
        return RobotType.HUMANOIDE;
    }

    @Override
    public String getWayToMove() {
        return "Por pasos ...";
    }
}

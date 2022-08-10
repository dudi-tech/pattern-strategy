package tech.dudi.strategy.services;

import tech.dudi.strategy.utils.RobotType;

public interface IRobotStrategy {
    RobotType getType();
    String getWayToMove();
}

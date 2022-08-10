package tech.dudi.strategy.utils;

import java.util.Arrays;

public enum RobotType {
    ROOMBA, KANGAROO, HUMANOIDE;

    public static boolean exists(RobotType type){
        return Arrays.stream(RobotType.values()).anyMatch(type::equals);
    }
}

package tech.dudi.strategy.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import tech.dudi.strategy.utils.RobotType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RobotContextService implements InitializingBean {
    private List<IRobotStrategy> robotStrategies;
    private Map<RobotType,IRobotStrategy> map;

    public RobotContextService(List<IRobotStrategy> robotStrategies) {
        this.robotStrategies = robotStrategies;
    }

    @Override
    public void afterPropertiesSet() {
        this.map = new HashMap<>();
        robotStrategies.forEach(robotStrategies -> map.put(robotStrategies.getType(), robotStrategies));
    }

    public String retrieveWayToMove(RobotType robotType){
        if (!RobotType.exists(robotType)){
            return "N/A";
        }
        return this.map.get(robotType).getWayToMove();
    }
}

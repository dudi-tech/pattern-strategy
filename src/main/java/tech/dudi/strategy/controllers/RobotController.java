package tech.dudi.strategy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.dudi.strategy.services.RobotContextService;
import tech.dudi.strategy.utils.RobotType;

@RestController
@RequestMapping("api/")
public class RobotController {
    private RobotContextService robotContextService;

    public RobotController(RobotContextService robotContextService) {
        this.robotContextService = robotContextService;
    }

    @GetMapping("robots/{robot_type}/way-to-move")
    public String getWaytoMove(@PathVariable("robot_type") RobotType robotType){
        return robotContextService.retrieveWayToMove(robotType);
    }
}

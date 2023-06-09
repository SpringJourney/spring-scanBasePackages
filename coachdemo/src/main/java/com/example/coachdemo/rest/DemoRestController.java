package com.example.coachdemo.rest;

import com.example.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private final Coach myCoach;

    @Autowired
    public DemoRestController(final Coach theCoach) {
        myCoach = theCoach;
    }
    
    // setter injection
    // public void setCoach(Coach theCoach) {
    //    myCoach = theCoach;
    // }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}

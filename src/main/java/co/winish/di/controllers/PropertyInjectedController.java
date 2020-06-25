package co.winish.di.controllers;

import co.winish.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier(value = "propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}

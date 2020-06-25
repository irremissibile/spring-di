package co.winish.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Aloha from SetterInjectedGreetingService";
    }
}

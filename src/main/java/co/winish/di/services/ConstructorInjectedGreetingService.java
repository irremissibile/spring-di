package co.winish.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Aloha from ConstructorInjectedGreetingService";
    }
}

package co.winish.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo in Spanish";
    }
}

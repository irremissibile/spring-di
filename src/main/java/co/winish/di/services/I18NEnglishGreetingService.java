package co.winish.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello in English";
    }
}


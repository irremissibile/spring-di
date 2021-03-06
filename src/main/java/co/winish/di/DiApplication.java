package co.winish.di;

import co.winish.di.controllers.*;
import co.winish.di.examples.FakeDataSource;
import co.winish.di.examples.SecondFakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        SecondFakeDataSource secondFakeDataSource = ctx.getBean(SecondFakeDataSource.class);
        System.out.println(secondFakeDataSource.getUser());
        System.out.println(secondFakeDataSource.getPassword());
        System.out.println(secondFakeDataSource.getUrl());

        /*
        System.out.println("### Music Example ###");
        MusicController musicController = (MusicController) ctx.getBean("musicController");
        System.out.println(musicController.getBestGenre());


        System.out.println("### I18N Example ###");
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayHello());


        System.out.println("### Primary bean ###");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("### Property ###");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        System.out.println("### Setter ###");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        System.out.println("### Constructor ###");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());
        */
    }
}

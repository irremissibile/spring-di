package co.winish.di.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("Inside the LifeCycleDemoBean constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Inside the @PostConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Inside the @PreDestroy method");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LifeCycleDemoBean name has been set: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleDemoBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleDemoBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context has been set");
    }
}

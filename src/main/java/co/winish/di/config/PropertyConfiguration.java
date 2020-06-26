package co.winish.di.config;

import co.winish.di.examples.FakeDataSource;
import co.winish.di.examples.SecondFakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:seconddatasource.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:seconddatasource.properties")
})
public class PropertyConfiguration {

    @Value("${di.username}")
    String user;
    @Value("${fake.password}")
    String password;
    @Value("${fake.dburl}")
    String dburl;

    @Value("${second.user}")
    String secondUser;
    @Value("${second.password}")
    String secondPassword;
    @Value("${second.dburl}")
    String secondUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);
        return fakeDataSource;
    }

    @Bean
    public SecondFakeDataSource secondFakeDataSource() {
        SecondFakeDataSource secondFakeDataSource = new SecondFakeDataSource();
        secondFakeDataSource.setUser(secondUser);
        secondFakeDataSource.setPassword(secondPassword);
        secondFakeDataSource.setUrl(secondUrl);
        return secondFakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

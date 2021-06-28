package com.alexanastasyev.spring.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(dogBean());
    }

}

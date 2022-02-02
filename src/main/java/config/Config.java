package config;

import domain.Parrot;
import domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: SpringBean_AutoWiring
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

@Configuration
public class Config {

    // Create Parrot bean
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    // Create Person bean
    @Bean
    public Person person(Parrot p) {
        Person person = new Person();
        person.setName("Tom");
        person.setParrot(p);
        return person;
    }
}

package eu.oezgue.quickstart.Example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenschConfig {

    @Bean
    public Student student(){
        return new Student("Marc");
    }

    @Bean
    public Mensch mensch(Student student){
        return new Mensch(student);
    }
}

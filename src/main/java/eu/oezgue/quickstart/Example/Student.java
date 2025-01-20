package eu.oezgue.quickstart.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    String name = "Patrick";

    public Student (@Value("${my.custom.student}") String name){
        this.name = name;
    }

    public void sprich(){
        System.out.println("ich bin der Student " + this.name);
    }
}

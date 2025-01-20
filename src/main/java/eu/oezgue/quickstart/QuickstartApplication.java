package eu.oezgue.quickstart;

import eu.oezgue.quickstart.Example.Mensch;
import eu.oezgue.quickstart.Example.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
		System.out.println("hello");
		Mensch mensch = new Mensch(new Student("Patrick"));
		mensch.sprich();
	}

}

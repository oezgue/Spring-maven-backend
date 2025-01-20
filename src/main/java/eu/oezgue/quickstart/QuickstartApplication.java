package eu.oezgue.quickstart;

import eu.oezgue.quickstart.Example.Mensch;
import eu.oezgue.quickstart.Example.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication implements CommandLineRunner {
	@Autowired
	Mensch mensch;

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
		//System.out.println("hello");
		//Mensch mensch = Mensch(new Student("Patrick"));
		//this.mensch.sprich();
	}


	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hello Commander");
		this.mensch.sprich();
	}
}

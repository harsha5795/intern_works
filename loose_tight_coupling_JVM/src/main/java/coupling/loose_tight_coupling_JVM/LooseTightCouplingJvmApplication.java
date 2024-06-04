package coupling.loose_tight_coupling_JVM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooseTightCouplingJvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LooseTightCouplingJvmApplication.class, args);
		System.out.println("Hello modified");
		System.out.println("from the ram branch");
		System.out.println("hey harsha");
	}

}

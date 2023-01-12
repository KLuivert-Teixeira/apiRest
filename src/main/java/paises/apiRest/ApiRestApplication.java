package paises.apiRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories("paises.apiRest.*")
@EntityScan("paises.apiRest.*")
public class ApiRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiRestApplication.class, args);
	}

}

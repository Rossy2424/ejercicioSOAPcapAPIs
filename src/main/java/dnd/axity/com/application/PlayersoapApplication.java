package dnd.axity.com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dnd.axity.com")
@EnableJpaRepositories("dnd.axity.com.persistence")
@EntityScan("dnd.axity.com.model")
public class PlayersoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersoapApplication.class, args);
	}

}

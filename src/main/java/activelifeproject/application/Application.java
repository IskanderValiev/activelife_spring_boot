package activelifeproject.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//says that this application was created with spring boot
@SpringBootApplication

//components package
@ComponentScan("activelifeproject")

//repositories package
@EnableJpaRepositories(basePackages = "activelifeproject.repositories")

//entities package
@EntityScan(basePackages = "activelifeproject.models")
public class Application {
    public static void main(String[] args) throws Exception{

        //starting point spring boot application
        SpringApplication.run(Application.class, args);
    }
}

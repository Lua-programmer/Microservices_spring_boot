package io.github.luaprogrammer.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"io.github.luaprogrammer.model"})
@EnableJpaRepositories({"io.github.luaprogrammer.repository"})
//@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("io.github.luaprogrammer")
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}

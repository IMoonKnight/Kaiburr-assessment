package com.Kaiburrassessment.Springboot;

import com.Kaiburrassessment.Springboot.model.KaiburRepository;
import com.Kaiburrassessment.Springboot.model.assessment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(
KaiburRepository repository
){
		return args -> {

			var values = assessment.builder()
					.name("my centos")
					.id("123")
					.language("java")
					.framework("Spring")
					.build();

			repository.insert(values);

		};
}
}

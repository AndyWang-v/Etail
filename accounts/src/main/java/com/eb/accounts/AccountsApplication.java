package com.eb.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") /* Activate the JPA Auditor leveraging the bean with name "auditAwareImpl" */
@OpenAPIDefinition(
		info = @Info(
			title = "Accounts microservice REST API DOC",
			version = "v1",
			description = "EB Accounts microservice REST API DOC",
			contact = @Contact(
					name = "Di",
					email = "0theskyrider0@gmail.com",
					url = "https://eb.com"),
			license = @License(
					name = "Apache 2.0",
					url = "https://eb.com/license"
			)
		),
		externalDocs = @ExternalDocumentation(
				description = "Accounts microservice REST API DOC",
				url = "https://eb.com/docs"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

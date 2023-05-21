package net.javamicro.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@OpenAPIDefinition(info = @Info(title = "Department-Service REST APIS",
                                description = "Department Service REST APIs documentation",
		                        version = "v1.0",
		                        contact = @Contact(name = "LyTa", email = "ly@mail.com", url = "https://www.lyta.com"),
		                        license = @License(name = "Apache 2.9", url = "https://lyta.com")
                                ),
                   externalDocs = @ExternalDocumentation(
						   description = "Department-service Docs",
						   url = "https://lyta.com"
				   )
)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}

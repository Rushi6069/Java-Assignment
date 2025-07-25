package com.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
@Configuration
public class OpenApiConfig {
	
	@Bean
    public OpenAPI employeeApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Employee Management API")
                .description("API for managing employee data with CRUD operations")
                .version("1.0")
                .contact(new Contact()
                    .name("Hrushikesh Labhade")
                    .email("hrushikesh@example.com"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://springdoc.org")));
        }
    }


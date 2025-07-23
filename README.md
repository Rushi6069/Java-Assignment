# Employee Management REST API

This is a simple Spring Boot application that exposes RESTful APIs to manage employee records. It uses PostgreSQL for data persistence and includes Swagger documentation, validation, and testing.

## Features

- Create, Read, Update, Delete (CRUD) operations on employees
- Input validation using Hibernate Validator
- Auto-generated API documentation with Swagger UI (springdoc-openapi)
- PostgreSQL database integration

## Project Structure

  ├── main
│ ├── java
│ │ └── com.example.employeeapi
│ │ ├── controller # REST controllers
│ │ ├── service # Business logic
│ │ ├── repository # JPA repository interfaces
│ │ ├── model # JPA entities
│ │ └── config # Swagger configuration
│ └── resources
│ └── application.properties


## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate Validator
- PostgreSQL
- Swagger/OpenAPI (springdoc-openapi)


### Prerequisites

- Java 17+
- Maven 3+
- PostgreSQL installed and running locally
- Eclipse IDE


### Setup Instructions

**Clone the Repository:**

   git clone https://github.com/Rushi6069/Java-Assignment.git
   cd Java-Assignment

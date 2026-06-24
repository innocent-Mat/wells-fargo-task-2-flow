# Wells Fargo Financial Advisor Management System

## Overview

This project is a Spring Boot application developed to model a financial advisor management system using the Java Persistence API (JPA). The application manages financial advisors, their clients, client portfolios, and investment securities.

The purpose of this project is to demonstrate object-relational mapping (ORM) using JPA entities and relationships.

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Maven
* Visual Studio Code / IntelliJ IDEA

## Data Model

The system contains the following entities:

### Advisor

Represents a financial advisor who manages multiple clients.

### Client

Represents a customer assigned to a financial advisor.

### Portfolio

Represents an investment portfolio owned by a client.

### Security

Represents financial securities contained within a portfolio.

## Entity Relationships

* One Advisor manages many Clients.
* One Client owns one Portfolio.
* One Portfolio contains many Securities.

## Project Structure

src/main/java/com/wellsfargo/counselor

* Entrypoint.java
* entity/

  * Advisor.java
  * Client.java
  * Portfolio.java
  * Security.java

## Features

* JPA entity mapping
* Auto-generated primary keys
* One-to-many relationships
* One-to-one relationships
* Many-to-one relationships
* Constructors, getters, and setters

## Running the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA or VS Code.
3. Ensure Java 17 is installed.
4. Configure the JAVA_HOME environment variable.
5. Run the application using:

mvn spring-boot:run

or

mvnw.cmd spring-boot:run

## Author

By: Innocent Joseph
gitHub: https://github.com/innocent-Mat/wells-fargo-task-2-flow .git

Developed as part of the Wells Fargo JPA data modeling assignment.

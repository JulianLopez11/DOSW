# DOSW - Desarrollo y Operaciones de Software

Collection of laboratories, workshops, and exams of the subject "Desarrollo y Operaciones de Software" at the Escuela Colombiana de Ingeniería Julio Garavito (ECI).

## Purpose

This repository documents the learning process of the DOSW university course, focusing on software development lifecycle, design patterns, testing, and cloud deployment. It includes laboratories, evaluative workshops, and exams that demonstrate proficiency in Java, Spring Boot, MongoDB, and CI/CD practices.

Feel free to explore and use any of the resources here for non-commercial and educational purposes. If you find something useful, you're welcome to reference it in your own learning journey.

---

## Labs & Workshops for Learning Technologies

The first labs and workshops are dedicated to learning various technologies and design patterns relevant to the course.

### Lab 3: Introduction to Maven, Testing & Design Patterns

Introduction to Maven project structure, JUnit 5 testing, and static analysis with SonarQube. Implementation of a banking system demonstrating:

- Facade pattern for system abstraction (`BankifyFacade`)
- Planning Poker with Fibonacci number validation
- Single Responsibility Principle (SOLID)
- Unit testing with Jacoco code coverage analysis
- Static code analysis with SonarQube

---

### Design Pattern Exercises

Standalone Java exercises reinforcing GOF design patterns, each applied to a concrete use case:

| Exercise | Use Case | Patterns |
|---|---|---|
| Urban Transport | Vehicle management | Factory Method |
| Smart Bags | Travel bag inventory | Abstract Factory · Singleton |
| Veterinary Clinic | Pet services | Factory Method · Decorator |
| Online Library | Digital & physical loans | Template Method · Proxy |
| Travel System | Travel package builder | Abstract Factory · Strategy |


---

### Workshop 1: Stock Monitoring System

System for monitoring product stock with:

- Observer pattern implementation (`AgentWarning`, `AgentLog`)
- Dependency injection
- SOLID principles (Open/Closed, Single Responsibility)
- JUnit testing with Jacoco coverage
- SonarQube static analysis
- UML diagrams and use case documentation


---

### Workshop 2: Financial Reports System

A financial reporting system built with Spring Boot and MongoDB:

- Decorator pattern for extensible report generation (charts, watermarks, statistics, PDF/Excel export)
- Builder pattern for flexible object construction
- Streams API for filtering and data processing
- MongoDB persistence
- Swagger/OpenAPI documentation
- SonarQube static analysis
- Branching strategy with `develop` and `feature` branches


---

### API MasterChef

A complete REST API for managing MasterChef recipes — the vacation week workshop:

- Spring Boot with Java 17
- MongoDB for data persistence
- MapStruct for DTO mapping
- Lombok for boilerplate reduction
- Swagger/OpenAPI documentation
- CI/CD with GitHub Actions and Azure deployment
- Unit testing


---

### API Comidas Rapidas

A REST API for a fast food ordering platform:

- Spring Boot with Java 17
- MongoDB for data persistence
- MapStruct for DTO mapping
- Multi-role service layer (Admin, Client)
- Full CRUD for Users, Products, Menus, Orders and Payments
- DTO architecture (Request/Response)

---

## Exams

The exams are designed to assess individual technical skills, ensuring full knowledge of the subject matter.

### Exam 1 — Notification System (Parcial Corte 1)

A non-REST application implementing a multi-channel notification system:

- Strategy pattern for multiple notification channels (email, SMS, push)
- Factory Method pattern for notification creation
- SOLID principles (Interface Segregation, Single Responsibility)
- UML diagrams: context, use cases, and class diagram
- Jacoco and SonarQube integration

---

## Technologies Used

- Java 17 / 21
- Spring Boot 3.x
- MongoDB
- Maven
- JUnit 5 + Jacoco
- SonarQube
- MapStruct
- Lombok
- Swagger / OpenAPI
- Docker
- Azure
- GitHub Actions

---

## License

Distributed under the MIT License. See `LICENSE` for more information.

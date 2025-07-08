# CRUD_SpringBoot
  This project is a foundational Spring Boot application designed to illustrate the fundamental Create, Read, Update, and Delete (CRUD) operations. It
      serves as a clear and concise example for developers looking to understand how to build a basic RESTful API with Spring Boot for data management.
   
  ## Features
   **Create:** Add new employee records to the database.
      **Read:** Retrieve a list of all employees or fetch a single employee by their ID.
      **Update:** Modify existing employee details.
      **Delete:** Remove employee records from the database.
   =  **RESTful API:** Exposes standard HTTP endpoints for interacting with employee data.
   Technologies Used
   
   **Java 17+**: The core programming language.
   **Spring Boot**: Framework for building robust, production-ready Spring applications.
   **Maven**: Dependency management and build automation tool.
   **Spring Data JPA**: Simplifies data access with JPA repositories.
   **H2 Database (in-memory)**: Used for development and testing, providing a lightweight and easy-to-use database. (Can be easily configured for
      other databases like MySQL, PostgreSQL, etc.)
   **Lombok**: Reduces boilerplate code for Java classes.
   
   ## Getting Started
   
   These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
   
   ### Prerequisites
   
   Java Development Kit (JDK) 17 or higher
   Maven 3.6.x or higher
   Git
   
   ### Installation
   **Clone the repository:**

    git clone https://github.com/MehediHasanRapiIIT/CRUD_SpringBoot.git
      cd CRUD_SpringBoot

   **Build the project:**

      mvn clean install

   ### Running the Application
   
   You can run the Spring Boot application using Maven:

  mvn spring-boot:run


  
  The application will start on `http://localhost:8080` by default.
    
   Usage
Once the application is running, you can interact with the RESTful API using tools like Postman, Insomnia, or `curl`.
    The primary entity is `Employee`, with the following example endpoints:
   **GET /api/employees**: Retrieve all employees.
   **GET /api/employees/{id}**: Retrieve an employee by ID.
   **POST /api/employees**: Create a new employee (send JSON payload in request body).
   **PUT /api/employees/{id}**: Update an existing employee (send JSON payload in request body).
   **DELETE /api/employees/{id}**: Delete an employee by ID.

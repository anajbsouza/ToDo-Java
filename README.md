# 📍 ToDo-Java

ToDo-Java is a simple **task management API** built with **Spring Boot**, **Spring Data JPA**, and **H2 Database**. This project was created for **learning purposes** and serves as a hands-on implementation of RESTful APIs, database integration, and automated testing.

## 🚀 Features
- ✅ CRUD operations for managing tasks  
- ✅ Data persistence with **H2 in-memory database**  
- ✅ Automated tests using **Spring Boot Test** and **WebTestClient**  
- ✅ API documentation with **Swagger (OpenAPI 3)**  

---

## 🛠️ Installation & Setup

### 📌 1. Clone the repository
```bash
git clone https://github.com/anajbsouza/ToDo-Java.git
cd ToDo-Java
```

### 📌 2. Configure dependencies
Ensure you have **Java 17+** and **Maven** installed. Then, install dependencies:
```bash
mvn clean install
```

### 📌 3. Run the application
```bash
mvn spring-boot:run
```
The server will start at **[http://localhost:8080](http://localhost:8080)** 🚀.

---

## 📀 Swagger API Documentation

This project includes **Swagger UI** for API testing and documentation.

Once the application is running, you can access:
- **Swagger UI:** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  
- **OpenAPI JSON:** [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

---

## 🧠 Running Tests

The project includes **unit and integration tests** using **JUnit 5** and **WebTestClient**.

Run all tests with:
```bash
mvn test
```
Each test runs in **an isolated in-memory H2 database**, ensuring that the main database remains untouched.

---

## ⚙️ API Endpoints

| Method   | Endpoint       | Description          |
|----------|--------------|----------------------|
| `POST`   | `/todos`     | Create a new task   |
| `GET`    | `/todos`     | Get all tasks       |
| `PUT`    | `/todos/{id}` | Update a task by ID |
| `DELETE` | `/todos/{id}` | Delete a task by ID |

Use **Swagger UI** to test these endpoints interactively.

---

## 📂 Project Structure

```
ToDo-Java/
│── src/main/java/todo/todo
│   ├── controller/   # Handles API requests
│   ├── entity/       # Defines the data model
│   ├── repository/   # Manages database interactions
│   ├── service/      # Business logic layer
│── src/test/java/todo/todo
│   ├── TodoApplicationTests.java  # Automated tests
│── pom.xml          # Maven dependencies
│── application.properties  # Database configuration
│── README.md        # Project documentation
```

---

## 🛠️ Technology Stack
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring Boot Actuator**
- **Spring Boot DevTools**
- **Spring Boot Validation**
- **Spring Boot Test**
- **Spring Boot WebFlux (for tests)**
- **H2 Database**
- **PostgreSQL Database (runtime)**
- **SpringDoc OpenAPI 3 (Swagger UI)**

---

## 💡 Contributing
This project is for **learning purposes**, but feel free to fork it and experiment!  
If you find any bugs or have suggestions, feel free to **open an issue**.

---

### 🎉 Happy Coding! 🚀


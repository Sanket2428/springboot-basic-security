# 🔐 springboot-basic-security

A **Spring Boot backend application** that demonstrates **Spring Security with database-backed authentication**, **BCrypt password encryption**, and **role-based authorization** using Spring Data JPA.

This project is suitable for **learning Spring Security**, **interview preparation**, and **backend portfolio showcasing**.

---

## 🚀 Features

- User registration API
- Secure password storage using BCrypt
- Database-based authentication
- Role-based authorization (USER / ADMIN)
- Spring Data JPA integration
- Stateless session management
- REST API–friendly security configuration
- Clean and layered architecture

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL / H2 Database
- Maven

---

## 📂 Project Structure

```
SpringSecurity
│── pom.xml
│── mvnw
│── mvnw.cmd
│── README.md
│
└── src
    └── main
        ├── java
        │   └── com.sk.SpringSecurity
        │       ├── config
        │       │   └── SecurityConfig.java
        │       ├── controller
        │       │   └── MyController.java
        │       ├── entity
        │       │   └── Users.java
        │       ├── repository
        │       │   └── UserRepository.java
        │       └── SpringSecurityApplication.java
        │
        └── resources
            └── application.properties


```
---


---

## 🔐 Security Overview

- Uses **Spring Security 6** with `SecurityFilterChain`
- Passwords are encrypted using `BCryptPasswordEncoder`
- Authentication is handled using database tables:
  - `users`
  - `authorities`
- Uses `JdbcUserDetailsManager` for database-based authentication
- Stateless session policy (no cookies, REST API friendly)

---

## 📌 API Endpoints

| HTTP Method | Endpoint | Description | Access |
|------------|---------|-------------|--------|
| POST | `/public/register` | Register new user | Public |
| GET  | `/user` | USER role endpoint | USER |
| GET  | `/admin` | ADMIN role endpoint | ADMIN |

---

## 🧪 Sample User Registration Request

**POST** `/public/register`

```json
{
  "username": "sanket",
  "password": "password123",
  "role": "USER"
}
```
---
## ▶️ How to Run the Project
## 1️⃣ Clone the Repository
```
git clone https://github.com/Sanket2428/springboot-basic-security.git

```
## 2️⃣ Navigate to Project Directory
```
cd springboot-basic-security
```
## 3️⃣ Configure Database
Update `application.properties:`
```

spring.datasource.url=jdbc:mysql://localhost:3306/sample
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```



## 4️⃣ Run the Application
```
mvn spring-boot:run
```
Application will start on:


```
http://localhost:8080
```
## 🔄 Application Flow
- Client sends request to `/public/register`

- Password is encrypted using BCrypt

- User data is stored in the database

- Spring Security loads user details from DB

- Role-based authorization is applied on endpoints

## 🧠 Learning Outcomes
- Understanding Spring Security fundamentals

- Implementing database authentication

- Password encryption with BCrypt

- Role-based authorization

- Secure REST API development

- Clean backend project structure

## 🚫 Git Ignore (Recommended)
Do not commit the following files/folders:
```

/target
/.classpath
/.project
/.settings
```

## 👨‍💻 Author

Sanket Khavale

Backend Developer | Java | Spring Boot | Spring Security

🔗 GitHub: https://github.com/Sanket2428


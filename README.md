# 🧠 Quiz App – Spring Boot

A simple and beginner‑friendly **Quiz Application Backend** built using **Java and Spring Boot**. This project exposes REST APIs to create quizzes, manage questions, and fetch quiz data. It is ideal for learning **Spring Boot, REST APIs, and database integration**.

This project is commonly used as a backend service that can be connected to any frontend (React, Angular, mobile apps, etc.).

---

## 🚀 Features

* Create and manage **quiz questions**
* Create quizzes using existing questions
* Fetch quizzes through REST APIs
* Clean project structure following **Spring Boot best practices**
* Easy to extend with authentication, UI, and more features

---

## 🛠 Technologies Used

* **Java** – Core programming language
* **Spring Boot** – Backend framework
* **Spring Data JPA** – Database interaction
* **Hibernate** – ORM framework
* **Maven** – Dependency management
* **MySQL / H2** – Database (configurable)

---

## 📁 Project Structure

```
quiz-app-spring
│
├── src/main/java
│   └── com.example.quizapp
│       ├── controller   # REST controllers
│       ├── service      # Business logic
│       ├── repository   # Database layer
│       └── model        # Entity classes
│
├── src/main/resources
│   ├── application.properties
│
└── pom.xml
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/navinreddy20/quiz-app-spring.git
cd quiz-app-spring
```

### 2️⃣ Open in IDE

* Open the project in **IntelliJ IDEA**, **Eclipse**, or **VS Code**
* Make sure **Java** and **Maven** are installed

### 3️⃣ Configure Database

Edit `src/main/resources/application.properties`

Example (PostgreSQL):

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/quizdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

(You can also use **H2** for testing)

---

### 4️⃣ Run the Application

```bash
mvn spring-boot:run
```

OR simply run the **main class** from your IDE.

The application will start on Postman due to frontend of the project is not developed yet:

```
http://localhost:2109
```

---

## 🔗 API Endpoints (Examples)

### 📌 Question APIs

* **Add a question**

```
POST http://localhost:2109/question/addQuestion
```
* **delete a question**

```
POST http://localhost:2109/question/deleteQuestion
```

* **Get all questions**

```
GET http://localhost:2109/question/allQuestions
```
* **Get  questions by category**

```
GET http://localhost:2109/question/category/Python
```

---

### 📌 Quiz APIs

* **Create a quiz**

```
POST http://localhost:2109/quiz/create?category=Java&numQ=5&title=JQuiz
```
* **Get Quiz Questions**

```
GET http://localhost:2109/quiz/get/1
```
* **Submit quiz answers**

```
POST http://localhost:2109/quiz/submit/1
```

You can test these APIs using **Postman** .

---

## 🧠 Learning Objectives

This project helps you understand:

* How **Spring Boot REST APIs** work
* How to structure a real backend project
* How to use **JPA & Hibernate**
* How controllers, services, and repositories interact

---

## 📈 Future Improvements

* Add user authentication (JWT)
* Add frontend (React / Angular)
* Add quiz timer and score calculation
* Dockerize the application

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repo, improve the code, and submit a pull request.

---

## 📄 License

This project is open‑source and available under the **MIT License**.

---

### ⭐ If you like this project, don’t forget to give it a star on GitHub!

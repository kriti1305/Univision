# 🎓 Univision — Student Feedback & College Discovery System

**Univision** is a Java-based desktop application designed to help students explore colleges, manage student information, and share feedback through an interactive graphical interface.

The application combines **Java Swing**, **MySQL**, and **JDBC** to provide features such as user authentication, student management, college discovery, and student reviews.

---

## 🚀 Features

### 🔐 User Authentication

* User signup and login
* Forgot password functionality
* Session-based access to application features
* Splash and loading screens

### 👨‍🎓 Student Management

* Add student details
* View student details
* Update student information
* Delete student records

### 🏫 College Discovery

Students can explore colleges across multiple categories:

* Engineering Colleges
* Medical Colleges
* Management Colleges
* Design Colleges
* Top Colleges

### ⭐ Student Reviews

* Submit college reviews
* View feedback-related information
* Interactive review interface

### 🖥️ Desktop GUI

* Java Swing-based graphical interface
* Multiple interactive screens
* Custom images and UI elements
* Navigation between application modules

---

## 🛠️ Tech Stack

| Technology       | Usage                        |
| ---------------- | ---------------------------- |
| **Java**         | Core application development |
| **Java Swing**   | Graphical User Interface     |
| **MySQL**        | Database management          |
| **JDBC**         | Java–MySQL connectivity      |
| **NetBeans**     | Development environment      |
| **Git & GitHub** | Version control              |

---

## 🏗️ Project Structure

```text
Univision/
│
├── src/
│   ├── Univision/
│   │   ├── AddStudent.java
│   │   ├── Conn.java
│   │   ├── Dashboard.java
│   │   ├── DeleteDetails.java
│   │   ├── ForgotPassword.java
│   │   ├── Loading.java
│   │   ├── Login.java
│   │   ├── Signup.java
│   │   ├── Splash.java
│   │   ├── UpdateStudent.java
│   │   ├── viewStudentDetails.java
│   │   ├── addReview.java
│   │   ├── topColleges.java
│   │   ├── engineeringColleges.java
│   │   ├── medicalColleges.java
│   │   ├── managementColleges.java
│   │   └── designColleges.java
│   │
│   └── images/
│       └── Application assets
│
├── nbproject/
├── build.xml
├── manifest.mf
└── .gitignore
```

---

## 🔄 Application Flow

```text
        ┌───────────────┐
        │    Splash     │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │     Login     │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │   Dashboard   │
        └───────┬───────┘
                │
       ┌────────┼─────────┐
       ↓        ↓         ↓
  Student    Colleges   Reviews
  Management Discovery
       │        │         │
       ↓        ↓         ↓
    Add/View   Explore   Add
    Update     Categories Review
    Delete
```

---

## 💾 Database

The application uses **MySQL** as its backend database and connects to it using **JDBC**.

The `Conn.java` class handles the database connection used by the application.

Before running the application, configure the database connection according to your local MySQL setup.

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/kriti1305/Univision.git
```

### 2. Open the project

Open the project in **NetBeans**.

### 3. Configure MySQL

* Install and start MySQL.
* Create the required database.
* Configure the database credentials in the connection class.
* Update the database URL, username, and password according to your system.

### 4. Build and Run

Run the project from NetBeans using:

```text
Run → Run Project
```

---



## 📚 Key Concepts Demonstrated

This project demonstrates practical implementation of:

* Object-Oriented Programming in Java
* Java Swing GUI development
* Event-driven programming
* JDBC database connectivity
* MySQL CRUD operations
* User authentication
* Form validation
* Multi-screen desktop application design
* Separation of application modules
* Git/GitHub version control

---

## 👩‍💻 Author

**Kriti Sharma**

Computer Science Engineering Student

GitHub: [@kriti1305](https://github.com/kriti1305)

---

## 📌 Project Status

**Completed — Academic/Portfolio Project**

Future improvements could include migrating the application to a web-based architecture, improving database security, and adding more advanced college recommendation and review features.

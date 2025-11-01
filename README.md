# 🔐 Spring Boot JWT Security Project

A **fully functional secure REST API** built using **Spring Boot 3, Spring Security 6, and JWT (JSON Web Token)**.  
This project includes **Swagger UI**, **Global Exception Handling**, and a clean **layered architecture** — perfect for **production use** and **interview preparation** 🚀  

---

## 🧱 Tech Stack

| Technology | Purpose |
|-------------|----------|
| ☕ Java 17 | Core language |
| 🌱 Spring Boot 3 | Application framework |
| 🛡️ Spring Security 6 | Authentication & Authorization |
| 🔑 JWT | Token-based authentication |
| 🗄️ MySQL | Database |
| 📘 Swagger (OpenAPI 3) | API documentation |
| ⚙️ Maven | Build automation |

---

## 🚀 Features

✅ User Registration & Login  
✅ JWT Token-based Authentication  
✅ Role-based Authorization (User/Admin)  
✅ Swagger UI Integration with JWT Support  
✅ Global Exception Handling  
✅ RESTful APIs using DTOs and Validation  
✅ Production-ready layered structure (Controller → Service → Repository)

---

## 🧭 Authentication Flow

### 1️⃣ Register a New User  
**Endpoint:** `/api/auth/register`  
Send JSON body with username, email, password, and role.  
✅ Successfully created users are stored in the database.

---

### 2️⃣ Login to Get JWT Token  
**Endpoint:** `/api/auth/login`  
Send your credentials → Get a signed JWT token in response.

4. Hit **Authorize** → Now access all secured endpoints 🎯  

---

## ⚙️ Project Setup

### 1. Clone Repository  
```bash
git clone https://github.com/unaiz/springboot-jwt-security.git


---

### 3️⃣ Use JWT Token in Swagger UI  
1. Copy your token from the login response  
2. Click on the **Authorize** 🔒 button in Swagger  
3. Paste as:






Learning Highlights

Secure REST APIs with JWT Authentication

Stateless Session Management

Role-based Access Control (RBAC)

Centralized Exception Handling using @RestControllerAdvice

DTO pattern and Response Wrappers

Swagger UI Integration with JWT Authorization



🌍 Author

👨‍💻 #UNAIZ SIDDIQUI
💬 Aspiring Java Backend Developer | Spring Boot | DSA Learner

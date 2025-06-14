# Java Microservices Architecture with CI/CD via GitHub Actions

This project demonstrates a basic **Java-based microservices architecture** integrated with **CI/CD using GitHub Actions**.

---
## 🧱 Microservice Architecture Overview

                      Web Browser
                           ↓
           http://localhost:8081/welcome/1
                           ↓
            [Aggregator Service - port 8081]
                           ↓
    ┌─────────────────────┴─────────────────────┐
    ↓                                           ↓
    ↓                                           ↓
[User Service - port 8083]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Greeting Service - port 8082]



---

## 📦 Microservices

1. **Aggregator Service**
   - Exposed to public
   - Acts as the **entry point** for users
   - Aggregates responses from other services

2. **User Service**
   - Backend-only service (not directly exposed to public)
   - Provides user details based on `userId`
   - Communicates only with Aggregator Service

3. **Greeting Service**
   - Backend-only service
   - Generates a greeting message for a given user name
   - Communicates only with Aggregator Service

---

## 🚀 CI/CD

- CI/CD is implemented using **GitHub Actions**
- Automatically builds and tests services on every push or PR
- Can be extended for Docker builds, deployments, and more

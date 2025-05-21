# Spring-Boot-Study-Project


# Spring Boot Projects

This repository contains two basic Spring Boot applications developed for learning and demonstration purposes:

1. **Greeting API** – A simple REST API to return greeting messages using GET methods.
2. **MySQL CRUD API** – A basic RESTful CRUD application connected to a MySQL database.

---

## 🧪 Project 1: Greeting API (`springboot-greeting-api`)

### 📋 Description
A simple Spring Boot project that demonstrates how to:
- Create REST endpoints using `@RestController`
- Handle GET requests
- Read query parameters, optional parameters, and path variables

### 📁 Endpoints

| Method | Endpoint            | Description                                |
|--------|---------------------|--------------------------------------------|
| GET    | `/hello`            | Returns a simple hello message             |
| GET    | `/greet?name=XYZ`   | Returns greeting using query parameter     |
| GET    | `/greet2`            | Returns greeting with default name         |
| GET    | `/greet/{name}`     | Returns greeting using path variable       |


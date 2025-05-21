# Spring-Boot-Study-Project


# Spring Boot Projects

This repository contains basic Spring Boot applications developed for learning and demonstration purposes:

**Greeting API** – A simple REST API to return greeting messages using GET methods.

---

## 🧪 Project: Greeting API

### 📋 Description
A simple Spring Boot project that demonstrates how to:
- Create REST endpoints using `@RestController`
- Handle both `GET` and `POST` requests
- Read query parameters, optional parameters, and path variables
- Return personalized greeting messages
  
### 📁 Endpoints
#### ✅ GET Endpoints
| Method | Endpoint            | Description                                |
|--------|---------------------|--------------------------------------------|
| GET    | `/hello`            | Returns a simple hello message             |
| GET    | `/greet?name=XYZ`   | Returns greeting using query parameter     |
| GET    | `/greet2`            | Returns greeting with default name         |
| GET    | `/greet/{name}`     | Returns greeting using path variable       |


#### ✅ POST Endpoints

| Method | Endpoint            | Description                                |
|--------|---------------------|--------------------------------------------|
| POST   | `/hello`            | Returns a static welcome message           |
| POST   | `/greet`            | Returns greeting using query parameter     |

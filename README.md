# airbnb-clone
Airbnb-like platform built with Java Spring Boot, focusing on scalable backend APIs, authentication, and booking management.

# 🏨 Airbnb Backend Clone (In Progress)

A **backend-focused Airbnb-style booking platform** designed to demonstrate **real-world system design**, **scalable backend architecture**, and **clean API-driven development** using Java & Spring Boot.

🚧 **Project Status:** In Progress (actively building)

---

## 🚀 Overview

This project simulates a **hotel booking ecosystem** where hotel managers manage inventory and pricing, while guests search hotels, make bookings, and complete payments.
The system is designed with **modularity, scalability, and real production-like flows** in mind.

---

## 🧠 System Architecture

### Key Actors

* **Hotel Manager** – manages hotels, rooms, pricing, and inventory
* **Guest** – searches hotels, books rooms, and makes payments
* **System** – handles pricing, availability, bookings, and background jobs

### Core Modules

* Hotel Management System
* Hotel Search System
* Hotel Booking System
* Inventory Management
* Payment Processing
* Authentication & Authorization

---

## 🛠️ Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Security (JWT)
* JPA / Hibernate

**Database**

* PostgreSQL
* SQL-based relational modeling

**Architecture**

* REST APIs
* Layered Architecture
* Microservice-ready design

**Tools**

* Maven
* Git & GitHub
* Postman
* Docker 

---

## 📦 Core Features

### 🔐 Authentication & Users

* User Signup / Login (JWT-based)
* Role-based access control:

  * `HOTEL_MANAGER`
  * `GUEST`

---

### 🏨 Hotel Management (Hotel Manager)

* Create & manage hotels
* Add room types and room details
* Manage amenities & hotel images
* Manage inventory per date
* Update hotel availability

---

### 🔍 Hotel Search (Guest)

* Search hotels by:
  * City
  * Date range
  * Number of rooms
* View hotel details
* View room details & amenities
* Paginated search results

---

### 📅 Booking System
* Create bookings with:

  * Start date & end date
  * Room type
  * Number of rooms
* Attach multiple guests to a booking
* Booking lifecycle:

  * `CREATED`
  * `CONFIRMED`
  * `FAILED`
  * `CANCELLED`

---

### 💳 Payments

* Payment initiation for bookings
* Integration-ready payment gateway layer
* Booking confirmation after successful payment
* Failed payment handling

---

### 📦 Inventory Management

* Date-wise room availability
* Prevent overbooking
* Atomic reservation during booking flow
* Scheduled job to reset stale bookings

---

## 💡 Pricing System (Design Patterns)

### 🧩 Strategy Pattern

Dynamic pricing based on:

* Base price
* Occupancy rate
* Urgency (near check-in date)
* Holidays
* Discounts/sales

```java
double getPrice(Room room, LocalDate startDate, LocalDate endDate);
```

### 🧩 Decorator Pattern

* Layered price calculation
* Extendable pricing rules without modifying base logic

---

## 🔌 API Design (High Level)

### Auth

* `POST /api/v1/auth/signup`
* `POST /api/v1/auth/login`
* `POST /api/v1/auth/verify`

### Hotel Manager

* `POST /api/v1/admin/hotels`
* `GET /api/v1/admin/hotels/{hotelId}`
* `POST /api/v1/admin/hotels/{hotelId}/rooms`
* `PATCH /api/v1/admin/inventory/{hotelId}/{roomId}/{date}`

### Guest

* `GET /api/v1/hotels/search`
* `GET /api/v1/hotels/{hotelId}`
* `GET /api/v1/hotels/{hotelId}/rooms/{roomId}`

### Booking

* `POST /api/v1/bookings`
* `GET /api/v1/bookings/{bookingId}`
* `PATCH /api/v1/bookings/cancel`
* `POST /api/v1/payments/{bookingId}`

---

## 🔁 Booking Flow (Simplified)

1. Guest searches hotels
2. Selects hotel & room type
3. System checks availability
4. Rooms are temporarily reserved
5. Guest adds details
6. Payment is initiated
7. Booking status updated to **CONFIRMED**

---

## 🧪 Extra Features (Planned)

✔ Booking cancellation with refund logic
✔ Soft delete for hotels & rooms
✔ Audit logs for booking changes
✔ Rate limiting for search APIs
✔ Distributed tracing (Zipkin)
✔ Email notifications (booking confirmation)
✔ Dockerized deployment
✔ CI/CD pipeline

---

## 🎯 Learning Goals

* Design scalable backend systems
* Apply design patterns in real use cases
* Handle concurrency & consistency
* Write clean, maintainable production-ready code


---

## 📌 Why This Project Matters

This project is **not a CRUD app**.
It focuses on:

* Real business flows
* System design decisions
* Data consistency
* Extensibility
* Production-like backend engineering

---

## 👩‍💻 Author
**Kabita Kumari**
Backend Engineer (Java | Spring Boot)




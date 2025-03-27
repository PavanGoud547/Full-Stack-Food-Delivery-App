🍔 Foodies - Full Stack E-Commerce Food Ordering Application
---
## 📝 Overview  
**Foodies** is a **full-stack food ordering web application** designed to provide a seamless online shopping experience for users. The application consists of:

✅ A **React.js frontend** (already deployed)  
✅ A **Spring Boot backend** (must be run locally)  
✅ A **React.js Admin-frontend** (Admin Pannel)  
✅ RESTful API integration for seamless communication  
✅ Secure user authentication & role-based access 
✅ Secure **Checkout & Payment** integration

The deployed frontend connects with the **local backend** to enable full functionality.
---
## 🌟 Project Features  
### 🎯 User Module  
- Secure **User Authentication (JWT)**
- **Role-based Access Control** (Customer/Admin)
- Profile Management  

### 🛍️ Product & Categories  
- View available **food items** with details  
- Search and filter products by categories  
- Add food items to cart and checkout  

### 🛒 Shopping Cart & Orders  
- **Add/remove items** from the cart  
- **View order history**  
- Secure **Checkout & Payment** integration  

### 🔧 Admin Panel  
- **CRUD operations** for products  
- **Manage orders & users**  

---

## 🛠️ Technology Stack  
### Frontend  
- **React.js (Vite)** – Modern, fast UI framework  
- **Bootstrap CSS** – Styling framework  
- **Axios** – API communication  

### Backend  
- **Java 17+** – Backend logic  
- **Spring Boot** – API development  
- **Spring Security (JWT)** – Authentication & Authorization  
- **MongoDB** – Relational database  

### Tools & Deployment  
- **Postman** – API testing  
- **Docker** – Containerization (optional)  

---

## 📂 Project Structure  

foodies/ # Deployed Frontend (Vite React) foodies_backend/ # Local Backend (Spring Boot)

---

## ⚙️ System Requirements  

**Minimum Requirements:**  
- Java 17+  
- Node.js 18+ (for frontend development, if needed)  
- MongoDB Server (or H2 for testing)  
- Maven (for backend build)  
- Git (for version control)  

---

## 🌐 Frontend Application (Deployed)  

✅ **Live Demo:** [[Foodies App](https://full-stack-food-delivery-app-blush.vercel.app/)]((https://full-stack-food-delivery-app-blush.vercel.app/)>)  

- The **frontend is already deployed** and available online.  
- To test **full functionality**, you must run the **backend locally**.  

---

## 🔙 Backend Application (Local Setup)  

The backend is a **Spring Boot** application that provides **RESTful APIs** for authentication, product management, cart operations, and orders.  

### 📌 Steps to Run Backend Locally  

#### 1️⃣ Clone the Repository  

git clone <(https://github.com/PavanGoud547/Full-Stack-Food-Delivery-App.git)>
cd foodies_backend

2️⃣ Configure the Database
Using MongoDB: Edit src/main/resources/application.properties

properties
server.port=9090
#mongodb configuration
spring.data.mongodb.uri=mongodb://localhost:27017/foodies

3️⃣ Build & Run the Backend

mvn clean install
mvn spring-boot:run

4️⃣ Verify the Backend is Running
Open in browser or use Postman:
📌 http://localhost:9090/api/auth/register

🔗 Connecting Frontend to Backend
To test the full application:

Run the backend locally on http://localhost:9090

Open the deployed frontend: Foodies App

Register/login, browse products, and place orders!

🔐 Security Considerations
CORS Configuration – Ensure the frontend can communicate with the backend.

JWT Authentication – Secure API endpoints.

Role-based Access – Restrict admin functionalities.

Input Validation – Prevent MongoDB injection & XSS attacks.

🚀 Performance Optimization
Database Indexing – Improve query speed.

Caching – Use Redis for frequently accessed data.

Pagination – Prevent excessive data loading.

Lazy Loading – Optimize frontend component rendering.

⚡ Development Best Practices
✅ Follow MVC Architecture – Keep concerns separate.
✅ Use DTOs – Avoid direct entity exposure in APIs.
✅ Handle Exceptions Properly – Use @ControllerAdvice.
✅ Write Unit Tests – Ensure reliability with JUnit & Mockito.
✅ Use Git Branching – Feature-based development.

🛠️ Troubleshooting
❌ Backend Not Running?
Ensure Java 17+ is installed.

Use mvn clean install before running.

❌ Frontend Not Connecting to Backend?
Ensure backend is running on http://localhost:9090

Check CORS settings in Spring Boot (WebConfig.java)

Open developer console (F12 > Network) to check errors.

📜 License
This project is licensed under the MIT License.

👥 Contributors
Pavan Kumar Goud – Full Stack Developer Fresher

📧 Support
For any issues or feature requests, please open an issue or contact:
📩 Email: pavankumarp547@gmail.com

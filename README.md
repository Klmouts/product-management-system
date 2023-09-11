#  Product Management System

Welcome to the Product Management System project! This system integrates user authentication and authorization, providing a secure platform for managing products.

## Table of Contents

- [Tech Stack](#tech-stack)
- [Features](#features)
- [Known Issues](#known-issues)
- [Usage](#usage)
- [Future Enhancements](#future-enhancements)
- [Contributions](#future-enhancements)

## Tech Stack

- **Spring Boot**: The foundation of this application.
- **PostgreSQL**: My chosen database management system.
- **Spring Security**: Ensuring secure authentication and authorization.
- **Thymeleaf**: Empowering my HTML templates.

## Features

### User Registration and Login

- **Secure Registration**: Users can confidently register with a unique username, email, and password.
- **User Login**: Registered users can access their accounts using their credentials.
- **Role-Based Authentication**: I've incorporated two distinct roles, "USER" and "ADMIN."

### Role-Based Authorization

- **User Permissions**: Users have the privilege to view and add products.
- **Admin Privileges**: Administrators can effortlessly update and delete products.

### Security

- **Robust Security**: I've implemented comprehensive security measures to ensure the utmost protection against unauthorized access.
- **Password Encryption**: User passwords are securely stored using advanced encryption techniques.
- **CSRF Protection**: My system is fortified with cross-site request forgery protection.

### Known Issues

- While developing this project, I encountered certain issues with the login and registration functionalities. I am actively working to resolve these matters.
- Registration may not consistently function as expected.
- In rare instances, successful login may redirect to an error page.

## Usage

1. **Clone this Repository**

   ```bash
   git clone https://github.com/Klmouts/product-management-system

2. **Configuration and Usage**

   To set up your PostgreSQL database, follow these steps:

   - Open the `application.properties` file located in the project.
   - Customize the file to match your specific database configuration:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/product_manager
     spring.datasource.username=admin
     spring.datasource.password=admin
     spring.datasource.driver-class-name=org.postgresql.Driver
     ```

3. **Running the Application**

   To run the Spring Boot application, follow these straightforward steps:

   - Start the application.

   Once the application is up and running, access it through these user-friendly URLs:

   - Login Page: http://localhost:8080/login
   - Registration Page: http://localhost:8080/register

## Future Enhancements

As part of my ongoing commitment to excellence, I have plans to implement the following enhancements:

- Extend the product management functionality by introducing endpoints for adding, updating, and retrieving products.
- Diligently address and resolve the known issues currently affecting login and registration functionality.
- Uphold the highest standards of functionality and security by incorporating comprehensive unit tests.
- Facilitate ease of use by providing detailed documentation of my REST endpoints.

## Contributions

I welcome contributions from anyone interested in improving this project. If you have innovative ideas, valuable suggestions, or the desire to collaborate, please do not hesitate to reach out. Together, we can elevate this project to new heights.

For any inquiries or to express your interest in contributing, please feel free to get in touch. Your feedback and participation are highly valued.

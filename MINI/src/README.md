# Secure Login Application

## Overview
This project implements a secure sign-up and login system using best practices in web security. It includes a user-friendly interface and adheres to OWASP Top 10 principles.

## Features
- **User Registration**: Users can create an account with their name and registration number.
- **Secure Login**: Users can log in using their credentials.
- **Dashboard**: Displays the user’s name and registration number upon successful login.
- **Password Storage**: Passwords are hashed for security.

## Secure Coding Principles
- Input validation to prevent XSS and SQL Injection.
- Password hashing (using Base64 for demonstration; in production, use stronger algorithms like bcrypt).
- Secure session management.

## OWASP Top 10 Principles Implemented
1. **Injection**: Use of parameterized queries (not shown in this demo).
2. **Broken Authentication**: Proper session management.
3. **Sensitive Data Exposure**: Passwords are hashed before storage.
4. **XML External Entities (XXE)**: Not applicable in this demo.
5. **Broken Access Control**: Not applicable in this demo.
6. **Security Misconfiguration**: Default headers should be configured.
7. **Cross-Site Scripting (XSS)**: Proper input validation.
8. **Insecure Deserialization**: Not applicable in this demo.
9. **Using Components with Known Vulnerabilities**: Regularly update libraries.
10. **Insufficient Logging & Monitoring**: Implement logging for security events.

## Unit Testing
To be implemented using Jest or Mocha.

## Special Features
- **Password Generator**: A function to generate secure random passwords can be added.

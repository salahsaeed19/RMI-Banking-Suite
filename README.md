# RMI Banking Suite

## Overview
This project, **RMI Banking Suite**, is developed in Java with a primary focus on implementing **Remote Method Invocation (RMI)** technology. It is designed to simulate basic banking functionalities, including managing user accounts, processing transactions, and maintaining client data.

## Features

### **Key Features**
- **RMI-based communication**: The core functionality revolves around RMI, allowing for distributed client-server communication.
- **User Management**: Add, update, and retrieve user information with ease.
- **Transaction Management**: Handle deposits and withdrawals securely.
- **Swing-based GUI**: An intuitive graphical interface for all banking operations.
- **Server Operations**: Centralized management of all user and transaction data via the RMI server.

### **Functional Highlights**
- **Login Authentication**: Verify user credentials before granting access.
- **Client Data Management**: Retrieve and display client details.
- **Transaction Handling**: Securely process deposits and withdrawals.
- **Dynamic Updates**: Modify client information and reflect changes in real-time.

## Project Structure
- **Client Components**:
  - User interfaces for login, user management, and transaction handling.
  - GUI components built using Java Swing.
- **Server Components**:
  - Core server logic implemented with RMI to handle requests.
  - Data stored in memory using Java collections.
- **Common Interfaces**:
  - RMI interfaces defining methods for client-server interaction.

## Getting Started

### **Prerequisites**
- Java Development Kit (JDK 8 or higher).
- An IDE such as IntelliJ IDEA or Eclipse (optional but recommended).

### **Setup Instructions**
1. Clone the repository:
   ```bash
   git clone https://github.com/salahsaeed19/RMI-Banking-Suite.git
   ```
2. Compile the Java files:
   ```bash
   javac -d . src/**/*.java
   ```
3. Start the RMI Registry:
   ```bash
   rmiregistry 1099
   ```
4. Launch the server:
   ```bash
   java banksystem.Server
   ```
5. Launch the client:
   ```bash
   java banksystem.BankSystem
   ```

## Demonstration Video
To better understand the project, watch the comprehensive demonstration video on YouTube:
[Banking System Project Demo](https://youtu.be/JRZuo6A6Q74?si=JAVXagwpsBsqBXSI)

In this video, I, **Salah Eldin Saeed Abu Seif**, along with **Abd Al Razzaq Al Dahdouh** ([GitHub Profile](https://github.com/abood-2020)) and **Fathi Shamallakh** ([GitHub Profile](https://github.com/Fathi-Shamallakh)), walk through the entire project, explaining its features, functionality, and implementation details.


## Authors
- **Salah Eldin Saeed Abu Seif** ([GitHub Profile](https://github.com/salahsaeed19))
- **Abd Al Razzaq Al Dahdouh** ([GitHub Profile](https://github.com/abood-2020))
- **Fathi Shamallakh** ([GitHub Profile](https://github.com/Fathi-Shamallakh))


## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

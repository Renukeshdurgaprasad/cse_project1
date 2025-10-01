# VRSEC ATM Application

## Overview
A Java-based ATM (Automated Teller Machine) simulation application that demonstrates basic banking operations including withdrawal, deposit, and balance inquiry. This is a console/terminal-based application with file handling for data persistence.

## Project Architecture

### Language & Framework
- **Language**: Java
- **Type**: Console Application
- **Build System**: Java compiler (javac)

### Project Structure
```
.
├── VrsecAtm.java          # Main entry point
├── cusDetails/            # Package for customer details
│   ├── Details.java       # Customer data storage
│   ├── Methods.java       # Banking operations implementation
│   └── Owner.java         # ATM worker/admin interface
├── data.txt              # Persistent customer balance data (auto-generated)
├── otp.txt               # OTP storage (auto-generated)
├── de.txt                # Deposit transaction history (auto-generated)
└── wi.txt                # Withdrawal transaction history (auto-generated)
```

### Key Features
- **Customer Authentication**: Card number and password validation
- **OTP System**: One-time password generation and verification with 3 attempts
- **Banking Operations**:
  - Deposit money
  - Withdraw money
  - Check account balance
- **File Persistence**: All transactions and balances are saved to files
- **Admin Interface**: ATM worker can view deposit and withdrawal transaction history
- **Account Security**: Card blocking after failed authentication attempts

### Data Files
The application creates and maintains several data files:
- `data.txt`: Stores customer account balances (format: index,balance)
- `otp.txt`: Stores generated OTP for verification
- `de.txt`: Deposit transaction history
- `wi.txt`: Withdrawal transaction history

## Recent Changes
- **2025-10-01**: Initial project setup in Replit environment
  - Installed Java GraalVM module
  - Compiled all Java files (package and main class)
  - Set up workflow for console application
  - Added .gitignore for Java project files

## Development

### Running the Application
The application runs automatically via the configured workflow. To interact with it:
1. Use the console to interact with the ATM interface
2. Choose between Customer (1) or ATM Worker (2)
3. For Customer: Enter card number and password from the predefined list
4. For ATM Worker: Enter password (default: 1111)

### Pre-configured Customer Accounts
The application comes with 12 pre-configured test accounts (see Details.java):
- Card numbers are 12 digits
- Each account has a password and initial balance
- Example: Card "901234772389", Password 2007, Balance 15000

### Compilation
If you need to recompile:
```bash
# Compile package files
javac -d . Details.java Methods.java Owner.java

# Compile main class
javac VrsecAtm.java
```

### Workflow
- **Name**: ATM Application
- **Command**: `java VrsecAtm`
- **Type**: Console application

## Technical Implementation

### Core Java Concepts Used
- Object-Oriented Programming (classes, inheritance, interfaces)
- File I/O operations (FileInputStream, FileOutputStream)
- String tokenization for data parsing
- Exception handling
- Random number generation (for OTP)
- Package organization

### Security Features
- Password authentication with limited attempts
- OTP-based two-factor authentication
- Card blocking mechanism after failed attempts
- Secure file-based data storage

## User Preferences
- This is a learning/demonstration project
- Maintains simple file-based storage (no external database)
- Console-based interface for simplicity
- All customer data is pre-configured in code

## Features  

- We used **classes** to store customer details such as **name, password, and account balance**.  
- We implemented **file handling** to ensure that any changes (e.g., deposits) persist even after restarting the program.  
- We organized the project using **packages** to separate different modules.  
- We used **String Tokenizer** to extract and process data from files efficiently.  
- An **OTP (One-Time Password) generation system** was implemented using Java’s **Random** class. The OTP is stored in a file and must be entered correctly to proceed with further actions such as withdrawal and deposit.  
  - The system provides **three attempts** to enter the correct OTP.  
  - If all attempts fail, access to account details is temporarily restricted.  
- **Inheritance and interfaces** were used to implement basic functionalities and improve code reusability.  

## Prerequisites  
To work on this project, you need:  
- Basic knowledge of **Java programming** and the concepts mentioned above.  
- Understanding of **compiling and running Java programs using the command line (CMD)**.  


## **Important Notes:**
- ✅ Ensure that package names and file names are correctly referenced while executing the project.
- ✅ Use the correct directory structure when working with Java packages to avoid compilation errors.
- ✅ Make sure Java is properly installed and configured on your system before running the commands.

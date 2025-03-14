# Basic ATM Interface (My First Project)

## Overview  
Our team of three members developed a small project to demonstrate basic banking operations such as **withdrawal, deposit, and balance inquiry** using the Java programming language.  

We implemented several core Java concepts, including **inheritance, interfaces, packages, method chaining, string tokenizer, and file handling**.  

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

## How to Compile and Run  

This project is executed using the **command line (CMD)**.  

### **Compilation Commands:**  
- To compile the main code:  
  ```sh
  javac filename.java
- To compile the package:
  javac -d . filename.java
## ** run Commands :**
- to run the main  code:
   java fileName
- to run the package :
   java packageName.fileName
## ** Important Notes: **
-✅ Ensure that package names and file names are correctly referenced while executing the project.
-✅ Use the correct directory structure when working with Java packages to avoid compilation errors.
-✅ Make sure Java is properly installed and configured on your system before running the commands.

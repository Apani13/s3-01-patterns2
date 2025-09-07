# 🎯 s3-02-patterns — Java Design Patterns

## 📝 Description
We are going to dive deeper into **software construction patterns**.

This repository contains structured Java exercises to help you practice and understand the **Builder**, **Observer**, and **Callback** design patterns through practical, hands-on examples.

---

## 🚀 Objectives
- Learn to identify and work with software construction patterns.
- Implement design patterns that improve **reusability**, **extensibility**, and **maintainability**.
- Practice structuring projects with **Gradle** and clear separation of concerns.

---

## 📚 Exercise Overview

### 🔹 Level 1 — Builder
**Pizza Order Management System**
- Implement a `Pizza` class with the following attributes:
    - `size`
    - `dough`
    - `toppings`
- Create a `PizzaBuilder` interface with methods to configure each attribute.
- Implement concrete builders (`HawaiianPizzaBuilder`, `VegetarianPizzaBuilder`, etc.).
- Develop a `MestrePizzer` (Pizza Master) class that receives a `PizzaBuilder` and builds pizzas step by step.
- In the `Main` program, create different pizzas using the builders and the `MestrePizzer`.

---

### 🔹 Level 2 — Observer
**Stock Market Notification System**
- The **Stock Agent** acts as the **Observable**.
- Multiple **Stock Agencies** act as **Observers**.
- Whenever the market rises or falls, the Stock Agent automatically notifies all agencies.
- The Observable must maintain references to its Observers.

---

### 🔹 Level 3 — Callback
**Payment Gateway Simulation for a Shoe Store**
- The gateway receives an encapsulated object of the payment method:
    - **Credit Card**
    - **PayPal**
    - **Bank Debit**
- The gateway executes the payment without knowing its internal details.
- Once completed, it returns control to the originating class (the Shoe Store).

---

## ⚙️ Technologies Used
- **Java 17**
- **Gradle**
- **IntelliJ IDEA / Eclipse**
- **GitHub**

---

## 📋 Requirements
- Java JDK 17+
- Gradle
- Git for version control
- IDE (IntelliJ IDEA or Eclipse)

---

## 🛠️ Installation
```bash
git clone https://github.com/Apani13/s3-01-patterns2.git
cd s3-02-patterns
```
- Open the project in **IntelliJ IDEA** or **Eclipse**.
- Make sure the project is configured with **Java 17+**.

---

## ▶️ Execution
- Each exercise has a `Main` class inside its level folder.
- Run the program either from the IDE or via terminal with Gradle:

```bash
./gradlew run
```

💡 Each `Main` class is designed to demonstrate the corresponding design pattern in action.

---

## 🤝 Contributions
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/MyFeature
   ```  
3. Commit your changes:
   ```bash
   git commit -m "Add MyFeature"
   ```  
4. Push to your fork and open a Pull Request.

---

## ✅ Author Notes
These exercises provide a solid foundation in **design and construction patterns**, which are essential for building professional-grade Java applications.

**Happy coding! 🍕📈💳**  

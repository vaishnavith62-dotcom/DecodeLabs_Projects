# 🎯 Number Guessing Game

## Project 1 - Java Programming

A console-based Java application that generates a random number between **1 and 100** and challenges the user to guess it. The program provides feedback after each guess and continues until the correct number is found.

---

## 📋 Project Objectives

* Generate a random number using Java's `Random` class.
* Accept user input using `Scanner`.
* Provide feedback for each guess:

  * Too High
  * Too Low
  * Correct
* Continue the game until the correct number is guessed.
* Handle invalid inputs gracefully.
* Allow multiple rounds of gameplay.
* Track attempts and score.

---

## 🚀 Features

### Core Features

* Random number generation (1–100)
* User input handling
* High/Low feedback mechanism
* Continuous gameplay loop
* Win detection

### Additional Features

* Attempt counter
* Score tracking
* Play Again option
* Input validation
* Exception handling
* Range validation (1–100)

---

## 🛠 Technologies Used

* Java
* Random Class
* Scanner Class
* Loops (`while`)
* Conditional Statements (`if-else`)
* Exception Handling (`try-catch`)

---

## 📂 Project Structure

```text
Project1/
│
├── DecodeLabs_Java_P1.java
└── README.md
```

---

## ▶️ How to Run

### Compile

```bash
javac DecodeLabs_Java_P1.java
```

### Execute

```bash
java DecodeLabs_Java_P1
```

---

## 🎮 Gameplay Flow

1. The program generates a random number between 1 and 100.
2. The user enters a guess.
3. The program compares the guess with the target number.
4. Feedback is displayed:

   * Too High
   * Too Low
   * Correct
5. Attempts are counted.
6. Score is updated.
7. When the user wins, the final results are displayed.
8. The user can choose to play again.

---

## 🖥 Sample Output

```text
I have selected a number between 1 and 100.
Try to guess it!

Enter your guess: 50
Too High!

Enter your guess: 34
Too Low!

Enter your guess: 40
Too High!

Enter your guess: 35
Too Low!

Enter your guess: 38
Too High!

Enter your guess: 333337
Please enter a number between 1 and 100.

Enter your guess: 37

***********************************
Congratulations!
You guessed the correct number.
Target Number : 37
Attempts      : 7
Final Score   : 75
***********************************

Do you want to play again? (Y/N): 
```

---

## ⚠️ Input Validation

The application prevents crashes caused by invalid inputs.

Example:

```text
Enter your guess: abc
Invalid input!
Please enter a valid integer.
```

---

## 📚 Concepts Demonstrated

* Random Number Generation
* User Input Handling
* Looping Constructs
* Conditional Logic
* Exception Handling
* Input Validation
* Game State Management
* Console-Based Application Development

---

## ✅ Learning Outcomes

By completing this project, the following Java concepts are practiced:

* Random Class
* Scanner Class
* While Loops
* Conditional Statements
* Exception Handling
* Variables and Data Types
* Program Flow Control

---

## 👨‍💻 Author

Submitted as part of the DecodeLabs Java Programming Industrial Training Program.

---

## 📄 License

This project is intended for educational and learning purposes.

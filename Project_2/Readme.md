# Student Grade Calculator

## Overview

The **Student Grade Calculator** is a simple Java console application that calculates a student's overall performance based on marks entered for multiple subjects. The program validates user input, calculates total marks and average percentage, assigns a grade, and determines whether the student has passed or failed.

## Features

* Accepts any number of subjects.
* Validates user input to prevent invalid entries.
* Ensures marks are entered within the range of 0–100.
* Calculates:

  * Total Marks
  * Average Percentage
  * Grade (A, B, C, D, F)
  * Pass/Fail Status
* Displays results in a clean and formatted output.

## Grade Criteria

| Average Percentage | Grade |
| ------------------ | ----- |
| 90 - 100           | A     |
| 80 - 89            | B     |
| 70 - 79            | C     |
| 60 - 69            | D     |
| Below 60           | F     |

## Pass/Fail Criteria

* **PASS:** Average Percentage ≥ 40%
* **FAIL:** Average Percentage < 40%

## Technologies Used

* Java
* Scanner Class (`java.util.Scanner`)
* Console-Based User Interface

## How to Run

### Prerequisites

* Java Development Kit (JDK) 8 or higher installed.

### Steps

1. Save the file as:

   ```bash
   DecodeLabs_Java_P2.java
   ```

2. Open a terminal or command prompt.

3. Compile the program:

   ```bash
   javac DecodeLabs_Java_P2.java
   ```

4. Run the program:

   ```bash
   java DecodeLabs_Java_P2
   ```

## Sample Output

```text
============*********===============
     Student Grade Calculator
============*********===============

Enter the number of subjects: 3

Enter marks for Subject 1 (0-100): 85
Enter marks for Subject 2 (0-100): 90
Enter marks for Subject 3 (0-100): 78

===========***********=============
            Result
=============***********===========

Number of Subjects : 3
Total Marks        : 253
Average Percentage : 84.33%
Grade              : B
Result Status      : PASS
------------------------------------
```

## Input Validation

The application handles invalid inputs by:

* Rejecting non-integer values for the number of subjects.
* Rejecting subject counts less than or equal to zero.
* Rejecting marks outside the range of 0–100.
* Prompting the user until valid input is provided.

## Project Structure

```text
DecodeLabs_Java_P2.java
│
├── Input Validation
├── Marks Collection
├── Total Marks Calculation
├── Percentage Calculation
├── Grade Assignment
├── Pass/Fail Evaluation
└── Result Display
```

## Learning Objectives

This project demonstrates:

* Loops (`while`, `for`)
* Conditional Statements (`if-else`)
* User Input Handling
* Data Validation
* Basic Arithmetic Operations
* Console Output Formatting

## Author

Developed as part of a Java programming practice project.

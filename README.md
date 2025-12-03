# Java Hackathon - Online Exam Application

This is a simple console-based Online Exam application written in Java. It tests the user's knowledge about Dayananda Sagar University (DSU).

## Project Structure

- `OnlineExam.java`: The main class that contains the application logic, including question initialization, the exam loop, and scoring.
- `Question.java`: A helper class that represents a single question with its text, options, and the correct answer.

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher recommended).

## How to Compile

Open a terminal or command prompt, navigate to the project directory, and run the following command:

```bash
javac OnlineExam.java Question.java
```

This will generate `OnlineExam.class` and `Question.class` files.

## How to Run

After compiling, run the application using the `java` command:

```bash
java OnlineExam
```

## Usage

1.  The application will display a welcome message.
2.  It will present 10 multiple-choice questions one by one.
3.  For each question, enter the number corresponding to your chosen option (1-4).
4.  The application will immediately inform you if your answer was correct or wrong.
5.  At the end of the exam, your final score and the number of correct/wrong answers will be displayed.

## Sample Output

```text
Welcome to the Online Exam!
There are 10 multiple choice questions.
Please enter the number corresponding to your answer (1-4).
--------------------------------------------------
Question 1: When was DSU officially established as a university (as a private university)?
1. 2005
2. 2010
3. 2014
4. 2018
Your answer: 3
Correct!
--------------------------------------------------
...
Exam Finished!
Final Score: 8 / 10
Correct Answers: 8
Wrong Answers: 2
```

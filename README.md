# Grocery Shopping System (Java)

## Project Overview
This project is a beginner-level Java console application developed as part of an IBM Coursera course. It simulates a simple grocery shopping system where users can select items, enter quantities, and calculate the total bill.

The program demonstrates fundamental Java programming concepts and provides a basic understanding of how real-world billing systems work in a simplified form.

## Objectives
The main objective of this project is to apply basic Java programming concepts in a practical scenario. It focuses on user interaction, data handling, and error management.

## Features
- Accepts user input for item selection
- Calculates total cost based on quantity
- Uses arrays to store item names and prices
- Handles invalid input using exception handling
- Allows continuous shopping until user exits

## Technologies Used
- Java
- Arrays
- Loops (for loop and while loop)
- Conditional statements
- Exception handling
- Scanner class for user input

## Project Structure
- GroceryShopping.java – Main application file
- ItemNotFoundException – Custom exception for handling invalid item input

## How the Program Works
1. The program stores a list of grocery items and their prices using arrays.
2. The user is prompted to enter the name of an item.
3. The program checks whether the item exists in the list.
4. If found, the user enters the quantity.
5. The total cost is calculated and added to the bill.
6. If the item is not found, a custom exception is triggered.
7. The process continues until the user chooses to exit.
8. Finally, the total bill is displayed.

## How to Run
1. Compile the program:
   javac GroceryShopping.java

2. Run the program:
   java GroceryShopping

## Sample Output
Enter the name of items:
Apple
Enter the Quantity of Apple:
2
Added 2 x Apple to the bill.
Current Total: Rs.20.0

## Course Information
This project was completed as part of a beginner-level Java programming course offered by IBM on Coursera.

## License
This project is licensed under the Apache License 2.0.

## Author
Inbathamizhan S

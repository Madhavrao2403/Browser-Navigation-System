# Browser Navigation System

## Description
This project is a simple browser navigation system implemented in Java. It allows users to navigate between web pages using a doubly linked list. The system enables moving to the previous and next pages and searching for new web pages.

## Features
- **Navigate to Previous Page**: Moves to the last visited page.
- **Navigate to Next Page**: Moves to the next page if available.
- **Search for a Website**: Allows the user to enter a website address and adds it to the browsing history.
- **Exit Option**: The user can exit the browser simulation at any time.

## Technologies Used
- Java
- Data Structures: Doubly Linked List
- Scanner Class for User Input

## How It Works
1. The user starts on the home page.
2. The program presents options to navigate between pages or search for a new website.
3. If the user searches for a website, it is added to the browsing history.
4. The user can navigate back and forth using the available options.

## How to Run
1. Copy the `Hms.java` file into your Java environment.
2. Compile the file using:
   ```sh
   javac Hms.java
   ```
3. Run the program:
   ```sh
   java Hms
   ```
4. Follow the on-screen instructions to navigate through the browser simulation.

## Example Usage
```
Welcome to the Browser
Presently you are in Homepage.
Choose the option:
1. Previous page
2. Next page
3. Search
Any number to exit
Enter: 3
Enter website to search (as www.example.com): www.google.com
You have entered www.google.com
Choose the option:
1. Previous page
2. Next page
3. Search
Any number to exit
```


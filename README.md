# assignment_3_2023_Group_47
assignment_3_2023_s1-Unsxlved created by GitHub Classroom
Web System for User Management in Java
Project Overview
This project is a simple Java application that represents a system where users, such as a trainee and a finance manager, can interact. The system handles operations like unenrollment from courses and refund requests. The users and their interactions are represented through objects and methods in the code.

Project Structure
The project consists of four Java classes:

WebSystem.java: This is the main class where the system is instantiated and the scenarios are executed.
User.java: This class represents a user in the system and contains methods for actions that a user can perform, such as cancelling registration, requesting refunds, and unenrolling from courses.
Registration.java: This class represents the registration of a trainee to a course. It contains details such as the start and finish dates of the registration, and the current status.
Refund.java: This class represents a refund that a trainee can request. It contains details such as the mode, amount, and date of the refund.
Running the Project
To run the project, you need to have Java installed on your machine. Then, compile and run the WebSystem.java file. The system will execute the first scenario where a trainee tries to unenroll from a course and requests a refund.

Copy code
javac WebSystem.java
java WebSystem
User Interactions
The system prints out the results of the interactions to the console. The trainee sends a request to cancel their registration, and the finance manager attempts to unenroll the trainee. If the unenrollment is successful, the trainee is unenrolled and a message is printed to the console. If the unenrollment is unsuccessful, a message is printed to the console indicating that the trainee's registration has not been cancelled.

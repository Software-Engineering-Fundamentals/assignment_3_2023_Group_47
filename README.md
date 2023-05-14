# **Web System for User Management in Java**

## **Project Overview**
This project is a simple Java application that represents a system where users, such as a trainee and a finance manager or manager, can interact. The system handles operations like unenrollment from courses and refund requests. The users and their interactions are represented through objects and methods in the code.

## **Project Structure**
The project consists of five Java classes:

1. **'WebSystem.java':** This is the main class where the system is instantiated and the scenarios are executed.
2. **'User.java':** This class represents a user in the system and contains methods for actions that a user can perform, such as cancelling       registration, requesting refunds, and unenrolling from courses.
3. **'Registration.java:'** This class represents the registration of a trainee to a course. It contains details such as the start and finish dates of the registration, and the current status.
4. **'Refund.java':** This class represents a refund that a trainee can request. It contains details such as the mode, amount, and date of the refund.
5. **'Enquiry.java':** This class represents enquiries that users can create. It contains details such as the unqiue ID, message, and status of the enquiry.

## **Running the Project**
To run the project, you need to have Java installed on your machine. Then, compile and run the WebSystem.java file. The system will execute the first scenario where a trainee tries to unenroll from a course and requests a refund, followed by the second scenario where a different trainee will send an enquiry to the manager and recieve a response back.

## **User Interactions**
The system prints out the results of the interactions to the console. The trainee sends a request to cancel their registration, and the finance manager attempts to unenroll the trainee. If the unenrollment is successful, the trainee is unenrolled and a message is printed to the console. If the unenrollment is unsuccessful, a message is printed to the console indicating that the trainee's registration has not been cancelled.

Enquiries work by creating an instance of an enquiry, setting it up with user inputs and sending it to the manager, who will recieve and produce a response to the enquiry, sending it back to the user. The enquiry is kept in the system for future reference, regardless of status.

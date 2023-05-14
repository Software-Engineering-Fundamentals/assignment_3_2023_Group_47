public class WebSystem {
   public static User trainee1 = new User("T000001", "dCross", "traineePassword", "Damian Cross", "01/01/2001", "20 Geometry Avenue", "1234567890", "dcross@gmail.com", "Matilda Cross", "1029384756"); // Trainee user created
   public static User fManager = new User("F000001", "AMenger", "staffPassword", "Alice Menger", "02/02/2003", "10 Trigonometry Boulevard", "0987654321", "amenger@gmail.com", "David Menger", "6574839201"); // Finance Manager user created 


   public static void scenario1(){
      System.out.println("------------------------\n\tScenario 1\n------------------------"); // Trainee wants to unenrol from their course and request a refund
      
      // Scenario 1 Assumptions:
      // 

      //Proving that the example users have been correctly loaded by calling a field from each one:
      System.out.print("Trainee created\nID: ");
      System.out.println(trainee1.getID()); // T000001 (T for trainee)
      System.out.print("Finance Manager created\nID: ");
      System.out.println(fManager.getID()); // F000001 (F for finance manager)
      System.out.println();
   }

   public static void main(String[] args) {
      scenario1(); // Setting up for the first scenario (Users defined)
      
      Boolean cancelRequest = trainee1.cancelRegistration(); // The trainee sends a request to cancel their registration.
      if (cancelRequest = true){
         System.out.println("(trainee) Unenrolment has been requested.");
      } else {
         System.out.println("(trainee) Registration has not been requested. If this situation is unintentional, please contact the Finance Manager."); // if something goes wrong or a vital method returns false, the trainee is notified and nothing happens. This also may appear if the trainee changes their mind later in the program.
      }

      Boolean unenrolAttempt = fManager.unenrolTrainee();
      if (unenrolAttempt = true){
         System.out.printf("(trainee, fManager) Trainee %S has been unenrolled from their current course.\n", trainee1.getID());
      } else {
         System.out.println("(trainee) Registration has not been cancelled. If this situation is unintentional, please contact the Finance Manager."); // if something goes wrong or a vital method returns false, the trainee is notified and nothing happens. This also may appear if the trainee changes their mind later in the program.
      }

   }
}

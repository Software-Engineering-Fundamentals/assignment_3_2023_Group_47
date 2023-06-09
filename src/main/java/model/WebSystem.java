public class WebSystem {

   // Variables for the first two users are defined:
   static String tID = "T000001", fmID = "F000001";
   static String tUsername = "dCross", fmUsername = "aMenger";
   static String tPassword = "trainee1Password", fmPassword = "staffPassword";
   static String tName = "Damian Cross", fmName = "Alice Menger";
   static String tDOB = "01/01/2001", fmDOB = "02/02/2003";
   static String tAddress = "20 Geometry Avenue", fmAddress = "10 Trigonometry Boulevard";
   static String tPhoneNumber = "1234567890", fmPhoneNumber = "0987654321";
   static String tEmail = "dcross@gmail.com", fmEmail = "amenger@gmail.com";
   static String tEContact = "Matilda Cross", fmEContact = "David Menger";
   static String tEContactNumber = "1029384756", fmEContactNumber = "6574839201";

   // The first two users are initialised:
   public static User trainee1 = new User(tID, tUsername, tPassword, tName, tDOB, tAddress, tPhoneNumber, tEmail, tEContact, tEContactNumber);
   public static User fManager = new User(fmID, fmUsername, fmPassword, fmName, fmDOB, fmAddress, fmPhoneNumber, fmEmail, fmEContact, fmEContactNumber);

   // Proof of the instances loading correctly below:
   public static void scenario1(){
      System.out.println("------------------------\n\tScenario 1\n------------------------");
      System.out.print("Trainee created\nID: ");
      System.out.println(trainee1.getID());
      System.out.print("Finance Manager created\nID: ");
      System.out.println(fManager.getID());
      System.out.println();
   }
   
   // Variables for the second two users are defined:
   static String t2ID = "T000002", mID = "M001";
   static String t2Username = "cAddams", mUsername = "nTorres";
   static String t2Password = "trainee2Password", mPassword = "managerPassword";
   static String t2Name = "Cora Addams", mName = "Nicola Torres";
   static String t2DOB = "03/19/1995", mDOB = "02/02/1996";
   static String t2Address = "18 Angle Street", mAddress = "164 Side Road";
   static String t2PhoneNumber = "2394593645", mPhoneNumber = "6849432646";
   static String t2Email = "caddams@gmail.com", mEmail = "ntorres@gmail.com";
   static String t2EContact = "Hayden Addams", mEContact = "Ava Torres";
   static String t2EContactNumber = "8564835493", mEContactNumber = "6420364926";

   // The second two users are initialised:
   public static User trainee2 = new User(t2ID, t2Username, t2Password, t2Name, t2DOB, t2Address, t2PhoneNumber, t2Email, t2EContact, t2EContactNumber);
   public static User manager = new User(mID, mUsername, mPassword, mName, mDOB, mAddress, mPhoneNumber, mEmail, mEContact, mEContactNumber);

   // Proof of the instances loading correctly below:
   public static void scenario2(){
      System.out.println("------------------------\n\tScenario 2\n------------------------");
      System.out.print("Trainee created\nID: ");
      System.out.println(trainee2.getID());
      System.out.print("Manager created\nID: ");
      System.out.println(manager.getID());
      System.out.println();
   }

   // Main Class:
   public static void main(String[] args) {
      // Scenario 1 is loaded:
      scenario1();
      
      // The trainee decides to cancel their registration and shows their interest:
      Boolean cancelRequest = trainee1.cancelRegistration();
      // If an error occurs or the trainee changes their mind in the middle of the process, the trainee is notified:
      if (cancelRequest == false){
         System.out.println("(trainee) Registration has not been requested. If this situation is unintentional, please contact the Finance Manager.");
      }

      // The finance manager sends the command to the system to unenrol the trainee:
      Boolean unenrolAttempt = fManager.unenrolTrainee(trainee1.ID);
      if (unenrolAttempt == true){
         System.out.printf("(trainee, fManager) Trainee %S has been unenrolled from their current course.\n", trainee1.getID());
      } else {
         // If an error occurs, the trainee is notified:
         System.out.println("(trainee) Registration has not been cancelled. If this situation is unintentional, please contact the Finance Manager.");
      }

      System.out.println();
      
      // Scenario 1 is loaded:
      scenario2();

      // User decides to give feedback after encountering an error:
      String feedbackConfirm = "y";
      System.out.println("(trainee2) Would you like to send feedback to the manager? (y/n)");
      if (feedbackConfirm == "y"){
         // unique enquiry ID is generated:
         String enquiryID = "T000002Q0";
         System.out.println("(trainee2) Enter text:");
         String enquiryText = "My system keeps freezing at the embedded video in module 3, please investigate this if it is a common issue with other trainees.";
         // Enquiry instance has been generated:
         Enquiry trainee2Enquiry = new Enquiry(enquiryID, enquiryText, "OPEN");
         System.out.printf("(trainee2) Feedback has been sent with the ID [%S].\n\n", trainee2Enquiry.getID());
         // Manager recieves request from user:
         String responseConfirm = "y";
         // A response is sent back if the manager decides it:
         System.out.printf("(manager) Feedback has been recieved from a user [%S]. Respond? (y/n)\n", trainee2.getID());
         if (responseConfirm == "y"){
            String managerResponse = trainee2Enquiry.enquiryResponse(enquiryID);
            // The user recieves the response and is notified:
            System.out.printf("(trainee2) A response has been returned from the manager for query %S: %s\n", trainee2Enquiry.getID(), managerResponse);
         } else {
            System.out.println("(manager) No response has been sent.");
         }
      } else {
         System.out.println("(trainee2) Feedback not sent.");
      }

   }
}

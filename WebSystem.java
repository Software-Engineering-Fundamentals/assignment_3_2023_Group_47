public class WebSystem {

   public static User trainee1 = new User("T000001", "dCross", "trainee1Password", "Damian Cross", "01/01/2001", "20 Geometry Avenue", "1234567890", "dcross@gmail.com", "Matilda Cross", "1029384756");
   public static User fManager = new User("F000001", "aMenger", "staffPassword", "Alice Menger", "02/02/2003", "10 Trigonometry Boulevard", "0987654321", "amenger@gmail.com", "David Menger", "6574839201");


   public static void scenario1(){
      System.out.println("------------------------\n\tScenario 1\n------------------------");
      System.out.print("Trainee created\nID: ");
      System.out.println(trainee1.getID());
      System.out.print("Finance Manager created\nID: ");
      System.out.println(fManager.getID());
      System.out.println();
   }
   
   public static User trainee2 = new User("T000002", "cAddams", "trainee2Password", "Cora Addams", "03/19/1995", "18 Angle Street", "2394593645", "caddams@gmail.com", "Hayden Addams", "8564835493");
   public static User Manager = new User("M001", "nTorres", "managerPassword", "Nicola Torres", "02/02/1996", "164 Side Road", "6849432646", "ntorres@gmail.com", "Ava Torres", "6420364926");

   public static void scenario2(){
      System.out.println("------------------------\n\tScenario 2\n------------------------");
      System.out.print("Trainee created\nID: ");
      System.out.println(trainee2.getID());
      System.out.print("Manager created\nID: ");
      System.out.println(Manager.getID());
      System.out.println();
   }

   public static void main(String[] args) {
      scenario1();
      
      Boolean cancelRequest = trainee1.cancelRegistration();
      if (cancelRequest === false){
         System.out.println("(trainee) Registration has not been requested. If this situation is unintentional, please contact the Finance Manager.");
      }

      Boolean unenrolAttempt = fManager.unenrolTrainee();
      if (unenrolAttempt == true){
         System.out.printf("(trainee, fManager) Trainee %S has been unenrolled from their current course.\n", trainee1.getID());
      } else {
         System.out.println("(trainee) Registration has not been cancelled. If this situation is unintentional, please contact the Finance Manager.");
      }

      System.out.println();
      scenario2();

      
      
   }
}

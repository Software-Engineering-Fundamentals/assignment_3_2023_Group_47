public class WebSystem {
   public static User trainee = new User("T000001", "dCross", "traineePassword", "Damian Cross", "01/01/2000", "20 Geometry Avenue", "1234567890", "dcross@gmail.com", "Matilda Cross", "1029384756");
   public static User fManager = new User("S000001", "AMenger", "staffPassword", "Alice Menger", "02/02/2010", "10 Trigonometry Boulevard", "0987654321", "amenger@gmail.com", "David Menger", "6574839201");

   public Boolean refundTrainee(){
      return null;
   }


   public void scenario1(){
      System.out.println("------------------------\n\tScenario 1\n------------------------");
      System.out.print("Trainee created: ");
      System.out.println(trainee.getID());
      System.out.print("Finance Manager created: ");
      System.out.println(fManager.getID());
      System.out.println();
   }

   public void main(String[] args) {
      scenario1(); // Setting up for the first scenario (Users defined)
      Boolean cancelAttempt = trainee.cancelRegistration();
      if (cancelAttempt = true){
         System.out.println("Registration cancelled.");
      } else {
         System.out.println("An error has occurred - please try again later. If this situation persists, please contact your financial Manager.");
      }
      
   }
}

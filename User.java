// Period is used to calculate the time difference between two times
import java.time.Period;
import java.time.LocalDate;

public class User {
    // Example registration of a trainee for a method later
    public static Registration trainee1Registration = new Registration(LocalDate.of(2023, 5, 15), LocalDate.of(2020,4,20), "Enrolled");
    String ID;
    String username;
    String password;
    String name;
    String DOB;
    String address;
    String phoneNumber;
    String email;
    String eContact;
    String eContactNumber;

    // Constructor
    public User(String uID,String uUsername,String uPassword,String uName,String uDOB,String uAddress,String uPhoneNumber,String uEmail,String uEContact,String uEContactNumber){
        ID = uID;
        username = uUsername;
        password = uPassword;
        name = uName;
        DOB = uDOB;
        address = uAddress;
        phoneNumber = uPhoneNumber;
        email = uEmail;
        eContact = uEContact;
        eContactNumber = uEContactNumber;
    }

    // Getters
    public String getID(){
        return ID;
    }
    public String getUserName(){
        return username;
    }
    public String getName(){
        return name;
    }
    public String getDOB(){
        return DOB;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getEContactName(){
        return eContact;
    }
    public String getEContactNumber(){
        return eContactNumber;
    }

    // Sends request to cancel registration:
    public Boolean cancelRegistration(){
        System.out.println("(trainee) Request to unenrol has been sent to the Finance Manager.\n");
        String uID = getID();
        System.out.printf("(fManager) A request to unenrol has been recieved by a trainee [%S].\n\n", uID);
        String refundOption = "y";
        System.out.println("(trainee) Would you like to additionally send a request for a refund? (y/n)");
        // Boolean ensures two options and no other ones:
        Boolean ynvalid = false;
        while (ynvalid != true){
            if (refundOption == "y" || refundOption == "n"){
                ynvalid = true;
            }
            if (refundOption == "y"){
                // Confirmation has been given; the next method is called
                requestRefund(uID);
                return true;
            }
        }
        return false;
    }

    // Trainee sends a request to recieve a refund:
    public void requestRefund(String traineeID){
        System.out.println("(trainee) A refund request has been sent.\n");
        System.out.printf("(fManager) This request also involves refund eligibility [%S].\n\n", traineeID);
    }

    // The Finance Manager is able to refund the trainee if they are eligible:
    public void refundTrainee(String traineeID){
        Refund trainee1Refund = new Refund("T000001", 59.99, LocalDate.now());
        System.out.printf("(trainee, fManager) %S has been refunded $%,.2f.\n", traineeID, trainee1Refund.amount);
    }

    // Checks if the trainee is eligible for a refund based on the request time; they are deemed eligible if the request is made 24 hours before the classes start:
    public Boolean checkRefundEligibility(Registration traineeReg){
        Period timePeriod = Period.between( LocalDate.now(), traineeReg.dateStart);
        int days = timePeriod.getDays();
        if (days >= 1) {
            return true;
        } else {
            return false;
        }
    }

    // the trainee is unenrolled by the Finance Manager:
    public Boolean unenrolTrainee(String trainee1ID){
        trainee1Registration.status = "Unenrolled";
        Boolean unenrolEligibility = checkRefundEligibility(trainee1Registration);
        if (unenrolEligibility == true){
            System.out.printf("(trainee, fManager) %S is eligible for a refund.\n", trainee1ID);
            refundTrainee("T000001");
            return true;
        } else {
            System.out.printf("(trainee, fManager) %S is ineligible for a refund.\n", trainee1ID);
            return false;
        }
    }
}

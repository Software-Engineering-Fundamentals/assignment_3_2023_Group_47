import java.time.Period;
import java.time.LocalDate;

public class User {
    public static Registration trainee1Registration = new Registration(LocalDate.of(2020, 3, 20), LocalDate.of(2020,4,20), "Enrolled");
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

    // get user details
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

    public Boolean cancelRegistration(){
        System.out.println("(trainee) Request to unenrol has been sent to the Finance Manager.\n");
        String uID = getID();
        System.out.printf("(fManager) A request to unenrol has been given by a trainee [%S].\n\n", uID);
        String refundOption = "y";
        System.out.println("(trainee) Would you like to additionally send a request for a refund? (y/n)");
        try {
            if (refundOption == "y"){
                requestRefund(uID);
            } else {
                // Don't send request
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void requestRefund(String traineeID){
        System.out.println("(trainee) A refund request has been sent.\n");
        System.out.printf("(fManager) This request also involves refund eligibility [%S].\n\n", traineeID);
    }

    public void refundTrainee(String traineeID){
        Refund trainee1Refund = new Refund("T000001", 59.99, "20");
        System.out.printf("(trainee, fManager) %S has been refunded $%,.2f.\n", traineeID, trainee1Refund.amount);
     }

    public Boolean checkRefundEligibility(String traineeID, Registration traineeReg){
        Period timePeriod = Period.between(traineeReg.dateStart, traineeReg.dateFinish);
        int months = timePeriod.getMonths();
        int totaldays = (months*30) + timePeriod.getDays();
        
        if (totaldays >= 14) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean unenrolTrainee(){
        trainee1Registration.status = "Unenrolled";
        String trainee1ID = "T000001";
        Boolean unenrolEligibility = checkRefundEligibility(trainee1ID, trainee1Registration);
        if (unenrolEligibility == true){
            System.out.printf("(trainee, fManager) %S is eligible for a refund.\n", trainee1ID);
            refundTrainee("T000001");
            return true;
        } else {
            System.out.printf("(fManager) %S is ineligible for a refund.\n", trainee1ID);
            return false;
        }
    }
}

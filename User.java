public class User {
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
        Boolean unenrolAttempt = unenrolTrainee();
        if (unenrolAttempt = true){
            return true;
        } else {
            return false;
        }
    }
    public Boolean requestRefund(){
        Boolean refundAttempt = checkRefundEligibility();
        return null;
    }
    public Boolean checkRefundEligibility(){
        return null;
    }
    public Boolean unenrolTrainee(){
        checkRefundEligibility();
        return null;
    }
}

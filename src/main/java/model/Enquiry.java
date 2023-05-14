import java.time.LocalDate;

public class Enquiry {
    // Defining all used variables in multiple methods:
    String queryID;
    String text;
    // LocalDate.now() changes based on when the enquiry was made:
    LocalDate dateQuery = LocalDate.now();
    String status;

    // Constructor
    public Enquiry(String qID, String qText, String qStatus){
        queryID = qID;
        text = qText;
        status = qStatus;
    }

    // Getters
    public String getID(){
        return queryID;
    }

    public String getText(){
        return text;
    }

    public LocalDate getDate(){
        return dateQuery;
    }

    // Setter for status once query has been addressed
    public void setStatus(String newStatus){
        status = newStatus;
    }

    // Method for manager to send a response back to the user
    public String enquiryResponse(String enquiryID){
        System.out.println("(manager) Enter response:");
        // Example response to enquiry below:
        String enquiryResponse = "Thank you for your feedback. We have recieved criticism for this video embed as well, so we will fix this in the near future.";
        System.out.println("(manager) Response has been sent to the user.\n");
        // CLOSED status means the query has been addressed, allowing permitted users to access enquiries that won't have new information added to them
        setStatus("CLOSED");
        // Return the manager's response to the user
        return enquiryResponse;
    }

}
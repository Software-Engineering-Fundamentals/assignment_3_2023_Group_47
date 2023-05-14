import java.time.LocalDate;

public class Enquiry {
    String queryID;
    String text;
    LocalDate dateQuery = LocalDate.now();
    String status;

    public Enquiry(String qID, String qText, String qStatus){
        queryID = qID;
        text = qText;
        status = qStatus;
    }

    public String getID(){
        return queryID;
    }

    public String getText(){
        return text;
    }

    public LocalDate getDate(){
        return dateQuery;
    }

    public String setStatus(){
        return status;
    }

    public String enquiryResponse(String enquiryID){
        System.out.println("(manager) Enter response:");
            String enquiryResponse = "Thank you for your feedback. We have recieved criticism for this video embed as well, so we will fix this in the near future.";
            System.out.println("(manager) Response has been sent to the user.\n");
        return enquiryResponse;
    }

}
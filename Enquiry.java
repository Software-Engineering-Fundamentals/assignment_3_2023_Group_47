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

}
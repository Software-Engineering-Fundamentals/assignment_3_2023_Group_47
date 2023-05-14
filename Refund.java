import java.time.LocalDate;

public class Refund {
    String mode;
    double amount;
    // date is set to the time when an instance of Refund is generated.
    LocalDate date;

    // Constructor
    public Refund(String refMode, double refAmount, LocalDate refDate){
        mode = refMode;
        amount = refAmount;
        date = refDate;
    }
}

import java.time.LocalDate;

public class Refund {
    String mode;
    double amount;
    LocalDate date;
    public Refund(String refMode, double refAmount, LocalDate refDate){
        mode = refMode;
        amount = refAmount;
        date = refDate;
    }
}

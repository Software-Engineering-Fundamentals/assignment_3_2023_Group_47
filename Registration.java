import java.time.LocalDate;

public class Registration {
    LocalDate dateStart;
    String status;
    LocalDate dateFinish;
    public Registration(LocalDate regStart, LocalDate regFinish, String regStatus){
        dateStart = regStart;
        dateFinish = regFinish;
        status = regStatus;
    }
}
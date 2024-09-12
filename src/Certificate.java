import java.math.BigDecimal;
import java.time.LocalDate;

public class Certificate extends Account implements AccountType{
    LocalDate maturityDate;

    public Certificate(int accountNumber, String longName, BigDecimal interestRate, BigDecimal balance, LocalDate openDate, LocalDate maturityDate, String phoneNumber, String emailAddress) {
        super(accountNumber, longName, interestRate, balance, openDate, phoneNumber, emailAddress);
        this.maturityDate = maturityDate;
    }
    public void displayMaturity() {
        displaySummary();
        System.out.println("Maturity Date: " + maturityDate);
    }

    @Override public void accountType() {
        System.out.println("Account Type: Certificate of Deposit");
    }

    @Override public void term() {
        displaySummary();
        System.out.println("Fixed Term: Yes");
    }
}

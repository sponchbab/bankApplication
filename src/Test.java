import java.math.BigDecimal;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Instantiate the Account class
        Account myAccount = new Account(
                123456, // accountNumber
                "John Doe",          // longName
                new BigDecimal("2.5"), // interestRate
                new BigDecimal("5000.75"), // balance
                LocalDate.of(2020, 1, 15), // openDate
                "123-555-1234",  // phoneNumber
                "johndoe@example.com" // emailAddress
        );

        // summary
        myAccount.displaySummary();

        // contact info
        myAccount.getContact();
    }
}
import java.math.BigDecimal;
import java.time.LocalDate;

public class TestCertificate {
    public static void main(String[] args) {
        Certificate certificate = new Certificate(123,
                "John Doe", // longname
                new BigDecimal("7.5"), // interest rate
                new BigDecimal("22500"), // balance
                LocalDate.of(2020, 1, 15), // open date
                LocalDate.of(2025, 1, 15), // maturity date
                "123-456-7890", // phone
                "john.doe@example.com"); // email
                certificate.displayMaturity();
                certificate.accountType();
                certificate.term();
                certificate.printProperties();
    }
}

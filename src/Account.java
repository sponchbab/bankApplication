import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
    // properties
    private int accountNumber;
    private String longName;
    private BigDecimal interestRate;
    private BigDecimal balance;
    private LocalDate openDate;
    private String phoneNumber;
    private String emailAddress;

    //constructor
    public Account(int accountNumber, String longName, BigDecimal interestRate, BigDecimal balance, LocalDate openDate, String phoneNumber, String emailAddress) {
        this.accountNumber = accountNumber;
        this.longName = longName;
        this.interestRate = interestRate;
        this.balance = balance;
        this.openDate = openDate;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //method 1 get summary
    public void displaySummary() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + longName);
        System.out.println("Current Interest Rate: " + interestRate);
        System.out.println("Current Balance: " + balance);
        System.out.println("Account Open Date: " + openDate);
    }

    public void getContact() {
        System.out.println("Account Holder:" + longName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
    }
    public void printProperties() {
        Class<?> clazz = this.getClass();
        System.out.println("Class Name: " + clazz.getName());

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);  // Allow access to private fields
            try {
                Object value = field.get(this);
                System.out.println(field.getName() + " = " + value);
            } catch (IllegalAccessException e) {
                System.out.println("Could not access field: " + field.getName());
            }
        }
    }
}
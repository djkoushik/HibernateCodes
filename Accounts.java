import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts
{
    @Id
    private String accountNumber = "11111111111";
    private String accountType ;
    private String accountName;
    private double accountBalance;

    public String getAccountNumber() {        return accountNumber; }

    public void setAccountNumber(String accountNumber) {  this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }

    public void setAccountType(String accountType) {  this.accountType = accountType; }

    public String getAccountName() {        return accountName; }

    public void setAccountName(String accountName) {        this.accountName = accountName; }

    public double getAccountBalance() {        return accountBalance; }

    public void setAccountBalance(double accountBalance) {        this.accountBalance = accountBalance; }
}

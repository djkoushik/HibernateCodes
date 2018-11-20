import javax.persistence.*;
import java.util.Set;

@Entity
public class SBIBank {
    @Id
    private String bankCode="hero";
    private String bankBranch;
    private int numberOfAccounts;
    private String bankContact;
    private String bankManger;
    private String bankType;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public String getBankContact() {
        return bankContact;
    }

    public void setBankContact(String bankContact) {
        this.bankContact = bankContact;
    }

    public String getBankManger() {
        return bankManger;
    }

    public void setBankManger(String bankManger) {
        this.bankManger = bankManger;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Accounts> accounts;

    public Set<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Accounts> accounts) {
        this.accounts = accounts;
    }
}

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Perosn
{
    @Id
    private String paymentType ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<CreditCard> creditCards = null;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Wallets> wallets = null;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<NetBannking> netBannkings = null;

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Set<Wallets> getWallets() {
        return wallets;
    }

    public void setWallets(Set<Wallets> wallets) {
        this.wallets = wallets;
    }

    public Set<NetBannking> getNetBannkings() {
        return netBannkings;
    }

    public void setNetBannkings(Set<NetBannking> netBannkings) {
        this.netBannkings = netBannkings;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


}

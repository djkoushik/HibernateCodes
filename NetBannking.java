import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NetBannking
{
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    private String userId;
    private String password;
}

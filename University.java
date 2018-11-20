import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
public class University
{
    @Id
    private String city;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Degree> degrees;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Degree> getDepartments() {
        return degrees;
    }

    public void setDepartments(Set<Degree> departments) {
        this.degrees = departments;
    }
}


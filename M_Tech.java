import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class M_Tech
{
    @Id
    private String collegeContact;
    private String collegeName;
    private String collegeId;
    private String collegePrincipal;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Colleges> colleges;

    public Set<Colleges> getColleges() {
        return colleges;
    }

    public void setColleges(Set<Colleges> colleges) {
        this.colleges = colleges;
    }

    public String getCollegeContact() {
        return collegeContact;
    }

    public void setCollegeContact(String collegeContact) {
        this.collegeContact = collegeContact;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegePrincipal() {
        return collegePrincipal;
    }

    public void setCollegePrincipal(String collegePrincipal) {
        this.collegePrincipal = collegePrincipal;
    }
}

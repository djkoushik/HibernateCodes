import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
public class B_Tech
{
    private String collegeName;
    @Id
    private String collegeId;

    private String collegeContact;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Colleges> colleges ;

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

    public String getCollegeContact() {
        return collegeContact;
    }

    public void setCollegeContact(String collegeContact) {
        this.collegeContact = collegeContact;
    }

    public Set<Colleges> getColleges() {
        return colleges;
    }

    public void setColleges(Set<Colleges> colleges) {
        this.colleges = colleges;
    }
}

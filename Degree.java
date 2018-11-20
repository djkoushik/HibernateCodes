import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
public class Degree
{
    @Id
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<B_Tech> b_teches;
    @OneToMany(cascade =  CascadeType.ALL)
    private  Set<M_Tech> m_teches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<B_Tech> getB_teches() {
        return b_teches;
    }

    public void setB_teches(Set<B_Tech> b_teches) {
        this.b_teches = b_teches;
    }

    public Set<M_Tech> getM_teches() {
        return m_teches;
    }

    public void setM_teches(Set<M_Tech> m_teches) {
        this.m_teches = m_teches;
    }
}

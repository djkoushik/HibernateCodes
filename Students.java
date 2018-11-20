import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students
{
    @Id
    private String studentId;
    private String studentName;
    private String studentCaste;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCaste() {
        return studentCaste;
    }

    public void setStudentCaste(String studentCaste) {
        this.studentCaste = studentCaste;
    }
}

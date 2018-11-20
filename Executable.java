import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.LinkedHashSet;
import java.util.Set;

public class Executable
{
    public static void main(String argv[])
    {
        Session session = new Configuration().configure("Koushik.xml").buildSessionFactory().openSession();

        Faculty faculty = new Faculty();
        faculty.setFacultyId("kakashi@123");
        faculty.setFacultyMobile("8462131323");
        faculty.setFacultyName("Kakashi_Sensei");
        Faculty mfaculty1 = new Faculty();
        mfaculty1.setFacultyId("Gayi@456");
        mfaculty1.setFacultyName("Gayi");
        mfaculty1.setFacultyMobile("461313213231");
        Set<Faculty> faculties = new LinkedHashSet<>();
        faculties.add(faculty);
        Set<Faculty> mfaculties = new LinkedHashSet<>();
        mfaculties.add(mfaculty1);


        Students students = new Students();
        students.setStudentId("name@777");
        students.setStudentCaste("Uzumakhi");
        students.setStudentName("Hinata");
        Students mstudents = new Students();
        mstudents.setStudentId("surname-5113");
        mstudents.setStudentName("Sasuke");
        mstudents.setStudentCaste("Uchiha");
        Set<Students> students1 = new LinkedHashSet<>();
        students1.add(students);
        Set<Students> mstudents2 = new LinkedHashSet<>();
        mstudents2.add(mstudents);


        Colleges colleges = new Colleges();
        colleges.setCollegeName("Narayana");
        colleges.setStudents(students1);
        colleges.setFaculty(faculties);
        Colleges mcolleges = new Colleges();
        mcolleges.setFaculty(mfaculties);
        mcolleges.setStudents(mstudents2);
        mcolleges.setCollegeName("Mona_College");
        Set<Colleges> bcolleges = new LinkedHashSet<>();
        bcolleges.add(colleges);
        Set<Colleges> mcoll = new LinkedHashSet<>();
        mcoll.add(mcolleges);

        M_Tech m_tech = new M_Tech();
        m_tech.setColleges(mcoll);
        m_tech.setCollegePrincipal("Mounika");
        m_tech.setCollegeContact("4654645131");
        m_tech.setCollegeId("Mona@7575");
        m_tech.setCollegeName("Mounika Engg college");
        Set<M_Tech> mset = new LinkedHashSet<>();
        mset.add(m_tech);

        B_Tech b_tech = new B_Tech();
        b_tech.setColleges(bcolleges);
        b_tech.setCollegeName("Priya_Enginnering_College");
        b_tech.setCollegeId("Priya@415");
        b_tech.setCollegeContact("465621216546");
        Set<B_Tech> bset = new LinkedHashSet<>();
        bset.add(b_tech);

        Degree degree = new Degree();
        degree.setM_teches(mset);
        degree.setB_teches(bset);
        degree.setName("Engineering");
        Set<Degree> degreeSet = new LinkedHashSet<>();
        degreeSet.add(degree);

        University university = new University();
        university.setCity("Hyderabad");
        university.setDepartments(degreeSet);

        session.save(university);
        session.beginTransaction().commit();
        session.close();
    }
}
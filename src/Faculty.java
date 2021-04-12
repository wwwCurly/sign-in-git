import java.util.Date;

public class Faculty extends Employee{
    private Date officeHour;
    private String grade;

    public Faculty(String name, String address, int phoneNumber, String email, String office, double salary, Date officeHour, String grade) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHour = officeHour;
        this.grade = grade;
    }

    public Date getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(Date officeHour) {
        this.officeHour = officeHour;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHour=" + officeHour +
                ", grade='" + grade + '\'' +
                '}';
    }
}

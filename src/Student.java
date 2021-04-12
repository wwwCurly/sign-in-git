public class Student extends Person{
    public static final String FRESHER = "FRESHER";
    public static final String SOPOMORE = "SOPOMORE";
    public static final String JUNIOR = "JUNIOR";
    public static final String SENIOR = "SENIOR";
    private String status;

    public Student(String name, String address, int phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status='" + status + '\'' +
                '}';
    }
}

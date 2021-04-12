public class Staff extends Employee{
    private String position;

    public Staff(String name, String address, int phoneNumber, String email, String office, double salary, String position) {
        super(name, address, phoneNumber, email, office, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "position='" + position + '\'' +
                '}';
    }
}

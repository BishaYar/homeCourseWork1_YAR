public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int numDepart;
    private int salary;
    private int id;

    public static int idn = 0;

    public Employee(String lastName, String firstName, String middleName, int numDepart, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.numDepart = numDepart;
        this.salary = salary;
        this.id = idn;
        idn++;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getMiddleName() {
        return middleName;
    }

    int getNumDepart() {
        return numDepart;
    }

    int getSalary() {
        return salary;
    }

    int getId() {
        return id;
    }

    void setNumDepart(int numDepart) {
        this.numDepart = numDepart;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    public void printShortInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName + ", зарплата: " + salary);
    }

    @Override
    public boolean equals(Object Obj) {
        if (this == Obj) return true;

        if (Obj == null || getClass() != Obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) Obj;

        return this.salary == employee.salary;
    }

    @Override
    public String toString() {
        return "id: " + id + ", отдел: " + numDepart + ",\nФИО: " + lastName + " " + firstName + " " + middleName + ", зарплата: " + salary;
    }
}

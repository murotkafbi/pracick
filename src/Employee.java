public class Employee {
    private static int counterId = 1;

    private final int id;
    private final String fullName;
    private int departmentId;
    private int salary;

    public Employee(String fullName, int departmentId, int salary) {
        this.id = counterId++;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
        "id: %d,ФИО: %s, ЗП: %d,№ Отдела: %d",
                id,
                fullName,
                salary,
                departmentId
        );
    }

}

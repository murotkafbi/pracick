import java.util.Random;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        fillEmployees();
        printFullInfo();
        System.out.println("Сумма ЗП: " + totalSalaries());
        System.out.println("Сотрудник с мин ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Среднее ЗП: " + findAverageSalary());
        printFullNameInfo();
    }

    private static void fillEmployees() {
        Random random = new Random();
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = new Employee(
                    "Сотрудник " + (i + 1),
                    random.nextInt(1, 6),
                    random.nextInt(45_000, 90_000)
            );
        }

    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();

        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static double findAverageSalary(){
        return totalSalaries() / (double) EMPLOYEES.length;

}
private static void  printFullNameInfo() {
        for (Employee employee: EMPLOYEES){
            System.out.println(employee.getFullName());
        }
}
}
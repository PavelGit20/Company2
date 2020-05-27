import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Company company = new Company();
        int sizeListEmployees = company.countAllEmployees();
        int hiredOperators = 180;
        int hiredManagers = 80;
        int hiredTopManagers = 10;

        for (int i = 0; i < hiredOperators; i++) {
            employees.add(new Operator());
        }
        for (int i = 0; i < hiredManagers; i++) {
            employees.add(new Manager());
        }
        for (int i = 0; i < hiredTopManagers; i++) {
            employees.add(new TopManager(company));
        }
        company.hireAll(employees);
        System.out.println("список состоящий из 10-15 самых высоких");
        printSalaryStaff(company.getTopSalaryStaff(15));
        System.out.println("список из 30 самых низких зарплат");
        printSalaryStaff(company.getLowestSalaryStaff(30));

        System.out.println("Увольнение 50% сотрудников");
        for (int i = 0; i < sizeListEmployees/2; i++) {
            company.fireBigSalary();
        }

        System.out.println("список состоящий из 10-15 самых высоких");
        printSalaryStaff(company.getTopSalaryStaff(15));
        System.out.println("список из 30 самых низких зарплат");
        printSalaryStaff(company.getLowestSalaryStaff(30));
    }
    public static void printSalaryStaff(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ") " + list.get(i));
        }
    }
}
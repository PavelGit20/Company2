import java.util.Comparator;

public class ComparatorEmp implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee) {

        return Integer.compare(employee.getMonthSalary(), employee1.getMonthSalary());
    }
}

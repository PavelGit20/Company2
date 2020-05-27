import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee e) {
        employees.add(e);
    }

    public void hireAll(List<Employee> employee) {
        employees.addAll(employee);
    }

    public void fire() {
        Random random = new Random();
        int randRemove = random.nextInt((employees.size()));
        employees.remove(randRemove);
    }

    public Employee fireBigSalary(){
        Employee employee = getTopSalaryStaff(1).get(0);
        employees.remove(employee);
        return employee;
    }

    public int getIncome() {
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof IncomeReceivable) {
                sum += ((IncomeReceivable) employees.get(i)).getIncome();
            }
        }
        return sum;
    }

    public int countAllEmployees(){
        return employees.size();
    }

    private List<Employee> sortEmployees(Comparator<Employee> comparator, int count){
        List <Employee> list = getEmployees();
        list.sort(comparator);
        int amount = Math.min(count, list.size());
        return list.subList(0, amount);
    }

    public List<Employee> getTopSalaryStaff (int count){
        return sortEmployees(new ComparatorEmp(), count);
    }
    public List<Employee> getLowestSalaryStaff (int count){
        return sortEmployees(new ComparatorEmp().reversed(), count);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

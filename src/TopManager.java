public class TopManager implements Employee {
    private final long SALARY_MORE = 10000000;
    private final double BONUS_TOP_MANAGER = 1.5;
    private int operatorTopManager = 25000 + (int)(Math.random() * 20000);

    Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        int salaryTopManager;
        if (company.getIncome() > SALARY_MORE) {
            salaryTopManager = (int) (operatorTopManager + (operatorTopManager * BONUS_TOP_MANAGER));
        } else {
            salaryTopManager = operatorTopManager;
        }
        return salaryTopManager;
    }

    @Override
    public String toString(){
        return getMonthSalary() + " " +  this.getClass().getName();
    }
}

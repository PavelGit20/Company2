public class Manager implements Employee, IncomeReceivable {
    private final double BONUS_MANAGER = 0.05;
    private int operatorManager = 25000 + (int)(Math.random() * 20000);
    private int getIncomeManager = 120000 + (int)(Math.random() * 20000);

    @Override
    public int getMonthSalary() {
        return (int) (operatorManager + (getIncome() * BONUS_MANAGER));
    }

    @Override
    public int getIncome() {
        return getIncomeManager;
    }

    @Override
    public String toString(){
        return getMonthSalary() + " " +  this.getClass().getName();
    }
}
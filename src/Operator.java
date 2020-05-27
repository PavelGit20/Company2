public class Operator implements Employee {
    private int operatorSalary = 30000 + (int)(Math.random() * 20000);

    @Override
    public int getMonthSalary() {
        return operatorSalary;
    }

    @Override
    public String toString(){
        return getMonthSalary() + " " +  this.getClass().getName();
    }
}

package Staff;

public abstract  class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getNINumber() {
        return NINumber;
    }
    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

    public double payBonus() {
        return 0.01 * this.salary;
    }


}

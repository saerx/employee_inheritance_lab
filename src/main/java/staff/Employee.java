package staff;


public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name == null) {
            return false;
        } else {
            this.name = name;
            return true;
        }

    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean raiseSalary(double raise) {
        if (raise <=0) {
            return false;
        } else {
            this.setSalary(this.salary * (1 + raise));
            return true;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}



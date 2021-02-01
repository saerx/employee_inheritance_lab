package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, int niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

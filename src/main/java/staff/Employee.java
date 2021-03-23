package staff;

public abstract class Employee {
    private String name;
    private String nin;
    Double salary;

    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNin() {
        return nin;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (this.name != "");
        this.name = name;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(){
        return (salary += 100);
    }

    public double payBonus(){
        return (salary*0.01);
    }
}



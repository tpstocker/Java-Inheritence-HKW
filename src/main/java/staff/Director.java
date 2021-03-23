package staff;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String nin, double salary, String deptName, double budget) {
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public double payBonus(){
        return (salary*0.02);
    }
}
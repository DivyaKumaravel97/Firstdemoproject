
public class Employee {

	private String id;
    private String name;
    private String department;
    private double salary;
    private String gender;

    public Employee(String id, String name, String department, double salary,String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByEmp {

	public static void main(String[] args) {
		//Write a Java 8 stream code to group employees by department and get the highest salary per department. with 2 classes
		 List<Employee> employeeList = Arrays.asList(
	                new Employee("1", "John", "IT", 50000,"Male"),
	                new Employee("2", "Amit", "IT", 65000,"Male"),
	                new Employee("3", "Sara", "HR", 45000,"Female"),
	                new Employee("4", "David", "HR", 55000,"Male"),
	                new Employee("5", "Ravi", "Finance", 60000,"Male"),
	                new Employee("6", "Neha", "Finance", 75000,"Female")
	        );

	        // Group by dept → highest salary
	        Map<String, Employee> highestSalaryByDept =
	    	        employeeList.stream()
	                        .collect(Collectors.groupingBy(
	                                Employee::getDepartment,
	                                Collectors.collectingAndThen(
	                                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
	                                        Optional::get
	                                )
	                        ));

	      highestSalaryByDept.forEach((dept, emp) ->
	                System.out.println(dept + " -> " + emp)
	        );
	        
	        // List of all employee who joined in year 2025 (year to be extracted from employee id i.e., 1st 4 characters)
	       /* employeeList
	        .stream()
	        .filter(employee ->  employee.getId() != null && employee.getId().length() >= 4 && employee.getId().substring(0, 4).equals("2025"))
	        .forEach(System.out::println);*/
	        
	        //Sort employees by salary (Employee::getSalary)
            List<Employee>SortbyEMpsalary=employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	         System.out.println(SortbyEMpsalary);
	         
	         //Group employees by department
//Group employees by department& employee count department wise
	         
	         Map<String,Long>departlist=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	         departlist.forEach((dept,count)->System.out.println(dept+" : "+count));
	
	}

}

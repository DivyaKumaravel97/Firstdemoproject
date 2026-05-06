package com.example.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
                new Employee("1", "John", "IT", 50000,"Male"),
                new Employee("2", "Amit", "IT", 65000,"Male"),
                new Employee("3", "Sara", "HR", 45000,"Female"),
                new Employee("4", "David", "HR", 55000,"Male"),
                new Employee("5", "Ravi", "Finance", 60000,"Male"),
                new Employee("6", "Neha", "Finance", 75000,"Female")
        );
		//sort emp name&Salary
		List<Employee>sortedEmployees=employeeList.stream().sorted(Comparator.comparing(Employee::getName).
				thenComparing(Employee::getSalary)).collect(Collectors.toList());
		sortedEmployees.forEach(System.out::println);
		
		//Gender wise Employees
		Map<Boolean, List<Employee>> result =
		        employeeList.stream()
		                    .collect(Collectors.partitioningBy(
		                        e -> "Male".equalsIgnoreCase(e.getGender())
		                    ));

		List<Employee> males = result.get(true);
		List<Employee> females = result.get(false);
		
		System.out.println(males);
		System.out.println(females);
		
		//sort the empname & get 2end  highest salary


}
}
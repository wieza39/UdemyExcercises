package udemy.streams;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Novac", 26, "Accountant", 2, 3500, "New York"));
        employees.add(new Employee("John", "Crag", 50, "Manager", 15, 6500, "Chicago"));
        employees.add(new Employee("Ann", "Middle", 35, "CEO", 11, 10500, "Chicago"));
        employees.add(new Employee("Mark", "Sup", 29, "Driver", 1, 3000, "Los Angeles"));

        System.out.println("Collect & filter usage: ");
        List<Employee> employeeList = employees.stream()
                .filter(e -> e.getAge() > 30)
                .filter( e -> e.getSalary() > 4000)
                .filter( e -> e.getCity() == "Chicago")
                .collect(Collectors.toList());

        ArrayList<Employee> collectList = new ArrayList<>(employeeList);
        collectList.forEach( collectionTest -> System.out.println(collectionTest));

        System.out.println("\nSet usage: ");
        List<Integer> arr = Arrays.asList(5,2,6,2,4,4,98,6,2,3,7,6,7,1,3,8,5);
        Set<Integer> uniqueNumbers = arr.stream()
                .filter( n -> n > 0 && n < 7)
                .collect(Collectors.toSet());
        System.out.println(uniqueNumbers);

        System.out.println("\nSalaries sum: ");
        int totalSalary = employees.stream().collect(Collectors.summingInt( s -> s.getSalary()));
        System.out.println(totalSalary);


        System.out.println("\ntoMap() example:");
        Map<String, Integer> salaryMap = employees.stream()
                .collect(Collectors.toMap( map -> map.getRole(), map -> map.getSalary()));
        System.out.println(salaryMap);

        System.out.println("\nSearch value by key 'CEO': ");
        Integer roleSalary = salaryMap.get("CEO");
        System.out.println(roleSalary);

        System.out.println("\nmap().");
        List<Integer> salaries = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(salaries);

        System.out.println("\nmin() & max()");
        Employee minSalary
    }
}

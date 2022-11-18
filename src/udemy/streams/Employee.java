package udemy.streams;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private String role;
    private int experienceInYears;
    private int salary;
    private String city;

    public Employee(String name, String surname, int age, String role, int experienceInYears, int salary, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
        this.experienceInYears = experienceInYears;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}

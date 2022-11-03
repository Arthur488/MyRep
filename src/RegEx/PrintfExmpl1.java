package RegEx;

public class PrintfExmpl1 {

    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-10s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary*(1+employee.bonusPct));
    }

    public static void main(String[] args) {
        //System.out.printf("string -virovnat po levomy kraju" + "nado okruglit do desyatix", "privet", "3,134");
        Employee employee1 = new Employee(1, "Ivan", "Petrov", 1240, 0.15);
        Employee employee2 = new Employee(22, "Kolya", "Sidorov", 450, 0.6);
        Employee employee3 = new Employee(23, "Petya", "Ivanov", 3780, 0.1);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);


        String newString = String.format("%03d \t %-10s \t %-12s \t %,.1f ", 1, "Ivan", "Petrov", 1240* 0.15);
        System.out.println(newString);
    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}

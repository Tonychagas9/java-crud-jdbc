import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDAO.initializeDatabase();

            EmployeeDAO employeeDAO = new EmployeeDAO();

            Employee employee1 = new Employee(0, "John", "abc@gmail.com", "USA");
            Employee employee2 = new Employee(1, "John D.", "emp@gmail.com", "London");

            employeeDAO.insertEmployee(employee1);
            employeeDAO.insertEmployee(employee2);
            System.out.println(employeeDAO.getAllEmployees());
            System.out.println();

            employeeDAO.updateEmployeeById(1, "John Doee", "emp.updated@gmail.com", "Porto");
            System.out.println("After update:");
            employeeDAO.printEmployee();

            employeeDAO.updateEmployeeByName("John D.", "Jane Doe", "jane.doe@gmail.com", "Porto");
            employeeDAO.printEmployee();

            employeeDAO.updateEmployeeByEmail("emp@gmail.com", "Jane Doe", "emp.new@gmail.com", "Porto");
            employeeDAO.printEmployee();

            employeeDAO.deleteEmployee(2);

            System.out.println("Antes excluir:");
            employeeDAO.printEmployee();

            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(0, "Joao Carlos", "joa@example.com", "Portugal"));
            employees.add(new Employee(0, "David Jose", "david@example.com", "Brasil"));
            employees.add(new Employee(0, "Laura Freitas", "laura@example.com", "Brasil"));
            employees.add(new Employee(0, "Hugo Matheus", "hugo@example.com", "Portugal"));

            employeeDAO.batchInsertEmployees(employees);
            employeeDAO.printEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
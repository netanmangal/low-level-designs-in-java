package ProxyPattern;

public class EmployeeCRUD implements EmployeeCRUDInterface {

    @Override
    public void create(String auth, Employee employee) {
        System.out.println("Employee created.");
    }

    @Override
    public Employee read(String auth, int emp_id) {
        return new Employee(
                Integer.toString(emp_id),
                "32",
                Employee.Gender.MALE
        );
    }

    @Override
    public void update(String auth, int emp_id, Employee employee) {
        System.out.println("Employee with id : " + emp_id + " : has been updated.");

    }

    @Override
    public void delete(String auth, int emp_id) {
        System.out.println("Employee with id : " + emp_id + " : deleted.");
    }

}
